package com.tothenew.ams.constants


public enum TicketStatus {
    PENDING("PENDING"),
    SERVED("SERVED"),
    CANCELLED("CANCELLED"),
    PROCESSING("PROCESSING")

    String name

    TicketStatus(String s) {
        this.name = s
    }
    public String toString()
    { return this.name }
}
