package com.zhengkw.scala.day07

import scala.collection.mutable

/**
 * @ClassName:SetDemo
 * @author: zhengkw
 * @description:
 * @date: 20/04/28上午 9:29
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object SetDemo {
  def main(args: Array[String]): Unit = {
    // 默认是不变的set
    val set = Set(10, 50, 30, 10, 40, 10)
    val set1 = set - 50
    val set2 = set + 10
    println(set1)
    println(set2)
    //可变set
    val set3 = mutable.Set(10, 50, 30, 10, 40, 10)
    set3 += 60
    println(set3)
    println(set3 -= 30)

    // Set集合的数学运算
    val set4 = Set(10, 20, 30, 50)
    val set5 = Set(1, 20, 30, 5)
    //并
    println("并")
    println(set4 | set5)
    println(set4 ++ set5)
    //交集
    println("交集")
    println(set4 & set5)
    println(set4.intersect(set5))
    //差集
    println("差集")
    println(set4 -- set5)
    println(set4 &~ set5)
    println(set4 diff (set5))
    val list1 = List(30, 50, 70, 60, 10, 20, 30, 10, 30, 60)
    val list = list1.toSet.toList
    println(list)
    val array = list.toArray
    myPrint(array)


  }

  def myPrint(arr: Array[_]) = {
    println(arr.mkString(", "))
  }
}
