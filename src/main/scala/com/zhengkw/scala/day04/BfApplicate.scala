package com.zhengkw.scala.day04

/**
 * @ClassName:BfApplicate
 * @author: zhengkw
 * @description: 未完成的 部分应用案例
 * @date: 20/04/24上午 10:19
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object BfApplicate {
  def main(args: Array[String]): Unit = {
    val f1 = Math.pow(_: Double, 2)
    println(f1(2))
    val value = Array(20.3, 123, 21, 25, 26.4)
    foreach(value, println(_))
    foreach(value, x => println(x * x))
  }

  def foreach(array: Array[Double], op: Double => Unit) = {
    for (elem <- array) {
      op(elem)
    }
  }

}
