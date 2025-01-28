package com.gildedrose.data.factory

/**
 * Enum class representing categories of items
 * Each category has a specific name associated with it.
 *
 * @property itemName The name of the item category as it appears in inventory.
 */
enum class ItemCategory(val itemName: String) {
    AGED_BRIE("Aged Brie"),
    SULFURAS_HAND_RAGNAROS("Sulfuras, Hand of Ragnaros"),
    BACKSTAGE_PASSES_CONCERT("Backstage passes to a TAFKAL80ETC concert"),
    CONJURED_MANA_CAKE("Conjured Mana Cake")
}