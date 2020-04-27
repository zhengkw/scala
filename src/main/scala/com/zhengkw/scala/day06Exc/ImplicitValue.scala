package com.zhengkw.scala.day06Exc

/**
 * @ClassName:ImplicitValue
 * @author: zhengkw
 * @description:
 *   注意
 * - 找隐式值的时候, 只看类型, 不看变量的名字
 *
 * - 在作用域内, 只能有一个同类型的隐式值
 *
 * - 一个隐式参数列表内, 如果有多个参数, 则这些参数都是隐式的
 *
 * - 如果一个函数, 有很多参数, 有些用是隐式参数, 有些不是, 怎么办?
 *
 *   对函数做柯里化
 *
 *   - 使用两个参数列表
 *   - 第一个是必须要传
 *   - 第二个里面是隐式参数
 *
 * - 如果使用隐式值, 则圆括号也要省略
 *
 * - 省略括号, 表示在使用 隐式值,  加上括号, 表示使用默认值
 * @date: 20/04/27下午 10:13
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object ImplicitValue {
  //implicit val q = 123123
  def main(args: Array[String]): Unit = {
    new ImplicitValue().foo()
    implicit val q = 123123 //只要在同一代码块中 则可以推导出foo隐式值！
  }

  //implicit val q = 123123 //error
}

class ImplicitValue {

  def foo(implicit a: Int = 10) = {
    println(a)
  }
}
