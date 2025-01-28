package com.gildedrose.presentation

import com.gildedrose.data.factory.DataStore

/**
 * Entry point of the kotlin app.
 * This app simulates the behavior of inventory management system.
 * It uses the GildedRose class to update the quality of items over a specified number of days.
 */

/**
* The default number of days is defined by the constant DEFAULT_DAYS, but can be overridden
* by providing a command-line argument.
*/
private const val DEFAULT_DAYS = 2

/**
 * Main function that runs the program.
 *
 * @param args Command-line arguments. If a single argument is provided, it is interpreted as the number of days to simulate.
 */
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
