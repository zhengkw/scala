package com.zhengkw.scala.day03Exc

/**
 * @ClassName:LastTest
 * @author: zhengkw
 * @description:
 * @date: 20/04/23下午 11:26
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object LastTest {
  def main(args: Array[String]): Unit = {
    //原始数组arr
    val arr = Array(123.123, 213, 123, 2.0, 40.5, 29, 60)
    foreach(arr, println)
  }

  /**
   * @descrption: 遍历数组传入OP进行操作
   * @param array
   * @param op 传递函数 参数为double 返回值为Unit
   * @return: void
   * @date: 20/04/23 下午 11:39
   * @author: zhengkw
   */
  def foreach(array: Array[Double], op: (Double) => Unit) = {
    for (elem <- array) {
      op(elem)
    }
  }

  /**
   * @descrption: 按条件过滤数组
   * @return: void
   * @date: 20/04/23 下午 11:30
   * @author: zhengkw
   */
  def filter() = {

  }

  /**
   * @descrption: 遍历数组对元素进行操作
   * @return: void
   * @date: 20/04/23 下午 11:30
   * @author: zhengkw
   */
  def map() = {

  }

  /**
   * @descrption: 遍历数组对元素聚合
   * @return: void
   * @date: 20/04/23 下午 11:31
   * @author: zhengkw
   */
  def reduce() = {

  }
}
