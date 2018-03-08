package com.scala.examples.classes

class BankAccount  {
  private var bal: Int = 0

    def balance: Int = bal

    def deposit(amount: Int) {
      bal += amount
      println("Deposit amount :"+amount+"  Balance: "+bal)
    }

    def withdraw(amount: Int) = 
      if (amount > bal) {println("Withdraw failed because of low balance");false}
      else {
        bal -= amount
        println("Withdraw amount: "+amount+"  Balance: "+bal)
      }
    
      override def toString = "Account balance is: "+bal;
}

object main {
  def main(args:Array[String]) {
    val account = new BankAccount
    println(account)
    account deposit 100
    account withdraw 80
    account withdraw 80
    println(account)
  }
}