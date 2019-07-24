package scala_exercises.week02

// The sum function uses linear recursion.
// Write a tail-recursive version by
// replacing the ???s.

object exercise01Lecture21HigherOrderFunctions extends App {
  def sum (f: Int => Int, a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      if (a > b) acc
      else loop(a + 1, f(a) + acc)
    }
    loop(a, 0)
  }
  println(sum(x => x * x, 3, 5))
}
