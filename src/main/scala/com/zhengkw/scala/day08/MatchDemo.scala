package com.zhengkw.scala.day08

/**
 * @ClassName:MatchDemo
 * @author: zhengkw
 * @description:
 * @date: 20/04/29下午 4:21
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object MatchDemo {
  def main(args: Array[String]): Unit = {
    val ints: List[Any] = 12 :: 23 :: 53 :: Nil
    println(ints)
    ints match {
      case List(_,_,a) => println(a)
    }
  }
}
