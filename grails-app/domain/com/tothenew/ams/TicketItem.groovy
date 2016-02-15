package com.tothenew.ams

class TicketItem {


    static belongsTo = [ticket:Ticket,item:Item]
    static constraints = {
    }
}
