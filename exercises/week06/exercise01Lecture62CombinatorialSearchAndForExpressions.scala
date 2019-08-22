package scala_exercises.week06

// White a version of scalarProduct (see last session) that makes use of a for:

object exercise01Lecture62CombinatorialSearchAndForExpressions extends App {
  def scalarProduct(xs: List[Int], ys: List[Int]): Int =
    (for ((x, y) <- xs zip ys) yield x * y).sum

  val a = List(1, 2, 3, 4, 5)
  val b = List(6, 7, 8, 9, 0)

  println(scalarProduct(a, b))
}
