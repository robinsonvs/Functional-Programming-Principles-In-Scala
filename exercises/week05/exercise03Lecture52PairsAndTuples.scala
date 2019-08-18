package scala_exercises.week05

// The merge function as given uses a nested pattern match.
// This does not reflect the inherent symmetry of the merge algorithm.
// Rewrite merge using a pattern matching over pairs.

object mergeSort extends App {

    def msort(xs: List[Int]): List[Int] = {
      val n = xs.length / 2
      if (n == 0) xs
      else {
        def merge(xs: List[Int], ys: List[Int]): List[Int] = (xs, ys) match {
          case (Nil, ys) => ys
          case (xs, Nil) => xs
          case (x :: xs1, y :: ys1) =>
            if (x < y) x :: merge(xs1, ys)
            else y :: merge(xs, ys1)
        }

        val (fst, snd) = xs splitAt n
        merge(msort(fst), msort(snd))
      }
    }

    val nums = List(2, -4, 5, 7, 1)
    println(msort(nums))
}
