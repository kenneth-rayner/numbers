package app

import scala.io.StdIn

object ReversedSeq extends App {

  def makeList(Number: Int): List[Int] = {
    val x = (1 to Number).toList.reverse
    x


  }

  println("Please enter a number:")
  var userVal = StdIn.readInt
  println(makeList(userVal))
}