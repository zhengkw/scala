package com.zhengkw.scala.day02

/**
 * @ClassName:TestFor
 * @author: zhengkw
 * @description:
 * @date: 20/04/22上午 1:25
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object TestFor {

  def main(args: Array[String]): Unit = {
    val ints = for (i <- 1 to 50) yield i * 2
    println(ints)
    println("-------------------------")
    val ints1 = for (i <- 1 to 10) yield {
      println("what is it?")
      i * i
    }
    println(ints1)
  }
  /**
  * @descrption: if的值是最后一行 for值是（） while的值是 （）
   *
  * @return: 
  * @date: 20/04/22 上午 1:34
  * @author: zhengkw
  */
  var a=for (i<- 1 to 100) 1
  println()
}
