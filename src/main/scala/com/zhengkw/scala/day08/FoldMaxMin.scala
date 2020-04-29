package com.zhengkw.scala.day08

/**
 * @ClassName:FoldMaxMin
 * @author: zhengkw
 * @description:
 * @date: 20/04/29下午 9:51
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object FoldMaxMin {
  def main(args: Array[String]): Unit = {
    val list1 = List(30, 50, 70, 60, 10, 20)
    var max = Int.MinValue
    var min = Int.MaxValue

    /**
     * @descrption:
     * @param MaxMin 为元组，第一次传入(max,min) ele为集合的元素
     * @return: void
     * @date: 20/04/29 下午 10:00
     * @author: zhengkw
     */
    val tuple = list1.foldLeft((max, min))((MaxMin, ele) =>
      (MaxMin._1.max(ele), MaxMin._2.min(ele)))
    println(tuple)
  }
}
