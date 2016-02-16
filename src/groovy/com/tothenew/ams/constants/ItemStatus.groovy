package com.tothenew.ams.constants

public enum ItemStatus {
    ASSIGNED("ASSIGNED"),
    AVAILABLE("AVAILABLE"),
    DESTROYED("DESTROYED")

    String name

    ItemStatus(String s) {
        this.name = s
    }

    public String toString() { return this.name }
}