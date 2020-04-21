package com.zhengkw.scala.sort

/**
 * @ClassName:PrimeSum
 * @author: zhengkw
 * @description: 计算1到1000的质数和
 * @date: 20/04/21下午 3:01
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object PrimeSum {

  def main(args: Array[String]): Unit = {
    println(priSum(2, 1000))
    //var sum =0
   // sum=priSum(1,1000)
  }

  def isPrime(n: Int): Boolean = {
    if (n < 2) return false
    else {
      for (i <- 2 until  n) {
        if (n % i == 0) {
          return false
        }
      }
      true
    }

  }

  def priSum(from: Int, to: Int): Int = {
    var sum = 0
    for (i <- from to to) {
      if (isPrime(i)) {
        sum += i
      }
    }
    sum
  }

}
