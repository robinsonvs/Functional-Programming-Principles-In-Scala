package scala_exercises.week02

// Exercise
// 1 - Write a product function that calculates the product
// of the values of a function for the points on a given interval.
// 2 - Write factorial in terms of product.
// 3 - Can you write a more general function, which generalizes both
// sum and product ?

object exercise02Lecture22Curryng extends App {
  //1
  def product(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x, y) => x * y, 1)(a, b)
  println(product(x => x * x)(3, 4))

  //2
  def fact(n: Int) = product(x => x)(1, n)
  println(fact(5))

  //3
  def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int =
    if (a > b) zero
    else combine(f(a), mapReduce(f, combine, zero)(a + 1, b))
}
