package com.robotnec.algorithm.sorting

/**
 * Created by kyryloz
 */
class SelectionSort: Sorting {
    override fun sort(input: IntArray): IntArray {
        for (i in 0..input.size - 1) {
            var biggestIndex = 0
            for (j in 1..input.size - 1 - i) {
                if (input[j] > input[biggestIndex]) {
                    biggestIndex = j
                }
            }
            val temp = input[input.size - 1 - i]
            input[input.size - 1 - i] = input[biggestIndex]
            input[biggestIndex] = temp
        }
        return input
    }
}