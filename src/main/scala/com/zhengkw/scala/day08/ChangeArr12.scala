package com.zhengkw.scala.day08

/**
 * @ClassName:ChangeArr12
 * @author: zhengkw
 * @description:
 * @date: 20/04/29下午 6:32
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object ChangeArr12 {
  def main(args: Array[String]): Unit = {
    //利用模式匹配，编写一个 swap(arr: Array[Int]) 函数，
    // 交换数组中前两个元素的位置
  //  val arr = Array(123, 24, 21, 34, 57, 77)
    val arr = Array(123, 24, 21, 34, 57, 77)
    arr match {
      case sawpA(a) => println(a.foreach(x => println(x)))
      case _ =>
    }
  }
}

object sawpA {
  def unapply(ints: Array[Int]): Option[Array[Int]] = {
    if (sawpA != null) Some(sawp(ints))

    else None
  }

  def sawp(array: Array[Int]) = {
    var temp = array(0)
    array(0) = array(1)
    array(1) = temp
    array
  }
}