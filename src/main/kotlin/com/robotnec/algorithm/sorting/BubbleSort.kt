package com.robotnec.algorithm.sorting

/**
 * Created by kyryloz
 */
class BubbleSort: Sorting {
    override fun sort(input: IntArray): IntArray {
        do {
            var swapped = false
            for (i in 0..input.size - 2) {
                val key = input[i]
                val next = input[i + 1]
                if (key > next) {
                    input[i] = next
                    input[i + 1] = key
                    swapped = true
                }
            }
        } while (swapped)
        return input
    }
}
