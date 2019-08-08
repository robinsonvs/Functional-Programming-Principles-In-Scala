package scala_exercises.week04

// The problematic array example would be written as follows in Scala:
//
// val a: Array[NonEmpty] = Array(new NonEmpty(1, Empty, Empty))
// val b: Array[IntSet] = a
// b(0) = Empty
// val s: NonEmpty = a(0)
//
// When you try out this example, what do you observe?
//
// 0 - A type error in line 1
// 0 - A type error in line 2
// 0 - A type error in line 3
// 0 - A type error in line 4
// 0 - A program that compiles and throws an exception at run time
// 0 - A program that compiles and runs without exception
//
// R - A type error in line 2 - because Array[NonEmpty] < (subtype) Array[InsSet] and
//     in Scala arrays are not Covariant

object exercise03Lecture43SubtypingAndGenerics {

}
