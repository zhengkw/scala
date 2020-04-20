package com.zhengkw.scala

/**
 * @ClassName:PrintTest
 * @author: zhengkw
 * @description: 输出
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

    //S插值
    println(s"$a $b $c $r $$ %% __")
   //格式化输出 参考c语言
    printf("%d %f %d %.2f",a,b,c,r)
    println()
   //输出一个字符串
    println(s)
   //字符串模板/多行字符串
    println("""
              |var n7 = 2.2345678912f
              |var n8 = 2.2345678912
              |""".stripMargin)

    //raw插值
    println(raw"\t \n \r $$ ${a}")


  }


}
