package com.zhengkw.scala.day06

/**
 * @ClassName:ImplicitDemo5
 * @author: zhengkw
 * @description:
 * @date: 20/04/27上午 11:20
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object ImplicitDemo5 {
  def main(args: Array[String]): Unit = {
    implicit val a = 19
    implicit val c = "test"
    println(test(2)(1,"dfafda"))
  }

  def test(b: Int)(implicit a: Int, c: String) = {
   println(s"$a $c $b")
  }
}
