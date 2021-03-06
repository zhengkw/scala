package com.zhengkw.scala.day03

/**
 * @ClassName:closure
 * @author: zhengkw
 * @description:
 * @date: 20/04/22下午 3:13
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object closure {

  def main(args: Array[String]): Unit = {
    //柯里化
    println(add(1)(3))
    //闭包
    val f: Int => Int = test(1)
    println(f(20))
    println(f(30))
    println(f(40))
  }

  //柯里化
  def add(a: Int)(b: Int) = a + b

  //闭包
  def test(a: Int) = {
    b: Int => a + b
  }
}
