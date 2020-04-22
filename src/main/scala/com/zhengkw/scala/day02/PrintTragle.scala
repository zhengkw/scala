package com.zhengkw.scala.day02

import scala.io.StdIn

/**
 * @ClassName:PrintTragle
 * @author: zhengkw
 * @description:输出一个三角形
 *          *
 *         * *
 *        * * *
 *       * * * *
 *      * * * * *
 *     * * * * * *
 * @date: 20/04/21下午 10:49
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object PrintTragle {
  def main(args: Array[String]): Unit = {
    var flag = true

    while (flag) {
      val str = StdIn.readLine("需要打印多少行,输入-1结束循环")
      try {
        if (str.toInt > 0) {
          lineNum = str.toInt
          printTragle(lineNum)
          println("--------------")
          printTragle2(lineNum)
        } else {
          println("已退出")
          flag = false
        }
      } catch {
        case e => flag = false
          println("不允许输入非法参数，已退出！")
      }
    }
  }

  var lineNum = 0

  /**
   * @descrption: 打印方法
   * @param line 输入行数
   * @return: void
   * @date: 20/04/21 下午 11:52
   * @author: zhengkw
   */
  def printTragle(line: Int) {
    //输出 line-1行
    for (i <- 1 until line) {
      var count = 0 //输出空格个数
      //控制每行输出
      for (m <- 1 to line - i) {
        //输出空格
        print(" ")
        count += 1
      }
      //输出该行的*等于总行数-空格数
      for (n <- 1 to line - count) print("* ")
      //输出完一行
      println()
    }
    //打印最后一行
    for (i <- 1 to line) print("* ")
    //打印换行为了后续继续输入
    println()

  }

  def printTragle2(lines: Int): Unit = {
    for (line <- 0 until lines) {
      //打印空格
      for (i <- 0 until lines - line) print(" ")
      //打印**
      for (i <- 0 until 2 * line + 1) print("*")
      //换行
      println()
    }
  }

}
