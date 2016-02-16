package com.tothenew.ams

class UserItem {
    User user
    Ticket ticket
    Date dateOfReciept
    Date dateOfReturn

    User providerAdmin
    User recieverAdmin

    Item item

    static constraints = {
    }
}
