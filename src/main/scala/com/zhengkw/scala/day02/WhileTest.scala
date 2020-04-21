package com.zhengkw.scala.day02

/**
 * @ClassName:WhileTest
 * @author: zhengkw
 * @description: 用while循环输出1到100的质数
 * @date: 20/04/21下午 8:33
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object WhileTest {
  def main(args: Array[String]): Unit = {

    printPrimeNum(2, 100)
  }

  //打印一个
  def printPrimeNum(start: Int, end: Int): Unit = {
    var i = start
    var j = end
    while (i < j) {
      if (isPrimeNum(i)) {
        print(i + "\t")
        //    i += 1 //当 i=4以后无法进入 进行i++操作！陷入死循环
      }
      i += 1
    }
    println() //最后换行
  }

  def isPrimeNum(a: Int): Boolean = {

    if (a < 2) return false
    else {
      for (i <- 2 until a) {
        if (a % i == 0) return false
      }

    }
    true
  }
}
