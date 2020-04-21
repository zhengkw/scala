package com.zhengkw.scala.day02

/**
 * @ClassName:DefaultParam
 * @author: zhengkw
 * @description:
 * @date: 20/04/21下午 10:08
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object DefaultParam {
  def main(args: Array[String]): Unit = {
    println(add(2, 3))
    println(add1(3,4))
    println(add2(3, 3, 4, 6, 12))
  }

  /**
   * @descrption: 赋值2个！
   * @param a
   * @param b
   * @return: int
   * @date: 20/04/21 下午 10:14
   * @author: zhengkw
   */
  def add(a: Int, b: Int): Int = {
    a + b
  }

  /**
   * @descrption: 默认值调用
   * @param a 默认值100
   * @param b
   * @return: int
   * @date: 20/04/21 下午 10:14
   * @author: zhengkw
   */
  def add1(a: Int = 100, b: Int): Int = {
    a + b
  }

  /**
   * @descrption:
   * @param a     最少一个参数
   * @param arrys 声明可变参数！数组
   * @return: void
   * @date: 20/04/21 下午 10:20
   * @author: zhengkw
   */
  def add2(a: Int, arrys: Int*): Int = {
    var sum = a
    for (i <- 0 until  arrys.length) {
      sum += arrys(i)
    }
    sum
    //  arrys.sum+a
  }

}
