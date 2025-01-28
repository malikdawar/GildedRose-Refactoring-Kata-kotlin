package com.gildedrose.data.usecases

import com.gildedrose.data.models.Item

/**
 * ItemBehavior.kt, an interface that represents the behaviour of items, imp is in the classes that imp it
 */
interface ItemBehavior {
    fun update(item: Item)
}