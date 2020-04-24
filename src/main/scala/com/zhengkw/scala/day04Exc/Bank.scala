package com.zhengkw.scala.day04Exc

/**
 * @ClassName:Bank
 * @author: zhengkw
 * @description:
 * @date: 20/04/24下午 7:10
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object Bank {
  def main(args: Array[String]): Unit = {
    val account: BankAccount = new CheckingAccount
    account.withdraw(10000)
    account.deposit(2000000)
    println(account.balance)
  }

  class BankAccount(initialBalance: Double) {
    private[day04Exc] var balance = initialBalance

    def deposit(amount: Double) = {
      balance += amount
      balance
    }

    def withdraw(amount: Double) = {
      balance -= amount
      balance
    }
  }

  class CheckingAccount extends BankAccount(0) {
    override def deposit(amount: Double) = {
      super.deposit(amount - 1.0)

    }

    override def withdraw(amount: Double) = {
      super.withdraw(amount + 1.0)
    }
  }

}
