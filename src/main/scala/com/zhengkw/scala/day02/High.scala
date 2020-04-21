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
    //eat() 不能传参数 参数 函数eat不能加圆括号？？？ 如果要覆盖参数如何写！
    println(student(eat))

  }

  /**
   * @descrption:
   * @param f
   * @return: void
   * @date: 20/04/22 上午 1:19
   * @author: zhengkw
   */
    //如何定义被调用的函数有多个参数的高阶函数！比如eat(name,foods)
  def student(f: String => String): Unit = {
    println("called student")
    println(f("cooke"))
  }

  def eat(foods: String): String = {
    println("called eat")
    "Amy 吃" + foods
  }
}
