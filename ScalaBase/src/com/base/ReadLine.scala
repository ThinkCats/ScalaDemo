package com.base

import scala.io.StdIn

/**
 * Created by wanglei on 15-2-26.
 */
object ReadLine {
  def main(args: Array[String]) {
    val name=StdIn.readLine("your name:")
    print("your age:")
    val age=StdIn.readLine()
    println("name:"+name+",age:"+age)
  }

}
