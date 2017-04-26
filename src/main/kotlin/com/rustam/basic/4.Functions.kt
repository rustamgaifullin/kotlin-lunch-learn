package com.rustam.basic

fun simpleFunction(): String {
    return "I'm simple function"
}

fun printName(name: String) {
    println("My name is $name")
}

fun justPrintMyName(name: String) = println(name)


fun printFancyName(name: String, prefix:String = "", notes: String = "" ) = println("$prefix$name$notes")


fun main(args: Array<String>) {
    println(simpleFunction())
    printName("Rustam")
    justPrintMyName("Rustam")
    printFancyName("Rustam")
    printFancyName("Rustam", "Dear ")
    printFancyName("Rustam", "Dear ", " Please remember about...")
    printFancyName(prefix = "Dear ", name = "Rustam", notes = "P lease remember about...")
}