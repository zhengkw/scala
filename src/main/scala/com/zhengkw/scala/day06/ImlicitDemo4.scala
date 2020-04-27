package com.zhengkw.scala.day06

import java.io.File
import java.time.LocalDate

import scala.io.Source


/**
 * @ClassName:imlicitDemo4
 * @author: zhengkw
 * @description:
 * @date: 20/04/27上午 10:47
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object ImlicitDemo4 {
  val content = new File("E:\\scala\\src\\main\\scala\\com\\zhengkw\\scala\\day06\\ImplicitDemo.scala").readContent

  def main(args: Array[String]): Unit = {

    //   / implicit def file2RichFile(file: File) = new RichFile(file)

    println(content)

  }

  implicit class RichFile(file: File) {
    def readContent: String = {
      // Array(1,2,3,4)  => arr.mkString   "1234"
      // Array(1,2,3,4)  => arr.mkString(",")   "1,2,3,4"
      Source.fromFile(file, "utf-8").mkString
    }
  }

}



