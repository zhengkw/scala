package com.zhengkw.scala.day04Exc

/**
 * @ClassName:Point
 * @author: zhengkw
 * @description:
 * @date: 20/04/24下午 7:36
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object Point {
  def main(args: Array[String]): Unit = {

  }

  class Point() {
    var x = 0.0
    var y = 0.0

    def this(x: Double, y: Double) = {
      this()
      this.x = x
      this.y = y
    }
  }

  class LabeledPoin() extends Point

}
