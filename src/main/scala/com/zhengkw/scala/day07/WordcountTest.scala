package com.zhengkw.scala.day07

/**
 * @ClassName:WordcountTest
 * @author: zhengkw
 * @description:
 * @date: 20/04/29下午 9:22
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object WordcountTest {
  def main(args: Array[String]): Unit = {
    val list = List("word hi", "ni hao", "zheng kw", "ni hao")
    //hi ->2
    val strings = list.flatMap(x => x.split(" "))
    //   println(strings)
    /*    val map = strings.groupBy(x => x).map(kv => (kv._1, kv._2.length))
        println(map)*/
/*    val map: Map[String, Int] = strings.groupBy(x => x)
      .mapValues(v => v.size) */
    val map: Map[String, Int] = strings.groupBy(x => x)
      .mapValues(_.size)
    println(map)
  }
}
