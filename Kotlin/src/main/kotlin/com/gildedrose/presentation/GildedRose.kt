package com.gildedrose.presentation


import com.gildedrose.data.factory.ItemCategory.AGED_BRIE
import com.gildedrose.data.factory.ItemCategory.BACKSTAGE_PASSES_CONCERT
import com.gildedrose.data.factory.ItemCategory.CONJURED_MANA_CAKE
import com.gildedrose.data.factory.ItemCategory.SULFURAS_HAND_RAGNAROS
import com.gildedrose.data.models.Item
import com.gildedrose.data.usecases.AgedBrieBehavior
import com.gildedrose.data.usecases.BackstagePassBehavior
import com.gildedrose.data.usecases.ConjuredItemBehavior
import com.gildedrose.data.usecases.NormalItemBehavior
import com.gildedrose.data.usecases.SulfurasBehavior

class GildedRose(private var items: List<Item>) {

    private val itemBehaviors = mapOf(
        AGED_BRIE.itemName to AgedBrieBehavior(),
        SULFURAS_HAND_RAGNAROS.itemName to SulfurasBehavior(),
        BACKSTAGE_PASSES_CONCERT.itemName to BackstagePassBehavior(),
        CONJURED_MANA_CAKE.itemName to ConjuredItemBehavior()
    )

    fun updateQuality() {
        for (item in items) {
            val behavior = itemBehaviors[item.name] ?: NormalItemBehavior()
            behavior.update(item)
        }
    }
}
