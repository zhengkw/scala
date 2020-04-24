package com.zhengkw.scala.day04Exc

import java.util

import scala.beans.BeanProperty
import scala.collection.mutable

/**
 * @ClassName:Pokder
 * @author: zhengkw
 * @description:
 * @date: 20/04/24下午 5:57
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object Poker {

  def main(args: Array[String]): Unit = {
    val poker = new BasePoker
    poker.numb = (Math.random() * 13 + 1).toInt
    var suitNum = (Math.random() * 4 + 1).toInt
    if (suitNum == 1) poker.suit = "♠"
    else if (suitNum == 2) poker.suit = "♣"
    else if (suitNum == 3) poker.suit = "♥"
    else poker.suit = "♦"
    println(poker.toString)
    poker.whatColor
    poker.whetherRed
  }
}

/**
 * @descrption:
 * @param suit 花色   ♣,♦,♥,♠，
 * @return:
 * @date: 20/04/24 下午 6:19
 * @author: zhengkw
 */
class BasePoker {
  var numb: Int = _
  var suit: String = _

  override def toString: String = {
    "这张扑克是" + suit + '\t' + numb
  }

  def whatColor: Unit = {
    if (suit == "♠") println("颜色是黑色")
    else if (suit == "♣") println("颜色是黑色")
    else if (suit == "♥") println("颜色是红色")
    else println("颜色是红色")
  }

  def whetherRed: Unit = {
    if (suit == "♠") println("不是红色")
    else if (suit == "♣") println("不是红色")
    else if (suit == "♥") println("是红色")
    else println("是红色")
  }
}
