package scala_exercises.week01

// Design a tail recursive version of factorial

object exercise04Lecture17TailRecursion extends App {

  def factorial(n: Int): Int = {
    def loop(acumulator: Int, n: Int): Int =
      if (n == 0) acumulator
      else loop(acumulator * n, n - 1)
    loop(1, n)
  }
  println(factorial(4))
}
