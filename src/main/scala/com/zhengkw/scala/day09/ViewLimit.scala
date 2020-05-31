package com.zhengkw.scala.day09

/**
 * @ClassName:ViewLimit
 * @author: zhengkw
 * @description:
 * @date: 20/04/30下午 3:29
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object ViewLimit {
  def main(args: Array[String]): Unit = {
    println(myMax(2, 7))


  }


  def myMax[T](a: T, b: T)(implicit ord: T => Ordered[T]): T = {
    if (a > b) a
    else b
  }
}

