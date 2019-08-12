package scala_exercises.week04

// Write a function show that uses pattern matching to return the
// representation of a given expressions as string
//
// def show(e: Expr): String = ???

trait Expr
case class Number(n: Int) extends Expr
case class Sum(e1: Expr, e2: Expr) extends Expr

object exprs extends App {

  def show(e: Expr): String = e match {
    case Number(x) => x.toString
    case Sum(l, r) => show(l) + " + " + show(r)
  }

  println(show(Sum(Number(1), Number(144))))
}
