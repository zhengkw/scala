package com.zhengkw.scala.day06

/**
 * @ClassName:ImplicitDemo
 * @author: zhengkw
 * @description:
 * @date: 20/04/27上午 9:20
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object ImplicitDemo {
  def main(args: Array[String]): Unit = {


    implicit def double2int(a: Double) = {
      a.toInt

      /*    implicit def double2Int(d: Double): Int = d.toInt

        val a: Int = 10.1 // Double=> Int
        println(a)*/
    }

    val a: Int = 10.2
  }
}
