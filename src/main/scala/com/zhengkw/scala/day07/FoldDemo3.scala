package com.zhengkw.scala.day07

import scala.collection.mutable

/**
 * @descrption:
 * @return:
 * @date: 20/04/28 下午 11:30
 * @author: zhengkw
 */
object FoldDemo3 {
  def main(args: Array[String]): Unit = {
    val map1 = Map("a" -> 97, "b" -> 98)
    val map2 = Map("b" -> 980, "c" -> 99)
    val map1new = map1.map(kv => (kv._1 + "1", kv._2))
    println(map1new)
    val keys = map2.keySet
    var map3: mutable.Map[String, Int] = mutable.Map()
    map1.map(x => {
      keys.foreach(x => {

      })
    })
  }
}
