package com.array

import scala.collection.immutable.HashMap

/**
 * Created by wanglei on 15-2-26.
 */
object TestHashMap {

  def main(args: Array[String]) {
    var map=HashMap(1->"a",2->"b",3->"c")
    map +=(4->"d")
    map.foreach(value=>
      print(value+"")
    )
  }

}
