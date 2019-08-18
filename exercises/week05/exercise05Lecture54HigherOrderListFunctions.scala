package scala_exercises.week05

// Consider a function to square each element of a list, and return the
// result. Complete the two following equivalent definitions of squareList
//

object exercise05Lecture54HigherOrderListFunctions extends App {

  def squareListMatch(xs: List[Int]): List[Int] = xs match {
    case Nil => Nil
    case y :: ys => y * y :: squareListMatch(ys)
  }

  def squareListMap(xs: List[Int]): List[Int] =
    xs map (x => x * x)
}
