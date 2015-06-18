package com.ilazarev.scala.impatient

// http://techbus.safaribooksonline.com/book/programming/scala/9780132761772
class Counter {
  private var value = 0

  // You must initialize the field
  def increment() {
    value += 1
  }

  // Methods are public by default
  def current = value
}

object CounterTest {
  def main(args: Array[String]) {
    val myCounter = new Counter
    myCounter.increment()
    println(myCounter.current)
    myCounter.increment()
    println(myCounter.current)
  }
}
