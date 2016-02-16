package com.tothenew.ams

import grails.plugin.springsecurity.annotation.Secured
import grails.plugin.springsecurity.SpringSecurityService

class DashboardController {
    SpringSecurityService springSecurityService
    @Secured(['ROLE_USER'])
    def index() {

        User u=User.get(springSecurityService.principal.id)

    }

    @Secured(['permitAll'])
    def failure(){

        render "Failed"
    }

}
