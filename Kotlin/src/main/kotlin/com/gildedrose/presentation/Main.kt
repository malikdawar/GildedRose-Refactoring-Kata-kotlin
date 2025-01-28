package com.gildedrose.presentation

import com.gildedrose.data.factory.DataFactory

fun main(args: Array<String>) {
    println("OMGHAI!")

    val items = DataFactory.getItems()
    val app = GildedRose(items)

    var days = 2
    if (args.isNotEmpty()) {
        days = Integer.parseInt(args[0]) + 1
    }

    for (day in 0..<days) {
        println("-------- day $day --------")
        println("name, sellIn, quality")
        for (item in items) {
            println(item)
        }
        println()
        app.updateQuality()
    }
}
