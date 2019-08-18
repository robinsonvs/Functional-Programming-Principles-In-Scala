package scala_exercises.week05

// Implement init as an external function, analogous to last.

object exercise01Lecture51MoreFunctionsOnList extends App {

  def init[T](xs: List[T]): List[T] = xs match {
    case List() => throw new Error("init of empty list")
    case List(x) => List()
    case y :: ys => y :: init(ys)
  }
}
