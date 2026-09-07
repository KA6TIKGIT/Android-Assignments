package com.pes.lib

open class BankAccount(
    val accName: String,
    val accNumber: Int,
    var balance: Int = 0
) {
    open fun displayInfo() {
        println("Name: $accName")
        println("Account Number: $accNumber")
        println("Balance: $balance")
    }
}

class SavingAccount(
    accName: String,
    accNumber: Int,
    val interestRate: Float
) : BankAccount(accName, accNumber) {

    fun credit(amount: Int) {
        balance += amount
    }

    fun debit(amount: Int) {
        balance -= amount
    }

    override fun displayInfo() {
        super.displayInfo()
        println("Interest Rate: $interestRate")
    }
}

fun main() {
    val account = SavingAccount("John", 12345, 6.5f)

    account.credit(5000)
    account.debit(1000)
    account.displayInfo()
}
