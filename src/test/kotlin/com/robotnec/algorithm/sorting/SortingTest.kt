package com.robotnec.algorithm.sorting

import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.StringSpec
import java.util.*

/**
 * Created by kyryloz
 */
class SortingTest : StringSpec() {

    companion object {
        const val N_SIZE = 100
    }

    val input: IntArray
    val output: IntArray

    init {
        input = (0..N_SIZE).toList()
                .apply { Collections.shuffle(this) }
                .toIntArray()
        output = input.clone()
        output.sort()

        "Bubble sort" {
            test(BubbleSort(), output)
        }

        "Insertion sort" {
            test(InsertionSort(), output)
        }
    }

    private fun test(sortAlgorithm: Sorting, output: IntArray) {
        sortAlgorithm.sort(input.clone()) shouldBe output
    }
}