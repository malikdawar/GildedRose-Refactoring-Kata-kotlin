package com.gildedrose.data.usecases

import com.gildedrose.data.models.Item

class AgedBrieBehavior : ItemBehavior {
    override fun update(item: Item) {
        item.sellIn--
        if (item.quality < 50) item.quality++
        if (item.sellIn < 0 && item.quality < 50) item.quality++
    }
}