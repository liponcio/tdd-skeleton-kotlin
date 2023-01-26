package com.oocode

class RecentlyUsedList {

    private var item: String? = null

    fun isEmpty(): Boolean {
        return item == null
    }

    fun add(item: String) {
        this.item = item
    }

    fun getMostRecent(): String {
        return this.item!!
    }

}
