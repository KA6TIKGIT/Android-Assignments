package com.pes.lib


// TODO - add exception handling
fun getNumber(data: String): Int {
    // String.toInt()
    return data.toInt()
}

fun main() {
    getNumber("12") // string with only digits
    getNumber("a1as")
}

