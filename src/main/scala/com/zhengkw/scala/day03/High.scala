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

  }

  def option(a: Int, b: Int, op: (Int, Int) => Int): Int = {
    op(a, b)
  }

  def add(a: Int, b: Int) = a + b

  def sub(a: Int, b: Int) = a - b

  def multiplication(a: Int, b: Int) = a * b

  def division(a: Int, b: Int) = a / b

}
