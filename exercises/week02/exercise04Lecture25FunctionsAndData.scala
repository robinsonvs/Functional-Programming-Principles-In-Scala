package scala_exercises.week02

// 1 - Add a method neg to class Rational that is
// used like this: x.neg evaluates to -x
// 2 - Add a method sub to subtract two rational numbers
// 3 - With the values of x, y, z as given in the previous slide, what is
// the result of
// x - y - z ?
//

object exercise04Lecture25FunctionsAndData extends App {
  val x = new Rational(1, 3)
  val y = new Rational(5, 7)
  val z = new Rational(3, 2)

  x.numer
  x.denom
  println(x.sub(y).sub(z))
}

class Rational(x: Int, y: Int) {
  def numer = x
  def denom = y

  def add(that: Rational) =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom)

  def neg: Rational = new Rational(-numer, denom)

  def sub(that: Rational) = add(that.neg)

  override def toString: String = numer + "/" + denom
}


