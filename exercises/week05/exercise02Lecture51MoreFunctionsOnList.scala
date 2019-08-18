package scala_exercises.week05

// Remove the n'th element of a list xs. If n is out of bounds, return xs
// itself

object exercise02Lecture51MoreFunctionsOnList extends App {

  val fruit = List("apples", "oranges", "pears")
  val nums = List(1, 2, 3)
  val empty = List()

  def removeAt(n: Int, xs: List[Int]) = (xs take n) ::: (xs drop n + 1)

  println(removeAt(1, nums))
}
