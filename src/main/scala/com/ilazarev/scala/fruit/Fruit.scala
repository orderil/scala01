package com.ilazarev.scala.fruit

class Fruit(val _name: String = "default fruit name", val _color: String = "default fruit color") {
  val name: String = _name
  val color: String = _color

  override def toString: String = "fruit (name=" + name + " ; color = " + color + ")"
}

class Apple(override val _name: String = "APPLE", override val _color: String = "default apple color", val _weight: Int = 1)
  extends Fruit(_name, _color) {

  val weight: Int = _weight

  override def toString: String = "apple (name=" + name + " ; color = " + color + " ; weight=" + weight + ")"
}

class Human(_name: String) {
  val name: String = _name

  def eat(fruit: Fruit) {
    println(name + " eats a/an " + fruit)
  }
}

object FruitTest {
  def main(args: Array[String]) {
    val fruit1 = new Fruit
    println("fruit1=" + fruit1)
    val fruit2 = new Fruit("ORANGE") // a default color will be used
    println("fruit2=" + fruit2)

    val apple1 = new Apple
    println("apple1=" + apple1)

    val apple = new Apple("APPLE", "red", 5)
    if (apple.isInstanceOf[Fruit]) {
      println("entering here...")
      val john = new Human("John")
      john.eat(apple)

      val apple2 = apple.asInstanceOf[Fruit]
      john.eat(apple2)
    }
  }
}
