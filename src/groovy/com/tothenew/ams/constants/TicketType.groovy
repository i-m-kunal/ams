package com.tothenew.ams.constants

public enum TicketType {
    ISSUE_REQUEST("ISSUE_REQUEST"),
    CHANGE_REQUEST("CHANGE_REQUEST"),
    RETURN_REQUEST("RETURN_REQUEST"),
    OTHER_REQUEST("OTHER_REQUEST")

    String name

    TicketType(String s) {
        this.name = s
    }
    public String toString()
    { return this.name }
}