package com.zhengkw.scala.day06

import java.io.File

import scala.io.Source

/**
 * @ClassName:ImplicitDemo2
 * @author: zhengkw
 * @description:
 * @date: 20/04/27上午 9:50
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object ImplicitDemo2 {
  def main(args: Array[String]): Unit = {

    implicit def file2RichFile(file: File) = new RichFile(file)

    val content = new File("E:\\scala\\src\\main\\scala\\com\\zhengkw\\scala\\day06\\ImplicitDemo.scala").readContent
    println(content)
  }


  class RichFile(file: File) {


    def readContent: String = {
      // Array(1,2,3,4)  => arr.mkString   "1234"
      // Array(1,2,3,4)  => arr.mkString(",")   "1,2,3,4"
      Source.fromFile(file, "utf-8").mkString
    }
  }

}
