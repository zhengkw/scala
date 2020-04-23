package com.zhengkw.scala.day03

/**
 * @ClassName:CalledName
 * @author: zhengkw
 * @description: 匿名函数
 * @date: 20/04/22下午 3:41
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object CalledName {
  def main(args: Array[String]): Unit = {
    println(fibonacci(5))
    println(fibonacci1(0))
    /*foo({
      println("is called")
      10
    })
  }*/

    def foo1(a: () => Int) {


      a()
      a()
      a()
    }

    def foo(a: => Int) = {
      a
      a
      a
    }
 /**
 * @descrption: 斐波那契的尾递归
 * @return: int
 * @date: 20/04/23 下午 10:25
 * @author: zhengkw
 */
    def fibonacci(n: Int, f1: Int = 1, f2: Int = 1): Int = {
      if (n == 1) f1
      else fibonacci(n - 1, f2, f1 + f2)
    }
  /**
  * @descrption: 斐波那契的递归
   * @param n 
  * @return: int
  * @date: 20/04/23 下午 10:25
  * @author: zhengkw
  */
    def fibonacci1(n: Int): Int = {
      if (n <= 2) 1
      else fibonacci1(n - 2) + fibonacci1(n - 1)

    }
  }
}
