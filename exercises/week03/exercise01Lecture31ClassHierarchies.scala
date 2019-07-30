package scala_exercises.week03

//Write a method union for forming the union of two sets.
//You should implement the following abstract class


object exercise01Lecture31ClassHierarchies extends App {
  var t1 = new NonEmpty(3, new Empty, new Empty)
  var t2 = t1 incl 4
  var t3 = t1 union t2
  var t4 = (new NonEmpty(7, new Empty, new Empty)) contains 7
  var t5 = new Empty contains 1
  println(t1)
  println(t2)
  println(t3)
  println(t4)
  println(t5)
}

abstract class IntSet {
  def incl(x: Int): IntSet
  def contains(x: Int): Boolean
  def union(other: IntSet): IntSet
}

class Empty extends IntSet {
  def contains(x: Int): Boolean = false
  def incl(x: Int): IntSet = new NonEmpty(x, new Empty, new Empty)
  override def toString = "."
  def union(other: IntSet): IntSet = other
}

class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {
  def contains(x: Int): Boolean =
    if (x < elem) left contains x
    else if (x > elem) right contains x
    else true

  def incl(x: Int): IntSet =
    if (x < elem) new NonEmpty(elem, left incl x, right)
    else if (x > elem) new NonEmpty(elem, left, right incl x)
    else this

  override def toString: String = "{" + left + elem + right + "}"

  def union(other: IntSet): IntSet =
    ((left union right) union other) incl elem
}
