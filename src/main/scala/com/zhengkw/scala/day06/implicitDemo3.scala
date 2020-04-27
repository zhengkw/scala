package com.zhengkw.scala.day06

import java.time.LocalDate
import java.util.Date

import scala.runtime.RichInt

/**
 * @ClassName:implicitDemo3
 * @author: zhengkw
 * @description:
 * @date: 20/04/27上午 10:15
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object implicitDemo3 {
  def main(args: Array[String]): Unit = {
    implicit def int2RichInt(day: Int): RichInt1 = new RichInt1(day)

    // 2 days ago
    val ago = "ago"
    val later = "later"
    println(2 days ago)
    println(3 days later)
  }

  class RichInt1(day: Int) {
    def days(word: String): String = {
      if (word == "ago") LocalDate.now().minusDays(day).toString
      else LocalDate.now().plusDays(day).toString
    }
  }

}

