package com.oocode

class RecentlyUsedList {

    private var isEmpty = true;

    fun isEmpty(): Boolean {
        return isEmpty
    }

    fun add(item: String) {
        isEmpty = false
    }

}
