package com.array

/**
 * Created by wanglei on 15-2-26.
 */
object TestArray {
  def main(args: Array[String]) {
    val greeting=new Array[String](3)
    greeting(0)="hello"
    greeting(1)="world"
    greeting(2)="nice"
    for (i <- 0 to 2){
      println(greeting(i))
    }
  }

}
