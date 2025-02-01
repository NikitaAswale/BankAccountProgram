package com.example.bankaccountprogram

fun main(){
    val NikitaBankAccount = BankAccount("Nikita Aswale" ,20000.0)
    val SarahBankAccount = BankAccount("Sarah",0.0 )

    SarahBankAccount.deposit(100.0)
    SarahBankAccount.withdraw(10.0)
    SarahBankAccount.deposit(300.0)
    SarahBankAccount.displayTransactionHistory()
    println("${SarahBankAccount.accountHolder}'s balance is ${SarahBankAccount.accBalance()}")
    println()

    NikitaBankAccount.deposit(10000.0)
    NikitaBankAccount.withdraw(1000.0)
    NikitaBankAccount.displayTransactionHistory()
    println("${NikitaBankAccount.accountHolder}'s balance is ${NikitaBankAccount.accBalance()}")

}