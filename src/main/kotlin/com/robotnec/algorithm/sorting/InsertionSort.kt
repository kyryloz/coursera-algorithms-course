package com.robotnec.algorithm.sorting

/**
 * Created by kyryloz
 */
class InsertionSort: Sorting {
    override fun sort(input: IntArray): IntArray {

        // input [5, 2, 1]

        for (i in 1..input.size - 1) {
            val key = input[i]
            var j = i - 1

            // 1st
            // i = 1 [5, _2_, 1] key = 2
            // j = 0 [_5_, 2, 1] input[j] = 5

            // 2nd
            // i = 2 [2, 5, _1_] key = 1
            // j = 1 [2, _5_, 1] input[j] = 5

            while (j >= 0 && key < input[j]) {
                input[j + 1] = input[j]
                input[j] = key
                j--
            }
        }
        return input
    }
}