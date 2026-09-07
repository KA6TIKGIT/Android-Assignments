package com.pes.lib

fun main() {

    val phoneNumbers = listOf<String>(
        "1234567890", "123", "", "0987654321"
    )

    // 1. Filter valid phone numbers
    val validNumbers = phoneNumbers.filter {
        it.length == 10
    }

    println(validNumbers)

    // 2. Print NAN for invalid numbers
    phoneNumbers
        .map { if (it.length == 10) it else "NAN" }
        .forEach { println(it) }
}
