package com.zhengkw.scala.day07

/**
 * @ClassName:ReduceMax
 * @author: zhengkw
 * @description:
 * @date: 20/04/29下午 9:15
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object ReduceMax {
  def main(args: Array[String]): Unit = {
    val list = List(20, 30, 40,14,50,12,450,32)
    val i = list.reduce((x, y) => x.max(y))
    println(i)
  }
}
