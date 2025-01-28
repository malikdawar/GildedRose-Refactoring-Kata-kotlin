package com.gildedrose

import com.gildedrose.presentation.GildedRose
import com.gildedrose.data.models.Item
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class GildedRoseTest {

    @Test
    fun `normal item quality decreases by 1`() {
        val items = listOf(Item("+5 Dexterity Vest", 10, 20))
        val app = GildedRose(items)

        app.updateQuality()

        assertEquals(9, items[0].sellIn)
        assertEquals(19, items[0].quality)
    }

    @Test
    fun `normal item quality decreases twice as fast after sell-by date`() {
        val items = listOf(Item("+5 Dexterity Vest", 0, 20))
        val app = GildedRose(items)

        app.updateQuality()

        assertEquals(-1, items[0].sellIn)
        assertEquals(18, items[0].quality)
    }

    @Test
    fun `normal item quality never goes below 0`() {
        val items = listOf(Item("+5 Dexterity Vest", 10, 0))
        val app = GildedRose(items)

        app.updateQuality()

        assertEquals(9, items[0].sellIn)
        assertEquals(0, items[0].quality)
    }

    @Test
    fun `aged brie quality increases by 1`() {
        val items = listOf(Item("Aged Brie", 10, 20))
        val app = GildedRose(items)

        app.updateQuality()

        assertEquals(9, items[0].sellIn)
        assertEquals(21, items[0].quality)
    }

    @Test
    fun `aged brie quality increases twice as fast after sell-by date`() {
        val items = listOf(Item("Aged Brie", 0, 20))
        val app = GildedRose(items)

        app.updateQuality()

        assertEquals(-1, items[0].sellIn)
        assertEquals(22, items[0].quality)
    }

    @Test
    fun `aged brie quality never exceeds 50`() {
        val items = listOf(Item("Aged Brie", 10, 50))
        val app = GildedRose(items)

        app.updateQuality()

        assertEquals(9, items[0].sellIn)
        assertEquals(50, items[0].quality)
    }

    @Test
    fun `sulfuras quality and sell-in never change`() {
        val items = listOf(Item("Sulfuras, Hand of Ragnaros", 10, 80))
        val app = GildedRose(items)

        app.updateQuality()

        assertEquals(10, items[0].sellIn)
        assertEquals(80, items[0].quality)
    }

    @Test
    fun `backstage pass quality increases by 1 when sell-in is more than 10`() {
        val items = listOf(Item("Backstage passes to a TAFKAL80ETC concert", 15, 20))
        val app = GildedRose(items)

        app.updateQuality()

        assertEquals(14, items[0].sellIn)
        assertEquals(21, items[0].quality)
    }

    @Test
    fun `backstage pass quality increases by 2 when sell-in is 10 or less`() {
        val items = listOf(Item("Backstage passes to a TAFKAL80ETC concert", 10, 20))
        val app = GildedRose(items)

        app.updateQuality()

        assertEquals(9, items[0].sellIn)
        assertEquals(22, items[0].quality)
    }

    @Test
    fun `backstage pass quality increases by 3 when sell-in is 5 or less`() {
        val items = listOf(Item("Backstage passes to a TAFKAL80ETC concert", 5, 20))
        val app = GildedRose(items)

        app.updateQuality()

        assertEquals(4, items[0].sellIn)
        assertEquals(23, items[0].quality)
    }

    @Test
    fun `backstage pass quality drops to 0 after concert`() {
        val items = listOf(Item("Backstage passes to a TAFKAL80ETC concert", 0, 20))
        val app = GildedRose(items)

        app.updateQuality()

        assertEquals(-1, items[0].sellIn)
        assertEquals(0, items[0].quality)
    }

    @Test
    fun `conjured item quality decreases twice as fast`() {
        val items = listOf(Item("Conjured Mana Cake", 10, 20))
        val app = GildedRose(items)

        app.updateQuality()

        assertEquals(9, items[0].sellIn)
        assertEquals(18, items[0].quality)
    }

    @Test
    fun `conjured item quality decreases four times as fast after sell-by date`() {
        val items = listOf(Item("Conjured Mana Cake", 0, 20))
        val app = GildedRose(items)

        app.updateQuality()

        assertEquals(-1, items[0].sellIn)
        assertEquals(16, items[0].quality)
    }

    @Test
    fun `conjured item quality never goes below 0`() {
        val items = listOf(Item("Conjured Mana Cake", 10, 0))
        val app = GildedRose(items)

        app.updateQuality()

        assertEquals(9, items[0].sellIn)
        assertEquals(0, items[0].quality)
    }
}

