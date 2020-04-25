package com.zhengkw.scala.day03

import scala.beans.BeanProperty

/**
 * @ClassName:Student
 * @author: zhengkw
 * @description:
 * @date: 20/04/22上午 9:46
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object Student {
  def main(args: Array[String]): Unit = {
    studentDo("job", "cooke", eatFoods)
    println(add(2, 3))
    val c: People = new Teacher("jack", 30)
    println(c.toString)
    val d: People = new People("jack", 30, sex = "female")
    println(d.toString)
   /* val animal = new Animal()
    val dog: Animal = new Dog()
    println("-------------------")
    println(animal)
    animal.age=10
    animal.name="koko"
    println(animal)*/

  }

  def studentDo(name: String, action: String, active: (String, String) => Unit): Unit = {
    active(name, action)
  }

  def eatFoods(name: String, action: String): Unit = {
    println(name + s"吃$action")
  }

  val add = (a: Int, b: Int) => a + b
}

class People(@BeanProperty val name: String = "COCO", @BeanProperty val age: Int = 10, sex: String = "male") {
  println("People is called")

  override def toString: String = {
    name + "\t" + age + "peoletostring"
  }
}

class Teacher(override val name: String, override val age: Int = 20) extends People {

  println("Teacher is called")

  override def toString: String = {
    name + "\t" + age + "teachertostring"
  }


}
/*
class Animal(var name: String="", var age: Int=0) {
  def this() {
    this("", 20)

  }

  override def toString: String = {
    name + "\t" + age + "Animalostring"
  }
}

class Dog(@BeanProperty override var name: String, @BeanProperty override var age: Int) extends Animal {

  def this() {
    this("", 10)
  }

  override def toString: String = {
    name + "\t" + age + "Dogtostring"
  }
}
*/