package com.gildedrose.data.models

/**
 * Item.kt represents as a DB table or data class
 * Each category has a specific name associated with it.
 *
 * @property name  name of the item
 * @property sellIn days to sell the item
 * @property quality  the actual quality of the item
 */
open class Item(var name: String, var sellIn: Int, var quality: Int) {
    override fun toString(): String {
        return this.name + ", " + this.sellIn + ", " + this.quality
    }
}