package com.zhengkw.scala.day03Exc

/**
 * @ClassName:ControlAbs
 * @author: zhengkw
 * @description:
 * @date: 20/04/23下午 10:41
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
object ControlAbs {
  def main(args: Array[String]): Unit = {
    //在main线程中执行
    println(Thread.currentThread().getName)
    //在子线程中执行 补上括号就可以看成一个名调用
    threadRun({
      println(Thread.currentThread().getName)
    })
    //在子线程中执行
    threadRun {
      println(Thread.currentThread().getName)
    }
  }

  /**
   * @descrption: 传递一段代码, 让后让这段代码, 在一个子线程中执行
   *              这里面的控制抽象并不是threadRun！
   *              而是code！
   * @return: void
   * @date: 20/04/23 下午 10:52
   * @author: zhengkw
   */
  def threadRun(code: => Unit): Unit = {
    new Thread() {
      //重写run方法
      override def run(): Unit = {
        code
      }
    }.start()
  }

}
