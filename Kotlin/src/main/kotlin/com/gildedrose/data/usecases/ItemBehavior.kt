package com.gildedrose.data.usecases

import com.gildedrose.data.models.Item

interface ItemBehavior {
    fun update(item: Item)
}