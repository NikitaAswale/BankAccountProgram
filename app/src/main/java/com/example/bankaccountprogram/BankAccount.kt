package com.example.bankaccountprogram

class BankAccount(var accountHolder : String , var balane : Double){
    private val transactionHistory = mutableListOf<String>()
    fun deposit(amount : Double){
        balane+=amount
        transactionHistory.add("$accountHolder deposited Rs.$amount")
    }
    fun withdraw(amount: Double){
        if(amount<=balane) {
            balane -= amount
            transactionHistory.add("$accountHolder withdrew Rs.$amount")
        }else{
            println("You don't have fund to withdraw the money")
        }
    }
    fun displayTransactionHistory(){
        println("Transaction history for $accountHolder")
        for(transaction in transactionHistory){
            println(transaction)
        }
        println("Total Balance ${accBalance()}")
    }
    fun accBalance(): Double {
        return balane
    }
}