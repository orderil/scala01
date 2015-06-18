package com.ilazarev.scala.quicksort

import scala.Array

class Quicksort {
}

object QuicksortTest extends App {
  var values: Array[Int] = Array(1, 7, 5, 3, 12, 7, 2, 23, 2)
  sort(values)
  println("values:")

  values.foreach {
    value => println(value)
  }

  // this also works
  /*
    val iter: Iterator[Int] = values.iterator
    while (iter.hasNext) {
      println(iter.next.toString())
    }
  */

  def sort(xs: Array[Int]) {
    sort1(0, xs.length - 1)

    def swap(i: Int, j: Int) {
      val t = xs(i)
      xs(i) = xs(j)
      xs(j) = t
    }

    def sort1(l: Int, r: Int) {
      val pivot = xs((l + r) / 2)
      var i = l
      var j = r
      while (i <= j) {
        while (xs(i) < pivot) {
          i += 1
        }
        while (xs(j) > pivot) {
          j -= 1
        }
        if (i <= j) {
          swap(i, j)
          i += 1
          j -= 1
        }
      }
      if (l < j) {
        sort1(l, j)
      }
      if (j < r) {
        sort1(i, r)
      }
    }

  }

}
