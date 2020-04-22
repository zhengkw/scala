package com.zhengkw.scala.day03

/**
 * @ClassName:ForeachTest1
 * @author: zhengkw
 * @description:
 * @date: 20/04/22下午 12:17
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object ForeachTest1 {
  def main(args: Array[String]): Unit = {
    val arr = Array(123.231, 2131, 13132, 131, 2, 414, 22, 414)
    foreach(arr, println)
    println("---------")
    val arr1 = filter(arr, x => x % 2 == 0)
    foreach(arr1, println)
    println("---------")
    val arr2 = map(arr1, x => x - 2.0)
    foreach(arr2, println)
    println("-----reduce----")
   /* reduce((arr2, (last, current) => last + current))*/
   val arr3 = reduce(arr, (last, current) => last * current)
    println(arr3)
  }

  def foreach(arr: Array[Double], op: Double => Unit) = {
    for (elem <- arr) op(elem)
  }

  def filter(arr: Array[Double], condition: Double => Boolean) = {
    for (elem <- arr if condition(elem)) yield elem
  }

  def map(arr: Array[Double], op: Double => Double) = {
    for (elem <- arr) yield op(elem)
  }

  def reduce(arr: Array[Double], op: (Double, Double) => Double): Double = {
    /*for (i <- 1 until arr.length) yield op(arr(0), arr(i))*/
    if (arr.length <= 0) return 0
    // 聚合操作
    // 表示上一次的聚合结果
    var lastResult = arr(0)
    for (i <- 1 until arr.length) {
      lastResult = op(lastResult, arr(i))
    }
    lastResult

  }

}
