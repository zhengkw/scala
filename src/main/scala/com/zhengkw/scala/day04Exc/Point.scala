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
  }

  /**
   * @descrption: 父类point
   * @param null
   * @return:
   * @date: 20/04/24 下午 9:18
   * @author: zhengkw
   */
  class Point() {
    var x: Double = _
    var y: Double = _

    /**
     * @descrption: 2个参数的构造器
     * @param x
     * @param y
     * @return:
     * @date: 20/04/24 下午 9:18
     * @author: zhengkw
     */
    def this(x: Double, y: Double) = {
      this()
      this.x = x
      this.y = y
    }

    /**
     * @descrption: 重写tostring
     * @return: java.lang.String
     * @date: 20/04/24 下午 9:17
     * @author: zhengkw
     */
    override def toString: String = {
      s"x:$x    y:$y"
    }
  }

  /**
   * @descrption: 附带打印字段 Black Thursday
   * @param null
   * @return:
   * @date: 20/04/24 下午 9:17
   * @author: zhengkw
   */
  class LabeledPoint() extends Point {
    var local = ""

    def this(local: String, x: Double, y: Double) {
      this()
      this.local = local
      this.x = x
      this.y = y
    }

    /**
     * @descrption: 重写tostring
     * @return: java.lang.String
     * @date: 20/04/24 下午 9:17
     * @author: zhengkw
     */
    override def toString: String = {
      s"$local    x:$x    y:$y"
    }
  }

}
