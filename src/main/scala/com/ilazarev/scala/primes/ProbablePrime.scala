package com.ilazarev.scala.primes

object ProbablePrime {
  def main(args: Array[String]) {
    for (a <- 1 to 5) {
      println(BigInt.probablePrime(100, scala.util.Random))
    }
  }
}
