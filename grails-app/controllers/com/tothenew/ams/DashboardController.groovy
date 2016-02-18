package com.tothenew.ams

import grails.plugin.springsecurity.annotation.Secured
import grails.plugin.springsecurity.SpringSecurityService
import grails.converters.JSON
import com.tothenew.ams.DTO.UserDetailsDTO

@Secured(['ROLE_USER'])
class DashboardController {
    SpringSecurityService springSecurityService

    def index() {

        User u=User.get(springSecurityService.principal.id)
        println "<<<<<<<<<<<<<<<<<<<<<<user:${u}"


    }

    def fetchLoggedInUser() {
        println "<<<<<<<<<${params}"
        def principal = User.read(springSecurityService.principal.id)
        println "<<<<<<<<<<<<<<<<user:${principal}"
        UserDetailsDTO userDetailsDTO = new UserDetailsDTO(username: principal.getUserName(), photo: principal.photo,
                email: principal.email, id: principal.id,
                authority: principal.authorities*.authority.toString())
        println "<<<<<<<<<<<${userDetailsDTO}"
        render([user: userDetailsDTO] as JSON)
    }

    @Secured(['permitAll'])
    def failure(){

        render "Failed"
    }

}
