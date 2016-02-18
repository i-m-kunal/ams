package com.tothenew.ams.DTO


import com.tothenew.ams.constants.RoleConstants

class UserDetailsDTO {
    String username
    String photo
    String email
    String empCode
    Long id
    String firstName
    String lastName
    boolean enabled = true

    String authority
}
