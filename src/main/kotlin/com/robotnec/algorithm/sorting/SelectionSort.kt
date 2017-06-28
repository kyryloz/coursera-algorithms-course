package com.robotnec.algorithm.sorting

/**
 * Created by kyryloz
 */
class SelectionSort: Sorting {
    override fun sort(input: IntArray): IntArray {
        if (input.isEmpty()) {
            return input
        }
        var biggest = input[0]
        var biggestIndex = 0
        for (i in 0..input.size - 1) {
            for (j in 1..input.size - 1 - i) {
                if (input[j] > biggest) {
                    biggest = input[j]
                    biggestIndex = j
                }
            }
            val temp = input[input.size - 1 - i]
            input[input.size - 1 - i] = biggest
            input[biggestIndex] = temp
            biggest = input[0]
            biggestIndex = 0
        }
        return input
    }
}