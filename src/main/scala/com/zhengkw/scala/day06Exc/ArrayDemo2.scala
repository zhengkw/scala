package com.zhengkw.scala.day06Exc

import scala.collection.mutable.ArrayBuffer

/**
 * @ClassName:ArrayDemo2
 * @author: zhengkw
 * @description:
 * @date: 20/04/27下午 11:25
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object ArrayDemo2 {
  def main(args: Array[String]): Unit = {
    var arrayBuffer = ArrayBuffer(123, 123, 23, 12, 4565, 5)
    arrayBuffer= new ArrayBuffer[Int](10)
  }

}
