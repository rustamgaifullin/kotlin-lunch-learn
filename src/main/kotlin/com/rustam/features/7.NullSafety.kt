package com.rustam.features

class SomeString {

    fun nullableString(): String? = null
    fun normalString(): String? = "ab"
}

fun main(args: Array<String>) {
    val a: Int = 1
//    a = null //compilation error

    val someString = SomeString()

    val nullableString = someString.nullableString()
    println(nullableString)
    println(nullableString?.substring(1))

    val normalString = someString.normalString()
    println(normalString?.substring(1))

    if (nullableString != null) {
        println(nullableString.substring(0))
    }

    val subString = nullableString?.substring(0) ?: "c"
    println(subString)


    nullableString?.let {println(it)}
    normalString?.let { println(it) }
}