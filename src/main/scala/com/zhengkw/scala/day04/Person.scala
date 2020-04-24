package com.zhengkw.scala.day04

/**
 * @ClassName:Person
 * @author: zhengkw
 * @description:
 * @date: 20/04/24上午 10:40
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
class Person {
  var name: String = _
  var age: Int = _

  def sleep(name: String) = {
    println(name + " is sleeping")
  }


}

object Java {
  def main(args: Array[String]): Unit = {

    val person = new Person
    println(person.toString)
    person.age = 12
    person.name = "kafka"
    println(person.age)
    person.sleep("john")

  }
}