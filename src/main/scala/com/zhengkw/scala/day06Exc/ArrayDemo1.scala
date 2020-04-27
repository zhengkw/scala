package com.zhengkw.scala.day06Exc

/**
 * @ClassName:ArrayDemo1
 * @author: zhengkw
 * @description:
 * @date: 20/04/27下午 11:01
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object ArrayDemo1 {
  def main(args: Array[String]): Unit = {
    val array = new Array[Int](10)
 /*   array(0) = 1
    array(1) = 2*/
    for (i <- 0 until array.length) {
      array(i) = i * i //初始化
    }
    myPrint(array)
  }

  def myPrint(arr: Array[_]) = {
    println(arr.mkString(", "))
  }
}
