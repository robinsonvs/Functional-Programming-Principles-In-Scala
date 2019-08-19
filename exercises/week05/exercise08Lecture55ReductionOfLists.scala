package scala_exercises.week05

// Here is another formulation of concat:
//      def concat[T](xs: List[T], ys: List[T]): List[T] =
//          (xs foldRight ys)(_ :: _)
//
// Here, is isn't possible to replace foldRight by foldLeft. Why ?
// 0 - The types would not work out
// 0 - The resulting function would not terminate
// 0 - The result would be reversed

object exercise08Lecture55ReductionOfLists {

}
