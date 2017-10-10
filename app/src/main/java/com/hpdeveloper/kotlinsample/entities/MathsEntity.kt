package com.hpdeveloper.kotlinsample.entities

/**
 * Created by hirenpatel on 10/10/17.
 */


class MathsEntity {

    fun sum(a: Int, b: Int): Int = a + b

    fun Int.exclusiveRangeTo(other: Int): IntRange = IntRange(this + 1, other - 1)
}