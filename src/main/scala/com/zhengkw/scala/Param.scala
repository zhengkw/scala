package com.zhengkw.scala

/**
 * @ClassName:Param
 * @author: zhengkw
 * @description:
 * @date: 20/04/21下午 4:34
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object Param {

  def main(args: Array[String]): Unit = {
    val array = Array(1, 2, 5)
    println(sum(array: _*))
  }

  def sum(ss: Int*): Int = {
    var sum = 0
    for (i <- ss) {
      sum += i
    }
    sum
  }
}
