package com.zhengkw.scala

/**
 * @ClassName:DecVal
 * @author: zhengkw
 * @description:
 * @date: 20/04/20下午 9:06
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object DeclaraVal {
  /*
  java声明:
      int a = 10   // 变量
      final int B = 20 // 常量

  scala中如何声明变量和常量:
      变量
          var a: Int = 20
          注意: 变量声明的时候必须初始化. 不能延后初始化
              当使用变量的再去声明.

      常量
          val c: Int = 10
          注意: 1. 必须声明的时候进行初始化
                2.不能重新赋值   b = 200 ×

      var a = 30
         1. 如果在声明的时候没有指定类型, 则会根据初始化的值自动进行类型的推导
         2. 不要理解成动态类型.
         3. 类型推导不是万能, 有些情况不能推导.

   */

  def main(args: Array[String]): Unit = {
    var a =10
    val b =12//相当于final

    println(s"$a \t $b")
  }

}
