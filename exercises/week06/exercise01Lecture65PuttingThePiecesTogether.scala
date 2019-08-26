package scala_exercises.week06

import scala.io.Source

// Task
// Phone keys have mnemonics assigned to them
// Assume you are given a dictionary words as a list of words
// Design a method translate such that
// translate(phoneNumber)
// produces all phrases of words that can serve as mnemonics for the
// phone number
// Example: The phone number "7225247386" should have the
// mnemonic Scala is fun as one element of the set of solution phrases.
//

object exercise01Lecture65PuttingThePiecesTogether extends App {

  val in = Source.fromURL("http://lamp.epfl.ch/files/content/sites/lamp/files/teaching/progfun/linuxwords")

  val words = in.getLines.toList filter (word => word forall (chr => chr.isLetter))

  val mnem = Map(
    '2' -> "ABC",
    '3' -> "DEF",
    '4' -> "GHI",
    '5' -> "JKL",
    '6' -> "MNO",
    '7' -> "PQRS",
    '8' -> "TUV",
    '9' -> "WXYZ"
  )

  /** Invert the mnem map to give a map from chars 'A' ... 'Z' to '2' ... '9'  */
  val charCode: Map[Char, Char] =
    for ((digit, str) <- mnem; ltr <- str) yield ltr -> digit

  /** Maps a word to the digit string it can represent , e.g. "Java" -> "5282" */
  def wordCode(word: String): String =
    word.toUpperCase map charCode

  println(wordCode("Java"))

  /**
   *  A mao from digit strings to the words that represent them,
   *  e.g. "5282" -> List("Java", "Kata", "Lava", ...)
   *  Note: A missing number should map to the empty se, e.g. "1111" -> List()
   */
  val wordsForNum: Map[String, Seq[String]] =
    words groupBy wordCode withDefaultValue Seq()

  /** Return all ways to encode a number as a list or words */
  def encode(number: String): Set[List[String]] =
    if (number.isEmpty) Set(List())
    else {
      for {
        split <- 1 to number.length
        word <- wordsForNum(number take split)
        rest <- encode(number drop split)
      } yield word :: rest
    }.toSet

  println(encode("7225247386"))

  def translate(number: String): Set[String] =
    encode(number) map (_ mkString " ")

  println(translate("7225247386"))
}
