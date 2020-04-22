package com.zhengkw.scala.day03

/**
 * @ClassName:ForeachTest
 * @author: zhengkw
 * @description:
 * @date: 20/04/22上午 11:12
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object ForeachTest {
  def main(args: Array[String]): Unit = {
    val array = Array(20, 30, 456, 123, 4124)
    foreachArry(array, x => {
      println(x * x)
      println(x + "-----")
    })

    val ar = fillter(array, x => x > 20)
    //fillter(array, x => x > 100)
    val arr2 = map(array, x => x + 10)
    foreachArry(ar, println)
    foreachArry(arr2, println)
  }

  def foreachArry(arr: Array[Int], op: Int => Unit): Unit = {
    for (elm <- arr) op(elm)
  }

  def fillter(arr: Array[Int], condition: Int => Boolean) = {
    // for 推导
    for (ele <- arr if condition(ele)) yield ele
  }

  def map(arr: Array[Int], op: Int => Int) = {
    for (elem <- arr) yield op(elem)
  }
}
