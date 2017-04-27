package com.rustam.features

class SomeString {

    fun nullableString(): String? = null
    fun normalString(): String? = "ab"
}

fun main(args: Array<String>) {
    val a: Int = 1
//    a = null //compilation error
    val b: Int? = null

    val someString = SomeString()

    val nullableString = someString.nullableString()
    println(nullableString) //print null
    println(nullableString?.substring(1)) //print also null

    val normalString = someString.normalString()
    println(normalString?.substring(1)) //print b

    if (nullableString != null) {
        println(nullableString.substring(0)) //no need to use safe call
    }

    nullableString?.let { println(it) } //print nothing
    normalString?.let { println(it) } //print ab

    val subString1 = if (nullableString != null) nullableString.substring(0) else "null"
    val subString2 = nullableString?.substring(0) ?: "null"

    println(subString1) // print null
    println(subString2) //print null

    //for NPE lovers :)
    println(someString.nullableString()!!.substring(0)) //NullPointerException
}