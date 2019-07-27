package scala_exercises.week01

// 1 - The isGoodEnough test is not very precise for small numbers  and
// can lead to non-termination for very large numbers. Explain why.
// 2 - Design a different version of isGoodEnough tha does not have
// these problems.
// 3 - Test your version with some very very small and large numbers, e.g.
// 0.001
// 0.1e-20
// 1.0e20
// 1.0e50

object exercise02Lecture15SquareRootsWithNewtonsMethod extends App {
  1 + 3
  def abs(x: Double) = if (x < 0) -x else x

  def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x)

  //old version
  //def isGoodEnough(guess: Double, x: Double) =
  //  abs(guess * guess - x) < 0.0001
  def isGoodEnough(guess: Double, x: Double) =
    abs(guess * guess - x) / x < 0.0001

  def improve(guess: Double, x: Double) =
    (guess + x / guess) / 2

  def sqrt(x: Double) = sqrtIter(1.0, x)

  println(sqrt(2))
  println(sqrt(4))
  println(sqrt(1e-6))
  println(sqrt(1e60))

  println(sqrt(0.001))
  println(sqrt(0.1e-20))
  println(sqrt(1.0e20))
  println(sqrt(1.0e50))

}
