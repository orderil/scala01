package com.ilazarev.scala.helloworld

/**
 * Created by ilazarev on 2/6/14.
 * http://www.codecommit.com/blog/scala/scala-for-java-refugees-part-1
 */
object HelloWorld2 extends App {
  var greeting = ""
  for (i <- 0 until args.length) {
    greeting += (args(i) + " ")
  }

  if (args.length > 0) {
    greeting = greeting.substring(0, greeting.length - 1)
  }

  println(greeting)
}
