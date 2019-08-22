package scala_exercises.week06

// example

object example01Lecture61OtherCollections extends App {

  // Sequence operations
  val xs = Array(1, 2, 3, 44)
  println(xs map (x => x * 2))

  val s = "Hello World"
  println(s filter (c => c.isUpper))

  println(s exists (c => c.isUpper))
  println(s forall (c => c.isUpper))

  val pairs = List(1, 2, 3) zip s
  println(pairs.unzip)

  //println(s flatMap (c => List('.', c)))

  println(xs.sum)
  println(xs.max)

  //Example Combinations
  //(1 to M) flatMap (x => (1..N) map (y => (x, y)))
}

