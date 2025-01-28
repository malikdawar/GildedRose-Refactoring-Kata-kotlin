package com.gildedrose.data.usecases

import com.gildedrose.data.models.Item

class ConjuredItemBehavior : ItemBehavior {
    override fun update(item: Item) {
        item.sellIn--
        if (item.quality > 0) item.quality -= 2
        if (item.sellIn < 0 && item.quality > 0) item.quality -= 2
    }
}