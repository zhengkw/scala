package com.zhengkw.scala.day06Exc


/**
 * @ClassName:Stratum1
 * @author: zhengkw
 * @description:
 * @date: 20/04/27下午 6:46
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object Stratum1 {
  def main(args: Array[String]): Unit = {
    println(5 !)
  }

  implicit def int2RichInt1(i: Int): RichInt1 = new RichInt1(i)

  class RichInt1(i: Int) {
    def !() = {
      recursive1(i)
    }
    /**
     * @descrption: 递归实现阶层
     * @param a
     * @return: int
     * @date: 20/04/27 下午 7:16
     * @author: zhengkw
     */
    def recursive(a: Int): Int = {
      if (a == 1) 1
      else a * recursive(a - 1)
    }

    /**
     * @descrption: 尾递归优化
     * @param a
     * @param add
     * @return: int
     * @date: 20/04/27 下午 7:16
     * @author: zhengkw
     */
    def recursive1(a: Int, add: Int = 1): Int = {
      if (a == 1) add
      else recursive1(a - 1, add * a)
    }

  }

}

