package com.zhengkw.scala.day07

/**
 * @ClassName:FoldDemo
 * @author: zhengkw
 * @description:
 * @date: 20/04/28下午 9:50
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object FoldDemo {
  def main(args: Array[String]): Unit = {
    val list1 = List(30, 50, 70, 60, 10, 20)
    //list1.foldLeft(0)((x: Int, y: Int) => x + y)
    //list1.foldLeft(0)((x, y) => x + y)
    // list1.sum
    println(list1.fold(0)(_ + _))
    println(list1.foldLeft(1)(_ * _))

  }
}
