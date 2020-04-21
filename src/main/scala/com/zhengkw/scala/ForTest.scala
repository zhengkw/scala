package com.zhengkw.scala

//修改全部导入

import scala.util.control.Breaks._

/**
 * @ClassName:ForTest
 * @author: zhengkw
 * @description:
 * @date: 20/04/21上午 11:08
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object ForTest {
  def main(args: Array[String]): Unit = {
    var s = "zhengkw"
    for (c <- s) {
      print(c + '\t') //错误写法 这个是char整型的加法运算
      println
      println(c + "\t") // 将C转换成字符串！
    }
    println("-------1-----------")
    for (i <- 1 to 100 by 2) println(i)
    println("--------2----------")
    for (i <- 1 to(100, 5)) println(i)
  }

  var m = 10
  while (m > 0) {
    m -= 1
    println(m)
  }
  println("--------3----------")
  //判断是偶数执行循环 循环守卫
  for (i <- 0 until 99 by 1 if i % 2 == 0) System.out.println(i)
  println("--------4----------")
  // private val str: String = StdIn.readLine()
  var str = "25"
  var flag = true
  //去掉Breaks
  breakable {
    for (i <- 2 to str.toInt) {
      if (str.toInt % i == 0) {
        flag = false
        break
      }
    }
  }
  println(if (flag) str + "\t是Z数" else str + "\t is 合数")

}
