package com.robotnec.algorithm.sorting

import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.StringSpec

/**
 * Created by kyryloz
 */
class SortingTest : StringSpec() {

    val input = intArrayOf(2, 0, 10, 12, 100, 42, 57, 40, 6, 7, 11, 1, 5, 67)

    init {
        val output = input.clone()
        output.sort()

        "should sort" {
            val sortAlgorithms = arrayOf(
                    BubbleSort()
            )
            sortAlgorithms.forEach {
                it.sort(input) shouldBe output
            }
        }
    }
}