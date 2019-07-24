package scala_exercises.week01

//Write a function AND and OR such tha for all argument
//expressions x and y
//do not use || and && in your implementation
//What are good operands to test that the equalities hold ?

object exercise01Lecture14CondictionalsAndValueDefinitions extends App {
  //by value
  def and(x: Boolean, y: Boolean): Boolean =
    if (x) y else false

  //by name
  def andByName(x: Boolean, y: => Boolean): Boolean =
    if (x) y else false

  //by value
  def or(x: Boolean, y: Boolean): Boolean =
    (x || y)

  //by name
  def orByName(x: Boolean, y: => Boolean): Boolean =
    (x || y)

  println(and(true, false))
  println(and(true, true))
  println(andByName(false, ???))

  println(or(true, false))
  println(or(true, true))
  println(orByName(true, ???))

}
