package com.ilazarev.scala.loop

object ForLoop {
  def main(args: Array[String]) {
    forLoop(args)
  }

  def forLoop(args: Array[String]) {
    println("for loop using Java-style iteration")
    for (i <- 0 until args.length) {
      println(args(i))
    }
  }
}
