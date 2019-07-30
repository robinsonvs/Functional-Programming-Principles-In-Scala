package scala_exercises.week03

//

object intSets extends App {
  var t1 = new NonEmpty1(3, new Empty1, new Empty1)
  var t2 = t1 incl 4
  println(t1)
  println(t2)
}

abstract class IntSet1 {
  def incl(x: Int): IntSet1
  def contains(x: Int): Boolean
}

class Empty1 extends IntSet1 {
  def contains(x: Int): Boolean = false
  def incl(x: Int): IntSet1 = new NonEmpty1(x, new Empty1, new Empty1)
  override def toString = "."
}

class NonEmpty1(elem: Int, left: IntSet1, right: IntSet1) extends IntSet1 {
  def contains(x: Int): Boolean =
    if (x < elem) left contains x
    else if (x > elem) right contains x
    else true

  def incl(x: Int): IntSet1 =
    if (x < elem) new NonEmpty1(elem, left incl x, right)
    else if (x > elem) new NonEmpty1(elem, left, right incl x)
    else this

  override def toString: String = "{" + left + elem + right + "}"
}
