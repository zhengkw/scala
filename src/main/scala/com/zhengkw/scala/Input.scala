package com.zhengkw.scala

import java.io.{BufferedReader, InputStreamReader}
import java.util.Scanner

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
    println(s"---------------本初子午线str1--------------")
    println(str1)
    println(s"---------------本初子午线line--------------")
    println(line)


  }

  //输入
  private val str: String = StdIn.readLine("请输入")
  // java输入方法
  //一次只能读一个字节
  val reader = new InputStreamReader(System.in)
  //BufferedReader(Reader)来缓存起来一次可以读一行
  val bufferedReader = new BufferedReader(reader)
  val str1: String = bufferedReader.readLine()
  //方法二
   val scanner = new Scanner(System.in)
   println("main外面的输入提示！")
  val line: String = scanner.nextLine()


}
