package com.array

/**
 * Created by wanglei on 15-2-26.
 */
object TestList {
  def main(args: Array[String]) {
    val list1=List("aaa","bbb","ccc")
    val list2=List("111","222","333")
    val list3=list1 ::: list2
    list3.foreach(list=>print(list+" "))
  }

}
