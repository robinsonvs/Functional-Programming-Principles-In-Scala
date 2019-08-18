package scala_exercises.week05

// Using pack, write a function encode that produces the run-length
// encoding of a list.
// The idea is to encode n consecutive duplicates of an element x as a
// pair (x, n). For instance,
//
// encode(List("a","a","a","b","c","c","a"))
// should give
// List(("a",3), ("b",1), ("c",2), ("a",1)).

import scala_exercises.week05.exercise06Lecture54HigherOrderListFunctions.pack

object exercise07Lecture54HigherOrderListFunctions extends App {

  val data = List("a", "a", "a", "b", "c", "c", "a")

  def encode[T](xs: List[T]): List[(T, Int)] =
    pack(xs) map (ys => (ys.head, ys.length))

  println(encode(data))
}
