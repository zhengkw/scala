package com.zhengkw.scala

/**
 * @ClassName:CastToOther
 * @author: zhengkw
 * @description: 类型转换
 * @date: 20/04/20下午 4:25
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object CastToOther {
  def main(args: Array[String]): Unit = {
    var a = "123"
    // var b=123123.123
    var c = math.Pi
    var flag = true
    var d = 0
    //double转int
    var int: Int = a.toInt
    println(s"double to int\t" + int)
    //string转double
    var double: Double = a.toDouble
    println("string to double\t" + double)
    //double转string
    var string: String = c.toString
    println("double to string \t" + string)
    println(flag)
    //源码里应该转换了大小写 统一转换为小写
    var String: String = "falSe"
    println("string to boolean\t" + String.toBoolean)


  }
}
