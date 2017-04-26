package com.rustam.features


fun Int.multiplyBy(value: Int) = this * value

fun main(args: Array<String>) {
    val a = 3

    println(a.multiplyBy(5))
}