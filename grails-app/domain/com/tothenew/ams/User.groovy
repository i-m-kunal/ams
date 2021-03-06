package com.tothenew.ams

class User {

    transient springSecurityService

    String password
    String email
    String firstName
    String lastName
    String photo
    boolean enabled = true
    boolean accountExpired
    boolean accountLocked
    boolean passwordExpired

    OAuthID oAuthID
    static hasMany = [raisedtickets: Ticket, servedTickets: Ticket, userItems: UserItem]

    static transients = ['springSecurityService']

    static mappedBy = [raisedtickets: 'raisedBy', servedTickets: 'servedBy']
    static constraints = {
        photo url: true, nullable: true
        password blank: false
        oAuthID nullable: true


    }

    static mapping = {
        password column: '`password`'
    }

    Set<Role> getAuthorities() {
        UserRole.findAllByUser(this).collect { it.role }
    }

    def beforeInsert() {
        encodePassword()
    }

    def beforeUpdate() {
        if (isDirty('password')) {
            encodePassword()
        }
    }


    protected void encodePassword() {
        password = springSecurityService?.passwordEncoder ? springSecurityService.encodePassword(password) : password
    }

    String getUserName() {
        [firstName, lastName].findAll { it }.join(" ")
    }

}