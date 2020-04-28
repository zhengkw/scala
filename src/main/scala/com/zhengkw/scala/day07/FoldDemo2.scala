package com.zhengkw.scala.day07

/**
 * @ClassName:FoldDemo2
 * @author: zhengkw
 * @description:
 * @date: 20/04/28下午 11:13
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object FoldDemo2 {
  def main(args: Array[String]): Unit = {
    val map1 = Map("a" -> 97, "b" -> 98)
    val map2 = Map("b" -> 980, "c" -> 99)
    val mapNew = map1.foldLeft(map2)((map, kv) => {
      var key = kv._1
      var v = kv._2
      val newV = map.getOrElse(key, 0) + v
      //新的kv
      val tuple = key -> newV
      map + tuple
    })
    println(mapNew)
  }
}
