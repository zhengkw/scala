package com.zhengkw.scala.day02

import scala.io.StdIn

/**
 * @ClassName:MultipUnicode
 * @author: zhengkw
 * @description:
 * @date: 20/04/21下午 11:21
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object MultipUnicode {
  def main(args: Array[String]): Unit = {
    var flag = true

    while (flag) {
      val str = StdIn.readLine("请输入一个数，输入其他字符退出")
      try {
        var in = str.toInt
        multip(in, multipUnicode)
      } catch {
        case e => flag = false
      }
    }

  }

  var multipUnicode = 1

  def multip(input: Int, multip: Int): Unit = {
    multipUnicode = input * multip
    println(multipUnicode)
  }

}
