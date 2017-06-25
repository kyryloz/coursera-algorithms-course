package com.robotnec.algorithm.sorting

/**
 * Created by kyryloz
 */
class BubbleSort: Sorting {
    override fun sort(input: IntArray): IntArray {
        do {
            var swapped = false
            input.forEachIndexed { index, value ->
                if (index == input.size - 1) {
                    return@forEachIndexed
                }
                val second = input[index + 1]
                if (value > second) {
                    input[index] = second
                    input[index + 1] = value
                    swapped = true
                }
            }
        } while (swapped)
        return input
    }
}
