package com.pes.lib

fun convert(names: Array<String?>) {

    for (name in names) {
        // Explicit null check
        if (name != null) {
            println(name.uppercase())
        }

        // Safe call + Elvis operator
        println(name?.uppercase() ?: "NULL")

        // Assertion operator
        if (name != null) {
            println(name!!.uppercase())
        }
    }
}

fun main() {
    convert(arrayOf("john", null, "merry", "robert"))
}
