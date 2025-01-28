package com.gildedrose.data.usecases

import com.gildedrose.data.models.Item

class SulfurasBehavior : ItemBehavior {
    override fun update(item: Item) {
        // Sulfuras never changes
    }
}