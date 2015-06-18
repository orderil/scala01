package com.ilazarev.scala

/**
 * Created by igorlazarev on 2/5/14.
 * http://www.scala-lang.org/old/node/135.html
 * A Tour of Scala: Currying
 */
object CurryTest extends App {

  def filter(xs: List[Int], p: Int => Boolean): List[Int] =
    if (xs.isEmpty) {
      xs
    } else if (p(xs.head)) {
      xs.head :: filter(xs.tail, p)
    } else {
      filter(xs.tail, p)
    }

  def modN(n: Int)(x: Int) = ((x % n) == 0)

  val nums = List(1, 2, 3, 4, 5, 6, 7, 8)
//  val nums = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)
  println("modN(2)" + filter(nums, modN(2)))
  println("modN(3)" + filter(nums, modN(3)))
//  println("modN(4)" + filter(nums, modN(4)))
//  println("modN(5)" + filter(nums, modN(5)))
//  println("modN(6)" + filter(nums, modN(6)))
//  println("modN(7)" + filter(nums, modN(7)))
}