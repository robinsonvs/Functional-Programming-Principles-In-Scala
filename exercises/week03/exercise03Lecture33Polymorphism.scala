package scala_exercises.week03

// Write a function nth that takes in integer n and a list and selects
// the n'th element of the list
// Elements are numbered from 0
// If index is outside the range from 0 up the length of the list
// minus one, a IndexOutOfBoundsException should be thrown

import scala_exercises.week03.lecture33Polymorphism

object exercise03Lecture33Polymorphism extends App {
  def nth[T](n: Int, xs: List[T]): T =
    if (xs.isEmpty) throw new IndexOutOfBoundsException
    else if (n == 0) xs.head
    else nth(n - 1, xs.tail)

  val list = new Cons(1, new Cons(2, new Cons(3, new Nil)))
  println(list)

  val a = nth(2, list)
  println(a)

  val b = nth(4, list)
  println(b)
}
