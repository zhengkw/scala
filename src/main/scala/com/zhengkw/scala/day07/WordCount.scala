package com.zhengkw.scala.day07

/**
 * @ClassName:WordCount
 * @author: zhengkw
 * @description:
 * @date: 20/04/28下午 3:33
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object WordCount {
  def main(args: Array[String]): Unit = {
    val list = List("word hi", "ni hao", "zheng kw", "ni hao")
    println(list.flatMap(x => x.split(" "))
      .groupBy(x => x).map(kv => (kv._1, kv._2.size)))
  }
}
