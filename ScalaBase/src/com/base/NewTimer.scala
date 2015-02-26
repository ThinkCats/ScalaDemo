package com.base

/**
 * Created by wanglei on 15-2-26.
 */
object NewTimer {
  var count=0
  def currentCount(): Long ={
    count+=1
    count
  }

  def main(args: Array[String]) {
    print(NewTimer.currentCount())
  }

}
