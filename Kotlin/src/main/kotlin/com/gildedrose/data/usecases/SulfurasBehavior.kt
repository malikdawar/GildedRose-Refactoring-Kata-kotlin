package com.gildedrose.data.usecases

import com.gildedrose.data.models.Item

/**
 * AgedBrieBehavior.kt overrides ItemBehavior
 * has the operations specifically for this category
 */
class SulfurasBehavior : ItemBehavior {
    override fun update(item: Item) {
        // Sulfuras never changes
    }
}