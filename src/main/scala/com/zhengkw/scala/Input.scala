package com.zhengkw.scala

import com.sun.deploy.util.StringUtils

import scala.io.StdIn

/**
 * @ClassName:Input
 * @author: zhengkw
 * @description: 输入一行
 * @date: 20/04/20下午 4:05
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object Input {
  def main(args: Array[String]): Unit = {
    println(str)
  }
  //输入
  private val str: String = StdIn.readLine("请输入")

}
