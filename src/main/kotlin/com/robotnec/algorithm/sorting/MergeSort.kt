package com.robotnec.algorithm.sorting

class MergeSort: Sorting {

    override fun sort(input: IntArray): IntArray {
        return sortArray(input)
    }

    fun sortArray(input: IntArray): IntArray {
        if (input.size == 1) {
            return input
        } else {
            val centerIndex = input.size / 2
            var a = input.copyOfRange(0, centerIndex)
            var b = input.copyOfRange(centerIndex, input.size)
            a = sortArray(a)
            b = sortArray(b)
            return merge(a, b)
        }
    }

    fun merge(a: IntArray, b: IntArray): IntArray {
        val c = IntArray(a.size + b.size)
        var i = 0
        var j = 0
        for (k in 0..c.size - 1) {
            if ((i < a.size) && (j >= b.size || a[i] < b[j])) {
                c[k] = a[i]
                i++
            } else {
                c[k] = b[j]
                j++
            }
        }
        return c
    }
}