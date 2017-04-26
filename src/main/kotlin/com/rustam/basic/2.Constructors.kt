package com.rustam.basic


class Engine (val horsePower: Int) {

    var injection: String = "defaultInjection"

    init {
        println("I'm engine with $horsePower horse powers")
    }

    constructor(horsePower: Int, injection: String) : this(horsePower) {
        this.injection = injection
    }
}

fun main(args: Array<String>) {

    val carEngine = Engine(100)
    val sportCarEngine = Engine(500, "superInjection")

    println("horsePower - ${carEngine.horsePower}, injection - ${carEngine.injection}")
    println("horsePower - ${sportCarEngine.horsePower}, injection - ${sportCarEngine.injection}")

}

class ClassWithPrivateConstructor private constructor(val someProperty: Int) {
}
