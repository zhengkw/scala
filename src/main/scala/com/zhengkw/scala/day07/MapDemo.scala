package com.zhengkw.scala.day07

/**
 * @ClassName:MapDemo
 * @author: zhengkw
 * @description:
 * @date: 20/04/28上午 10:21
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object MapDemo {
  def main(args: Array[String]): Unit = {
    //   / val map = Map((2, "234"), (2, "13"))
    val map = Map(("a", 97), ("b", 98), ("c", 98))
    //遍历
    val k = map.keySet
    println(k)
    for (elem <- k) {
      //遍历map
      println(map(elem))
    }
    //遍历
    for (kv <- map) {
      println(kv._1 + " " + kv._2)
    }
    //遍历
    for ((k, v) <- map) {
      println(k + " " + v)
    }
    //遍历v为98的key
    for ((k, 98) <- map) {
      println(k)
    }
    println("-----遍历K-----")
    for ((k, _) <- map) {
      println(k)
    }

    for (k <- map.keySet) {
      println(k)
    }
  }


}
