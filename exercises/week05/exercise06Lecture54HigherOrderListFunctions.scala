package scala_exercises.week05

// exercise 06
// Write a function pack that packs consecutive duplicates of list
// elements into sublists. For instance,
//      pack(List("a","a","a","b","c","c","a"))
// should give
//      List(List("a","a","a"), List("b"), List("c","c"), List("a"))
// You can use the following template
//      def pack[T](xs: List[T]): List[List[T]] = xs match {
//          case Nil = Nil
//          case x :: xs1 => ???

object exercise06Lecture54HigherOrderListFunctions extends App {
  val nums = List(2, -4, 5, 7, 1)
  val fruits = List("apple", "pineapple", "orange", "banana")

  //filters
  println(nums filter (x => x > 0))
  println(nums filterNot (x => x > 0))
  println(nums partition (x => x > 0))
  println(nums takeWhile (x => x > 0))
  println(nums dropWhile (x => x > 0))
  println(nums span (x => x > 0))

  //exercise 06
  val data = List("a", "a", "a", "b", "c", "c", "a")

  def pack[T](xs: List[T]): List[List[T]] = xs match {
    case Nil => Nil
    case x :: xs1 =>
      val (first, rest) = xs span (y => y == x)
      first :: pack(rest)
  }

  println(pack(data))
}
