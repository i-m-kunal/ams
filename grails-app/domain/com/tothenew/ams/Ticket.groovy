package com.tothenew.ams

import com.tothenew.ams.constants.TicketStatus
import com.tothenew.ams.constants.TicketType

class Ticket {

    User raisedBy
    User servedBy
    TicketType ticketType
    TicketStatus ticketStatus


    Date dateCreated
    Date lastUpdated


    static hasMany = [subTickets: Ticket]
   static belongsTo = [parentTicket: Ticket]

    static constraints = {
    }
}
