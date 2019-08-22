package scala_exercises.week06

// example
// Given a positive integer n, find all pairs of positive
// integers i and j , with 1 <= j < i < n such that i + j is prime
// For example, if n = 7, the sought pairs are
//
// i   - 2  3  4  4  5  6  6
// j   - 1  2  1  3  2  1  5
// i+j - 3  5  5  7  7  7  11

object pairs extends App {
  val n = 7

  def isPrime(n: Int) = (2 until n) forall (n % _ != 0)

  val x = ((1 until n) map  (i => (1 until i) map (j => (i, j))))
  val y = ((1 until n) map  (i => (1 until i) map (j => (i, j)))).flatten
  val z = ((1 until n) flatMap  (i => (1 until i) map (j => (i, j))))

  val a = ((1 until n) flatMap  (i => (1 until i) map (j => (i, j)))) filter (pair =>
    isPrime(pair._1 + pair._2))

  println(x)
  println(y)
  println(z)

  println(a)
}
