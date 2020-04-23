package com.zhengkw.scala.day03Exc

/**
 * @ClassName:Anonymous
 * @author: zhengkw
 * @description: Anonymous function
 * @date: 20/04/23下午 8:45
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object Anonymous {
  def main(args: Array[String]): Unit = {
    val f: Int => Int = add(10)
    println("我是f \t" + f)
    println(add(10)(20))
    println(f(30))
    //实现计算器
    println(Calculator(2, 3, _ + _))
    println(Calculator(2, 4, (a, b) => a + b))
    //减法
    println(Calculator(2, 3, _ - _))
    println(Calculator(2, 4, (a, b) => a - b))
    //其他的类似就不实现了
  }

  /**
   * @descrption: add里面调用一个匿名函数
   * @param a
   * @return: scala.Function1<java.lang.Object,java.lang.Object>
   * @date: 20/04/23 下午 8:47
   * @author: zhengkw
   */
  def add(a: Int) = {
    (b: Int) => a + b
  }




  /**
   * @descrption: 计算器
   * @param a
   * @param b
   * @param cal 定义一个函数作为参数 将来传入匿名函数来实现具体操作！
   * @return: int
   * @date: 20/04/23 下午 8:55
   * @author: zhengkw
   */
  def Calculator(a: Int, b: Int, cal: (Int, Int) => Int) = {
    cal(a, b)
  }
}
