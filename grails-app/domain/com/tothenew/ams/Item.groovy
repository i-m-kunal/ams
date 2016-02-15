package com.tothenew.ams
import com.tothenew.ams.constants.ItemStatus

class Item {
    String name
    String serialNo
    ItemStatus  itemStatus


    static belongsTo = [itemCategory: ItemCategory]
    static constraints = {
    }
}
