package scala_exercises.week04

// 1 ) Consider the pattern x :: y :: List(xs, ys) :: zs
//
// What is the condition that describes most accurately the length L of
// the lists it matches ?
// 0 - L == 3
// 0 - L == 4
// 0 - L == 5
// 0 - L >= 3 --- its correct
// 0 - L >= 4
// 0 - L >= 5

// 2 ) Complete the definition insertion sort by filling int the ???s in the
// definition bellow

// What is the worst case complexity of insertion sort relative to the
// length of the input list N ?
//
// 0 - the sort takes constant time
// 0 - proportional to N
// 0 - proportional to N * log(N)
// 0 - proportional to N * N ----- Its correct

object lists extends App {

  def insert(x: Int, xs: List[Int]): List[Int] = xs match {
    /// case List() => ???
    /// case y :: ys => ???

    case List() => List(x)
    case y :: ys => if (x <= y) x :: xs else y :: insert(x, ys)
  }
}
