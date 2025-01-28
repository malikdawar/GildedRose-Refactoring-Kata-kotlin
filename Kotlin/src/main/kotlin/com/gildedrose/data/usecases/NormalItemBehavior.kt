package com.gildedrose.data.usecases

import com.gildedrose.data.models.Item

/**
 * AgedBrieBehavior.kt overrides ItemBehavior
 * has the operations specifically for this category
 */
class NormalItemBehavior : ItemBehavior {
    override fun update(item: Item) {
        item.sellIn--
        if (item.quality > 0) item.quality--
        if (item.sellIn < 0 && item.quality > 0) item.quality--
    }
}