package com.zhengkw.scala.day08

/**
 * @ClassName:SortWith
 * @author: zhengkw
 * @description:
 * @date: 20/04/29下午 2:08
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object SortWith {
  def main(args: Array[String]): Unit = {
    val list1 = List(30, 50, 70, 60, 10, 20)
    val list2 = list1.sortWith((x, y) => {
      x > y
    })
    println(list2)
  }


}
