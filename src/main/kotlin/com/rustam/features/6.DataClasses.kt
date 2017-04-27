package com.rustam.features


data class Person (
        val firstName: String,
        val lastName: String,
        val age: Int,
        val phone: String,
        val address: String
)

abstract class CallablePerson {
    abstract fun call ()
}

data class Employee(val firstName: String, val lastName: String, val phone: String): CallablePerson() {
    override fun call() {
        println("calling to $firstName $lastName phone number: $phone")
    }
}

fun main(args: Array<String>) {
    val person1 = Person("A", "B", 42, "123", "321")
    val person2 = Person("A", "B", 42, "123", "321")

    println(person1.equals(person2))
    println(person1.toString())
    println(person2.toString())

    val employee = Employee("Rustam", "Gaifullin", "+1 777 1234567")
    employee.call()
}
