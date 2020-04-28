package com.zhengkw.scala.day07

/**
 * @ClassName:MapDemo3
 * @author: zhengkw
 * @description:
 * @date: 20/04/28下午 2:14
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object MapDemo3 {
  def main(args: Array[String]): Unit = {
    val map = Map("a" -> 33, "b" -> 22, "c" -> 99)
    println(map.map(kv => kv._1))
    val list1 = List(30, 50, 70, 60, 10, 20, 30, 10, 30, 60)
     list1.foreach(x => x + 41)

  }
}
