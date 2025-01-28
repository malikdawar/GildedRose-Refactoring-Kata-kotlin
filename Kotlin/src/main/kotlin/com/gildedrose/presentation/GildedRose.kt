package com.gildedrose.presentation

import com.gildedrose.data.usecases.AgedBrieBehavior
import com.gildedrose.data.usecases.BackstagePassBehavior
import com.gildedrose.data.usecases.ConjuredItemBehavior
import com.gildedrose.data.usecases.NormalItemBehavior
import com.gildedrose.data.usecases.SulfurasBehavior
import com.gildedrose.data.models.Item

class GildedRose(private var items: List<Item>) {

    private val itemBehaviors = mapOf(
        AGED_BRIE to AgedBrieBehavior(),
        SULFURAS_HAND_RAGNAROS to SulfurasBehavior(),
        BACKSTAGE_PASSES_CONCERT to BackstagePassBehavior(),
        CONJURED_MANA_CAKE to ConjuredItemBehavior()
    )

    fun updateQuality() {
        for (item in items) {
            val behavior = itemBehaviors[item.name] ?: NormalItemBehavior()
            behavior.update(item)
        }
    }

    companion object {
        const val AGED_BRIE = "Aged Brie"
        const val SULFURAS_HAND_RAGNAROS = "Sulfuras, Hand of Ragnaros"
        const val BACKSTAGE_PASSES_CONCERT = "Backstage passes to a TAFKAL80ETC concert"
        const val CONJURED_MANA_CAKE = "Conjured Mana Cake"
    }
}
