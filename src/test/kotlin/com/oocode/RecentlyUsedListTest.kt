package com.oocode

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.jupiter.api.Test

internal class RecentlyUsedListTest {

//    The list should be empty when initialised.
//    ? We should be able to add things to the list.
//    ? We should be able to retrieve items from the list.
//    ? The most recent item should be first in the list.
//    ? Items in the list are unique, so duplicate insertions should be moved rather than added

    @Test
    fun `should be empty when initialised`() {
        assertThat(RecentlyUsedList().isEmpty(), equalTo(true))
    }

    @Test
    fun `should not be empty when an item has been added`() {
        val list = RecentlyUsedList()
        list.add("item1")
        assertThat(list.isEmpty(), equalTo(false))
    }
}