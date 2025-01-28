package com.gildedrose.data.factory

import com.gildedrose.data.models.Item

object DataStore {
    fun getItems(): List<Item> {
        return listOf(
            Item("+5 Dexterity Vest", 10, 20),
            Item(ItemCategory.AGED_BRIE.itemName, 2, 0),
            Item("Elixir of the Mongoose", 5, 7),
            Item(ItemCategory.SULFURAS_HAND_RAGNAROS.itemName, 0, 80),
            Item(ItemCategory.SULFURAS_HAND_RAGNAROS.itemName, -1, 80),
            Item(ItemCategory.BACKSTAGE_PASSES_CONCERT.itemName, 11, 20),
            Item(ItemCategory.BACKSTAGE_PASSES_CONCERT.itemName, 7, 49),
            Item(ItemCategory.BACKSTAGE_PASSES_CONCERT.itemName, 5, 49),
            Item(ItemCategory.CONJURED_MANA_CAKE.itemName, 3, 6),
        )
    }
}