package com.zhengkw.scala.day03

/**
 * @ClassName:Student
 * @author: zhengkw
 * @description:
 * @date: 20/04/22上午 9:46
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object Student {
  def main(args: Array[String]): Unit = {
    studentDo("job", "cooke", eatFoods)

  }

  def studentDo(name: String, action: String, active: (String, String) => Unit): Unit = {
    active(name, action)
  }

  def eatFoods(name: String, action: String): Unit = {
    println(name + s"吃$action")
  }

}
