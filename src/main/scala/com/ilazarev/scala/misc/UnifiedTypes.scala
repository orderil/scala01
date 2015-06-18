package com.ilazarev.scala.misc

// http://www.scala-lang.org/old/node/128.html
object UnifiedTypes {
  def main(args: Array[String]) {
    val set = new scala.collection.mutable.LinkedHashSet[Any]
    set += "This is a string" // add a string
    set += 732 // add a number
    set += 'c' // add a character
    set += true // add a boolean value
    set += main _ // add the main function
    val iter: Iterator[Any] = set.iterator
    while (iter.hasNext) {
      println(iter.next.toString())
    }
  }
}
