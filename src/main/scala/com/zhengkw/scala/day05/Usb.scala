package com.zhengkw.scala.day05

/**
 * @ClassName:Usb
 * @author: zhengkw
 * @description:
 * @date: 20/04/25下午 2:25
 * @version:1.0
 * @since: jdk 1.8 scala 2.11.8
 */
trait Usb {
  var typ: String
  var verson: Double

  def use()
}

class AppleUsb extends Usb {

  override var typ: String = "C"
  override var verson: Double = 3.0

  override def use(): Unit = println(s"APPLE type $typ $verson is used")
}

object AppleUsbTest {
  def main(args: Array[String]): Unit = {
    new AppleUsb().use()
  }
}