package scala_exercises.week02

// Modify the Rational class so that rational numbers are kept
// unsimplified internally, but the simplification is applied when
// numbers are converted to strings
// Do clients observe the same behavior when interacting with the
// rational class ?

// Yes for small sizes of denominators and nominators and small numbers of operations

object exercise05Lecture26MoreFunWithRationals extends App {
  val x = new Rational2(1, 3)
  val y = new Rational2(5, 7)
  val z = new Rational2(3, 2)

  x.numer
  x.denom
  println(x.sub(y).sub(z))
  println(y.add(y))
  println(x.less(y))
  println(x.max(y))
  println(new Rational2(2))
}



class Rational2(x: Int, y: Int) {
  require(y != 0, "denominator must be nonzero")

  def this(x: Int) = this(x, 1)

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  def numer = x
  def denom = y

  def less(that: Rational2) = numer * that.denom < that.numer * denom

  def max(that: Rational2) = if (this.less(that)) that else this

  def add(that: Rational2) =
    new Rational2(
      numer * that.denom + that.numer * denom,
      denom * that.denom)

  def neg: Rational2 = new Rational2(-numer, denom)

  def sub(that: Rational2) = add(that.neg)

  override def toString: String = {
    val g = gcd(numer, denom)
    numer/g + "/" + denom/g
  }
}