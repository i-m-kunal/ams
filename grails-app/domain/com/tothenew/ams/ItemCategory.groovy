package com.tothenew.ams

class ItemCategory {
    String name

    static hasMany = [items: Item]
    static constraints = {
    }
}
