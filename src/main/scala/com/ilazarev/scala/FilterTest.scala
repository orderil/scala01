package com.ilazarev.scala

/**
 * Created by igorlazarev on 2/5/14.
 * http://www.scala-lang.org/old/node/116.html
 * A Tour of Scala: Nested Functions
 */
object FilterTest extends App {
  def filter(xs: List[Int], threshold: Int) = {
    def process(ys: List[Int]): List[Int] =
      if (ys.isEmpty) {
        ys
      } else if (ys.head < threshold) {
        ys.head ::
          process(ys.tail)
      } else {
        process(ys.tail)
      }
    process(xs)
  }

  println(filter(List(1, 9, 2, 8, 3, 7, 4), 5))
}

