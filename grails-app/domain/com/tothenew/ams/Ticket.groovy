package com.tothenew.ams
import com.tothenew.ams.constants.TicketStatus
import com.tothenew.ams.constants.TicketType

class Ticket {

    User raisedBy
    User servedBy
    TicketType ticketType
    TicketStatus ticketStatus
    Date dateCreated



    static constraints = {
    }
}
