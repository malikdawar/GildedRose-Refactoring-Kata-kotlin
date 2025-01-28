package com.gildedrose.presentation

import com.gildedrose.data.factory.DataStore

fun main(args: Array<String>) {
    println("OMGHAI!")

    val items = DataStore.getItems()
    val gildedRosePresenter = GildedRose(items)

    var days = DEFAULT_DAYS
    if (args.isNotEmpty()) {
        days = Integer.parseInt(args[0]) + 1
    }

    for (day in 0 until days) {
        val sb = StringBuilder()
        sb.append("-------- day $day --------\n")
        sb.append("name, sellIn, quality\n")
        for (item in items) {
            sb.append(item).append("\n")
        }
        println(sb.toString())
        gildedRosePresenter.updateQuality()
    }
}
private const val DEFAULT_DAYS = 2


