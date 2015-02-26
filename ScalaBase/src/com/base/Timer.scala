package com.base


/**
 * Created by wanglei on 15-2-26.
 */
object Timer {
  def oncePerSecond(callback: ()=>Unit)={
    while (true){
      callback()
      Thread sleep(1000)
    }
  }

  def timeFiles(): Unit ={
    println("time is fly..")
  }

  def main(args: Array[String]) {
    oncePerSecond(timeFiles)
  }

}
