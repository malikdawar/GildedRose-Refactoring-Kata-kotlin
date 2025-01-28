package com.gildedrose.data.usecases

import com.gildedrose.data.models.Item

class BackstagePassBehavior : ItemBehavior {
    override fun update(item: Item) {
        item.sellIn--
        when {
            item.sellIn < 0 -> item.quality = 0
            item.sellIn <= 5 -> item.quality = (item.quality + 3).coerceAtMost(50)
            item.sellIn <= 10 -> item.quality = (item.quality + 2).coerceAtMost(50)
            else -> item.quality = (item.quality + 1).coerceAtMost(50)
        }
    }
}