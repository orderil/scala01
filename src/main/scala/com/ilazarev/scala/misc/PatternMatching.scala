package com.ilazarev.scala.misc

// http://www.scala-lang.org/old/node/120.html
class PatternMatching {
}

object MatchTest1 extends App {
  def matchTest(x: Int): String = x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "many"
  }

  println(matchTest(3))
  println(matchTest(1))
  println(matchTest(2))

  println(matchTest(5))
}

object MatchTest2 extends App {
  def matchTest(x: Any): Any = x match {
    case 1 => "one"
    case "two" => 2
    case y: Int => "scala.Int"
    case x: Float => "scala.Float"
    case z: Double => "scala.Double"
  }

  println(matchTest("two"))
  println(matchTest(1))
  println(matchTest(10))
  println(matchTest(7.70f))
  println(matchTest(12.2))
}
