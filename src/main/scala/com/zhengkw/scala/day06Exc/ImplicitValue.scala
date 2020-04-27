package com.zhengkw.scala.day06Exc

/**
 * @ClassName:ImplicitValue
 * @author: zhengkw
 * @description:
 * @date: 20/04/27下午 10:13
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object ImplicitValue {
  //implicit val q = 123123
  def main(args: Array[String]): Unit = {
    new ImplicitValue().foo
    implicit val q = 123123 //只要在同一代码块中 则可以推导出foo隐式值！
  }

  //implicit val q = 123123 //error
}

class ImplicitValue {

  def foo(implicit a: Int) = {
    println(a)
  }
}
