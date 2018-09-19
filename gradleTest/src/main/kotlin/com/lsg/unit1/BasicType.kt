package com.lsg.unit1

//Boolean类型: 先定义,后赋值(注意它申明类型在后)
val aBoolean: Boolean = true
val anotherBoolean: Boolean = false

val anInt: Int = 8
val anotherInt: Int = 0xFF
val moreInt: Int = 0b00000011
val maxValue: Int = Int.MAX_VALUE
val minValue: Int = Int.MIN_VALUE

val along: Long = 1232131242142312231
val anotherLong: Long = 123
val maxLong: Long = Long.MAX_VALUE
val minLong: Long = Long.MIN_VALUE


val aFloat: Float = 2.0F
val maxFolat: Float = Float.MAX_VALUE
val anotherFloat: Float = -2.0f
val minFloat: Float = Float.MIN_VALUE

fun main(args: Array<String>) {
    println(anotherInt)
    println(moreInt)
    println(maxValue)
    println(minValue)


    println(along)
    println(anotherLong)
    println(maxLong)
    println(minLong)

    println(aFloat)
    println(anotherFloat)
    println(maxFolat)
    println(minFloat)
//nan不是数字,比较没有意义
    println(0.0f/0.0f ==  Float.NaN)
    println()
}



