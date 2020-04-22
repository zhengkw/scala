package com.zhengkw.scala.day03

/**
 * @ClassName:High
 * @author: zhengkw
 * @description:
 * @date: 20/04/22上午 9:32
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object High {
  def main(args: Array[String]): Unit = {
    println(option(1, 2, add))
    println(option(4, 2, sub))
    println(option(4, 2, multiplication))
    println(option(4, 2, division))

    println(option(1, 2, f))
    println(option(1, 5, (a: Int, b: Int) => a + b))
    println(option(1, 5, (a, b) => a + b))
    println(option(1, 5,  _+ _))


  }

  def option(a: Int, b: Int, op: (Int, Int) => Int): Int = {
    op(a, b)
  }

  def add(a: Int, b: Int) = a + b

  def sub(a: Int, b: Int) = a - b

  def multiplication(a: Int, b: Int) = a * b

  def division(a: Int, b: Int) = a / b

  //匿名函数
  var f: (Int, Int) => Int = (a: Int, b: Int) => a + b
}
