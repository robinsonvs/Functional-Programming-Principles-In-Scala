package scala_exercises.week06

import com.sun.xml.internal.org.jvnet.staxex.NamespaceContextEx.Binding
import sun.security.util.PolicyUtil

// The + operation on Poly used map concatenation with ++.
// Design another version of + in terms of foldLeft:
//
// def + (other: Poly) = new Poly((other,terms foldLeft ???)(addTerm)
// def addTerm(terms: Map[Int, Double], term: (Int, Double)) = ???
//
// Which of the two versions do you believe is more efficient ?
// 0 - The version using ++
// 0 - The version using foldLeft --- Its correct
//

object exercise01Lecture64Maps extends App {

  class Polynom(val terms: Map[Int, Double]) {
    def + (other: Polynom) = new Polynom(terms ++ (other.terms map addTerm))

    private def addTerm(term: (Int, Double)) = {
      val (degree, coeff) = term
      degree -> (coeff + terms(degree))
    }

    override def toString = {
      val termStrings =
        for ((pos, value) <- terms.toList.sorted.reverse) yield value + "x^" + pos
      termStrings mkString " + "
    }
  }

  def Polynom(bindings: (Int, Double) * ) =
    new Polynom(bindings.toMap withDefaultValue 0)



  class Poly(terms0: Map[Int, Double]) {
    def this(bindings: (Int, Double)*) = this(bindings.toMap)

    val terms = terms0 withDefaultValue 0.0

    def + (other: Poly) = new Poly((other.terms foldLeft terms)(addTerm))

    def addTerm(terms: Map[Int, Double], term: (Int, Double)): Map[Int, Double] = {
      val (exp, coeff) = term
      terms -> (exp -> (coeff + terms(exp)))
    }

    override def toString =
      (for ((exp, coeff) <- terms.toList.sorted.reverse) yield coeff + "x^" + exp) mkString " + "
  }

  val p1 = new Poly(1 -> 2.0, 3 -> 4.0, 5 -> 6.2)
  val p2 = new Poly(0 -> 3.0, 3 -> 7.0)
  p1 + p2
  println(p1.terms(7))
}
