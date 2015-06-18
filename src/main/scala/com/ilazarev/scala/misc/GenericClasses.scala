package com.ilazarev.scala.misc

class GenericClasses {
}

class Stack[T] {
  var elems: List[T] = Nil

  def push(x: T) {
    elems = x :: elems
  }

  def top: T = elems.head

  def pop() {
    elems = elems.tail
  }
}

object GenericsTest extends App {
  val stack = new Stack[Int]
  stack.push(1)
  stack.push(97)
  //stack.push('a')
  private var top: Int = stack.top
  println("top=" + top)
  stack.pop()
  top = stack.top
  println("top=" + top)
  stack.pop()
  println("top=" + top)
  // cannot do this because the list is empty by now
  //stack.pop()
}
