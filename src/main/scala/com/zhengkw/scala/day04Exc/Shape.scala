package com.zhengkw.scala.day04Exc

/**
 * @ClassName:Shap
 * @author: zhengkw
 * @description:定义一个抽象类 Shape，一个抽象方法 centerPoint，
 *                      以及该抽象类的子类 Rectangle 和 Circle。
 *                      为子类提供合适的构造器，并重写centerPoint方法,
 *                      并提供计算面积的方法 (根据需要添加相应的属性)
 * @date: 20/04/24下午 9:02
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object Shape {
  def main(args: Array[String]): Unit = {
    println(new Rectangle(2, 5).centerPoint)
    println(new Circle(3).centerPoint)
  }

  abstract class Shape {
    def centerPoint: Double
  }

  /**
   * @descrption: 长方形面积打印
   * @param null
   * @return:
   * @date: 20/04/24 下午 9:19
   * @author: zhengkw
   */
  class Rectangle extends Shape {
    var row = 0.0
    var clo = 0.0

    def this(row: Double, clo: Double) {
      this()
      this.row = row
      this.clo = clo
    }

    override def centerPoint: Double = row * clo
  }

  class Circle extends Shape {
    var r = 0.0

    def this(r: Double) {
      this()
      this.r = r

    }

    override def centerPoint: Double = Math.PI * r * r
  }

}
