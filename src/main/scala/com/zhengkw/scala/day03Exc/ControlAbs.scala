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
    var i = 0
    mywhile(i < 100) {
      println(i)
      i += 1
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

  /**
   * @descrption: 自定义while循环
   * @param condition 判断条件
   * @param code      传入的代码块
   * @return: scala.Function1<scala.runtime.BoxedUnit,scala.runtime.BoxedUnit>
   * @date: 20/04/23 下午 11:11
   * @author: zhengkw
   */
    //注意mywhile的类型必须写死！不然 mywhile会报错！
  def mywhile(condition: => Boolean)(code: => Unit):Unit= {

    if (condition) {
      code
      //递归执行
      mywhile(condition)(code)
    }
  }


}