package com.zhengkw.scala.day07

import scala.collection.mutable

/**
 * @ClassName:MapDemo2
 * @author: zhengkw
 * @description:
 * @date: 20/04/28上午 11:37
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object MapDemo2 {
  def main(args: Array[String]): Unit = {
    val map = Map("a" -> 97, "b" -> 98, "c" -> 99)
    println(map("a"))
    //  println(map("d"))
    println(map.get("d"))
    println(map.getOrElse("d", 100))
    println(map)
    val map1 = mutable.Map("a" -> 97, "b" -> 98, "c" -> 99)
    map1.getOrElseUpdate("d",100)
    println(map1)
  }
}
