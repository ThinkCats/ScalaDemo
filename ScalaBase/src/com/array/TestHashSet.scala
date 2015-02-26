package com.array

import scala.collection.immutable.HashSet

/**
 * Created by wanglei on 15-2-26.
 */
object TestHashSet {
  def main(args: Array[String]) {
    var set= HashSet("a","b","c")
    set+="d"
    set.foreach(value=>print(value+" "))
  }
}
