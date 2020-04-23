package com.zhengkw.scala.day03Exc

/**
 * @ClassName:Call
 * @author: zhengkw
 * @description:
 * @date: 20/04/23下午 10:05
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object Call {
  def main(args: Array[String]): Unit = {
    callbyname(foo)
    println("____________")
    callbyvalue(foo)

  }

  /**
   * @descrption: 名调用 a: => Int  看作 以a为名以 () =>Int为Type的无参数匿名函数
   * @param a
   * @return: int
   * @date: 20/04/23 下午 10:12
   * @author: zhengkw
   */
  def callbyname(a: => Int) = {
    a
    a
    a
  }

  /**
   * @descrption:值调用
   * @param a
   * @return: int
   * @date: 20/04/23 下午 10:12
   * @author: zhengkw
   */
  def callbyvalue(a: Int) = {
    a
    a
    a
  }

  def foo(): Int = {
    println("foo is called")
    1
  }
}
