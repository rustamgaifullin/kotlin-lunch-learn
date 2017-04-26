package com.rustam.basic

interface Mouse {
    fun name(): String

    fun dpi() = 400
}

class OfficeMouse : Mouse {
    override fun name(): String {
        return "Office Mouse"
    }
}

class GamingMouse : Mouse {
    override fun name(): String {
        return "Gaming Mouse"
    }

    override fun dpi(): Int {
        return 2000
    }
}

fun main(args: Array<String>) {
    val officeMouse = OfficeMouse()
    val gamingMouse = GamingMouse()

    println("${officeMouse.name()} dpi: ${officeMouse.dpi()}")
    println("${gamingMouse.name()} dpi: ${gamingMouse.dpi()}")
}
