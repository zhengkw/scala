package com.zhengkw.scala.day05

/**
 * @ClassName:ApplyTest
 * @author: zhengkw
 * @description:
 * @date: 20/04/25上午 11:29
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object RunTest {
  def main(args: Array[String]): Unit = {
    val myArray = new MyArray(20, 30, 40)
    println(myArray(0))
    println(myArray(1))
  }
}

object ApplyTest {
  def apply(name: String, age: Int, sex: String): ApplyTest = new ApplyTest(name, age, sex)
}

class ApplyTest(name: String, age: Int, sex: String) {
  override def toString: String = s"$name $age  $sex"
}

class MyArray(arr: Int*) {
  def apply(Index: Int) = {
    arr(Index)
  }
}