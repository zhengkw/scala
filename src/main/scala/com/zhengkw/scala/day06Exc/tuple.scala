package com.zhengkw.scala.day06Exc

/**
 * @ClassName:tuple
 * @author: zhengkw
 * @description:
 * @date: 20/04/27下午 11:48
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object tuple {
  def main(args: Array[String]): Unit = {
    val tuple2 = tuple./%(4, 2)
    println(tuple2._1)
    println(tuple2._2)
  }

  def /%(a: Int, b: Int): (Int, Int) = {
    (a / b, a % b)

  }
}
