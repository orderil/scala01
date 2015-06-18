package com.ilazarev.scala.impatient

class Person {
  var age = 0
}

object PersonTest {
  def main(args: Array[String]) {
    val fred = new Person
    println(fred.age) // Calls the method fred.age()

    fred.age = 21 // Calls fred.age_=(21)
    println(fred.age)
  }
}
