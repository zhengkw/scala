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
    val point = new LabeledPoint("Black Thursday", 1929, 230.07)
    println(point.toString)
    println(point)

    //  val dPoint = new DDPoint("Black DD", 1929, 230.07)
  }

  class Point() {
    var x: Double = _
    var y: Double = _

    def this(x: Double, y: Double) = {
      this()
      this.x = x
      this.y = y
    }

    override def toString: String = {
      s"x:$x    y:$y"
    }
  }

  class LabeledPoint() extends Point {
    var local = ""

    def this(local: String, x: Double, y: Double) {
      this()
      this.local = local
      this.x = x
      this.y = y
    }

    override def toString: String = {
      s"$local    x:$x    y:$y"
    }
  }

  /*class DDPoint() extends Point {
    var local = ""
    override var x: Double = _
    override var y: Double = _

    def this(local: String, x: Double, y: Double) {
      this()
      this.x = x
      this.y = y
      this.local = local
    }
  }*/

}
