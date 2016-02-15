package com.tothenew.ams

import grails.plugin.springsecurity.annotation.Secured
import grails.plugin.springsecurity.SpringSecurityService

class DashboardController {
    SpringSecurityService springSecurityService
    @Secured(['ROLE_ADMIN'])
    def index() {

        User u=User.get(springSecurityService.principal.id)
        render "Successfully Login"+u
    }

    @Secured(['permitAll'])
    def failure(){

        render "Failed"
    }

}
