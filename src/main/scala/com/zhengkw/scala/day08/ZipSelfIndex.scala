package com.zhengkw.scala.day08

/**
 * @ClassName:ZipSelfIndex
 * @author: zhengkw
 * @description:
 * @date: 20/04/29下午 10:06
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object ZipSelfIndex {
  def main(args: Array[String]): Unit = {
    /*
    编写一个函数, 接收一个字符串, 返回一个 Map. 比如: indexes("Helloee")
    返回: Map(H->List(0), e -> List(1, 5, 6), ...)   数字其实是下标
    */
    println(indexes("Helloee"))

    def indexes(s: String): Map[Char, List[Int]] = {
      val list = s.toList
       //  println(list.zipWithIndex)
       val index = list.zipWithIndex
       val charToTuples = index.groupBy(kv => kv._1)
       // println(charToTuples)
       val list1 = charToTuples.mapValues(Vector => Vector.map(kv => kv._2).toList)
       println(list1)
                list1

/*      s.zipWithIndex
        .groupBy(_._1)
        //            .mapValues(vector => vector.map(_._2).toList)
        .mapValues(_.map(_._2).toList)*/


    }

  }
}
