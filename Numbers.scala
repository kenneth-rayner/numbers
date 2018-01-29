package app

import scala.io.StdIn
import scala.collection.mutable.MutableList
import scala.collection.mutable.ListBuffer


object Numbers extends App {
  println("Please enter a number:")
  var userVal = StdIn.readInt

 // while (userVal > 0) {

    // val list = MutableList[Any]()
    val list = List.range(userVal, 0)

    //   list += (userVal)
    //   userVal -=1

    println(list)
  }

