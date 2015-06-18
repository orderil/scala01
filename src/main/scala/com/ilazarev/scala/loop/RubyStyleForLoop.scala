package com.ilazarev.scala.loop

object RubyStyleForLoop {
  def main(args: Array[String]) {
    rubyStyleForLoop(args)
  }

  def rubyStyleForLoop(args: Array[String]) {
    println("for loop using Ruby-style iteration")
    args.foreach {
      arg => println(arg + ": " + arg.length())
    }
  }
}
