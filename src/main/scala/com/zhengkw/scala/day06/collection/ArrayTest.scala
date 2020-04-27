package com.zhengkw.scala.day06.collection

import scala.collection.mutable.ArrayBuffer

/**
 * @ClassName:ArrayTest
 * @author: zhengkw
 * @description:
 * @date: 20/04/27下午 2:51
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object ArrayTest {
  def main(args: Array[String]): Unit = {
    val arr = Array[Int](10)
    val arr1 = Array(30, 50, 70, 60, 10, 20)
    var arr2 = Array(30, 50, 70, 60, 10, 20)
    val arrayBuffer = ArrayBuffer(30, 20, 40, 50)
    val arrayBuffer1 = ArrayBuffer(3, 29, 50, 123)
    println(System.identityHashCode(arr2))
    arr2 :+= 10
    MyPrint(arr2)
    println(System.identityHashCode(arr2))
   // arrayBuffer1 ++=: arrayBuffer
    arrayBuffer ++=: arrayBuffer1
    println(arrayBuffer)
    println(arrayBuffer1)


  }

  def MyPrint(arr: Array[_]) = {
    print(arr.mkString(", "))
  }
}
