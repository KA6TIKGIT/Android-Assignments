//package com.pes.lib

fun main() {

    val data = "Hi! How are you?"

    var vowels = 0
    var spaces = 0

    for (ch in data) {
        when (ch.lowercaseChar()) {
            'a', 'e', 'i', 'o', 'u' -> vowels++
            ' ' -> spaces++
        }
    }

    println("Vowels: $vowels")
    println("Spaces: $spaces")
}