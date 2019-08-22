package scala_exercises.week06

// A number n is prime if the only divisors of n are 1 and n itself.
// What is a high level way to write a test for primality of numbers ?
// For once, value conciseness over efficiency.

object exercise01Lecture61OtherCollections extends App {
  def isPrime(n: Int): Boolean =
    (2 until n) forall (d => n % d != 0)

  println(isPrime(0))
  println(isPrime(1))
  println(isPrime(2))
  println(isPrime(3))
  println(isPrime(4))
  println(isPrime(5))
  println(isPrime(6))
  println(isPrime(7))
  println(isPrime(8))
  println(isPrime(9))
  println(isPrime(10))
}
