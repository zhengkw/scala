package com.zhengkw.scala.day07

import scala.io.Source

/**
 * @ClassName:FromPCWordCount
 * @author: zhengkw
 * @description:
 * @date: 20/04/28下午 4:05
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object FromPCWordCount {
  def main(args: Array[String]): Unit = {
    val fileBuffer = Source.fromFile("F:\\mrinput\\wordcount\\test.txt", "utf-8")
    /*val contents = fileBuffer.mkString*/
    val lineIt = fileBuffer.getLines()
    val wdc = lineIt.flatMap(x => x.split(" "))
      .filter(x => x.length > 0).toList.groupBy(x => x)
      .map(kv => (kv._1, kv._2.length))
    println(wdc)


  }
}
