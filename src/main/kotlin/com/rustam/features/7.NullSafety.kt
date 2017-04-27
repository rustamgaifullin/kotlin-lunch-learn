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
    println(nullableString) //print null
    println(nullableString?.substring(1)) //print also null

    val normalString = someString.normalString()
    println(normalString?.substring(1)) //print b

    if (nullableString != null) {
        println(nullableString.substring(0)) //no need to use safe call
    }

    val subString = nullableString?.substring(0) ?: "c"
    println(subString) //print c


    nullableString?.let {println(it)} //print nothing
    normalString?.let { println(it) } //print ab
}