package com.zhengkw.scala.day05

/**
 * @ClassName:Person
 * @author: zhengkw
 * @description:
 * @date: 20/04/25上午 10:37
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object Person {
  var country: String = "China"
    def personFactory(name: String): Person = {
   var person= new Person(name)
    person
  }

}

class Person {
  var name: String = "bobo"
  var country: String =""
  def this(name: String) = {
    this()
    this.name = name

  }

  override def toString: String = name
}

object Test {
  def main(args: Array[String]): Unit = {
    val person1 = new Person()
    person1
    println(Person.country)
    val person = Person.personFactory("lili")
    println(person)


  }
}
