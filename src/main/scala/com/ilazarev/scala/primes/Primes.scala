package com.ilazarev.scala.primes

/** Print prime numbers less than 100, very inefficiently */
object Primes extends App /*Application*/ {
  def isPrime(n: Int) = (2 until n) forall (n % _ != 0)

  for (i <- 1 to 100 if isPrime(i)) println(i)
}