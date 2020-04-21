package com.zhengkw.scala.day02

import scala.io.StdIn

/**
 * @ClassName:MultipUnicode
 * @author: zhengkw
 * @description:计算传入的字符串中每个字符的 unicode 值的乘积
 * @date: 20/04/21下午 11:21
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object MultipUnicode {
  def main(args: Array[String]): Unit = {
    var flag = true

    while (flag) {
      println("请输入一个字符，输入0结束！")
      val str = StdIn.readChar()
      if (str == '0') flag = false
      else multip(str, multipUnicode)
    }

  }

  var multipUnicode = 1

  def multip(input: Int, multip: Int): Unit = {
    multipUnicode = input * multip
    println(multipUnicode)
  }

}
