package com.pes.lib

open class BankAccount(
    var accName: String,
    val accNumber: Int,
    var balance: Int = 0
) {
    open fun displayInfo() {
        println("Name: $accName")
        println("Account Number: $accNumber")
        println("Balance: $balance")
    }
}

class SavingsAccount(
    accName: String,
    accNumber: Int,
    balance: Int = 0,
    var interestRate: Float
) : BankAccount(accName, accNumber, balance) {

    fun credit(amount: Int) {
        balance += amount
    }

    fun debit(amount: Int) {
        balance -= amount
    }

    override fun displayInfo() {
        println("Name: $accName")
        println("Account Number: $accNumber")
        println("Balance: $balance")
        println("Interest Rate: $interestRate")
    }
}
