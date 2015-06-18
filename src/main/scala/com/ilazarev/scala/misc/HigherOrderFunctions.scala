package com.ilazarev.scala.misc

// http://www.scala-lang.org/old/node/134.html
class HigherOrderFunctions {
}

class Decorator(left: String, right: String) {
  def layout[A](x: A) = left + x.toString() + right
}

class Repeater(times: Int) {
    def repeat[A] (x: A) = x.toString() * times
}

object FunTest extends App {
  def apply(f: Int => String, v: Int) = f(v)

  println(apply(new Decorator("[", "]").layout, 7))
  println(apply(new Decorator("{", "}").layout, 28))

  println(apply(new Repeater(5).repeat, 1))
}
