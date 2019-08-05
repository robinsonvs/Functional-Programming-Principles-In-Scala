package scala_exercises.week04

// Exercise 1
// Provide an implementation of the abstract class Nat tha represents
// non-negative integers

// Exercise 2
// Do not use standart numerical classes in this implementation.
// Rather, implement a sub-object and a sub-class:
//      object Zero extends Nat
//      class Succ(n: Nat) extends Nat
// One for the number zero, the other for strictly positive numbers.
// (this one is a bit more involved than previous quizzes)

// Peano numbers

abstract class Nat {
  def isZero: Boolean
  def predecessor: Nat
  def successor = new Succ(this)
  def +(that: Nat): Nat
  def -(that: Nat): Nat
}

object Zero extends Nat {
  def isZero = true
  def predecessor = throw new Error("0.predecessor")
  def +(that: Nat) = that
  def -(that: Nat) = if (that.isZero) this else throw new Error("negative number")
}

class Succ(n: Nat) extends Nat {
  def isZero = false
  def predecessor = n
  def +(that: Nat) = new Succ(n + that)
  def -(that: Nat) = if (that.isZero) this else n - that.predecessor
}

object exercise01Lecture41ObjectsEverywhere extends App {
}
