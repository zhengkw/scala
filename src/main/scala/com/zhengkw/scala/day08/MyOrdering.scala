package com.zhengkw.scala.day08

/**
 * @ClassName:Ordering
 * @author: zhengkw
 * @description:
 * @date: 20/04/29上午 10:35
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object MyOrdering {
  def main(args: Array[String]): Unit = {

    val user1 = new User(23, "jack")
    val user2 = new User(24, "java")
    val user3 = new User(4, "scala")

    implicit var ord: Ordering[User] = new Ordering[User]() {
      override def compare(x: User, y: User): Int = x.age - y.age
    }
    val users = List(user1, user2, user3)
    println(users.sorted)
    val list = users.sortBy(user => (user.age, user.name.length))(Ordering.Tuple2(Ordering.Int.reverse, Ordering.Int.reverse))
    println(list)
  }
}

class User(val age: Int, val name: String) {
  override def toString: String = s"age=$age name=$name"
}