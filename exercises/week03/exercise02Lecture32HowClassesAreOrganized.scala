package scala_exercises.week03

// What is the type of
// if (true) 1 else false
// 0 Int
// 0 Boolean
// 0 AnyVal
// 0 Object
// 0 Any

import scala_exercises.week02.Rational

object exercise02Lecture32HowClassesAreOrganized extends App {

  new Rational(1, 2)

  def error(msg: String) = throw new Error(msg) // error = Nothing

  val x =   null; // x = Null
  val y: String = x // y = String

  val z: Int = null // error = type mismatch

  if (true) 1 else false // 1 = AnyVal
}
