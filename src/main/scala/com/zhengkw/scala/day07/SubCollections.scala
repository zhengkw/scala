package com.zhengkw.scala.day07

/**
 * @ClassName:SubCollections
 * @author: zhengkw
 * @description:
 * @date: 20/04/28上午 11:53
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
//            （12）滑窗
object SubCollections {
  val list1 = List(30, 50, 70, 60, "abc")
  val list2 = List("30", "50", "7", "6", "10", "2", "abc")

  def main(args: Array[String]): Unit = {
    //            （1）获取集合的头head
    println(list1.head)
    //            （2）获取集合的尾（不是头就是尾）tail
    println(list1.tail)
    //            （3）集合最后一个数据 last
    println(list1.last)
    //            （4）集合初始数据（不包含最后一个）
    println(list1.init)
    val inits = list1.inits
    println("组合")
    inits.toList.foreach(println)
    //            （5）反转
    println(list1.reverse)
    //            （6）取前（后）n个元素
    println(list1.take(2))
    println(list1.takeRight(2))
    //            （7）去掉前（后）n个元素
    println(list1.drop(2))
    println(list1.dropRight(2))
    //            （8）并集
    println(list1.union(list2))
    //            （9）交集
    println(list1.intersect(list2))
    //            （10）差集
    println(list1.diff(list2))
    //            （11）拉链
    println(list1.zipAll(list2, -1, -2))

  }
}
