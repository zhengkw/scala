package com.zhengkw.scala.day02

/**
 * @ClassName:High
 * @author: zhengkw
 * @description: 体会高阶函数
 * @date: 20/04/22上午 12:53
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object High {
  def main(args: Array[String]): Unit = {
    //student(eat("apple"))
    //eat() 不能传参数
    println(student(eat))

  }

  /*def student(f: String => Unit): Unit = {
    println("called")
  }

  def eat(foods: String): Unit = {
    println("Amy 吃" + foods)
  }*/

  def student(f: String => String): Unit = {
    println("called student")
    println(f("shit"))
  }

  def eat(foods: String): String = {
    println("called eat")
    "Amy 吃" + foods
  }
}
