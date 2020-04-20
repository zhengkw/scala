package com.zhengkw.scala

/**
 * @ClassName:PrintTest
 * @author: zhengkw
 * @description:
 * @date: 20/04/20下午 2:38
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object PrintTest {

  def main(args: Array[String]): Unit = {
    val a:Int =10
    var b=323.23
    var c=200
    var r=math.Pi
    var s:String ="hahahaha-zhengkw"

    println(s"$a $b $c $r $$ %% __")
    printf("%d %f %d %.2f",a,b,c,r)
    println()
    println(s)
    println("""
              |var n7 = 2.2345678912f
              |var n8 = 2.2345678912
              |""".stripMargin)

  }

}
