package scala_exercises.week01

object exercise03Lecture16BlocksAndLexicalScope extends App {
  1 + 3
  def abs(x: Double) = if (x < 0) -x else x

  def sqrt(x: Double) = {

    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def isGoodEnough(guess: Double) =
      abs(guess * guess - x) / x < 0.0001

    def improve(guess: Double) =
      (guess + x / guess) / 2

    sqrtIter(1.0)
  }

  println(sqrt(2))
  println(sqrt(4))
  println(sqrt(1e-6))
  println(sqrt(1e60))

  println(sqrt(0.001))
  println(sqrt(0.1e-20))
  println(sqrt(1.0e20))
  println(sqrt(1.0e50))
}
