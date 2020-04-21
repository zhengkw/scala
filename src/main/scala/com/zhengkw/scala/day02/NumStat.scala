package com.zhengkw.scala.day02

import scala.io.StdIn

/**
 * @ClassName:NumStat
 * @author: zhengkw
 * @description:
 * @date: 20/04/21下午 11:05
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object NumStat {
  def main(args: Array[String]): Unit = {

    var flag = true
    while (flag) {
      val str = StdIn.readLine("请输入一个数,输入0结束")
      numStat(str.toInt)
      if (str.toInt == 0) flag = false
    }


  }

  def numStat(a: Int): Unit = {
    if (a < 0) println("signum:-1")
    else if (a == 0) println("signum:0")
    else println("signum:1")
  }

}
