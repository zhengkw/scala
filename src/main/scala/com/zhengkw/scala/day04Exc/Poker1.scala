package com.zhengkw.scala.day04Exc

/**
 * @ClassName:Pokder
 * @author: zhengkw
 * @description:
 * @date: 20/04/24下午 5:57
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object Poker1 {

  def main(args: Array[String]): Unit = {
    val poker = new BasePoker1
    println(poker)
    // poker.whatColor
    poker.whetherRed
  }
}

/**
 * @descrption: ♣,♦,♥,♠， 构造器 构造时初始化一张牌
 * @return:
 * @date: 20/04/24 下午 6:19
 * @author: zhengkw
 */
class BasePoker1 {
  var numb: Int = _
  var suit: String = _
  //构造的时候自动生成！
  //牌号
  numb = (Math.random() * 13 + 1).toInt
  //色号
  var suitNum = (Math.random() * 4 + 1).toInt
  //根据色号选择花色
  if (suitNum == 1) suit = "♠"
  else if (suitNum == 2) suit = "♣"
  else if (suitNum == 3) suit = "♥"
  else suit = "♦"

  /**
   * @descrption: 重写tostring
   * @return: java.lang.String
   * @date: 20/04/24 下午 9:15
   * @author: zhengkw
   */
  override def toString: String = {
    "这张扑克是" + suit + '\t' + numb
  }

  /**
   * @descrption: 判断花色颜色！
   * @return: void
   * @date: 20/04/24 下午 9:15
   * @author: zhengkw
   */
  /* def whatColor: Unit = {
     if (suit == "♠") println("颜色是黑色")
     else if (suit == "♣") println("颜色是黑色")
     else if (suit == "♥") println("颜色是红色")
     else println("颜色是红色")
   }*/
  /**
   * @descrption: 判断是否是红色
   * @return: void
   * @date: 20/04/24 下午 9:15
   * @author: zhengkw
   */
  def whetherRed: Unit = {
    if (suit == "♠") println("不是红色")
    else if (suit == "♣") println("不是红色")
    else if (suit == "♥") println("是红色")
    else println("是红色")
  }

}

