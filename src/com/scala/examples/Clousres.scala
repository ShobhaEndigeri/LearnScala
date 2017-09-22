package com.scala.examples

object Clousres {
  
  def main(args:Array[String]) {
    println(addMore(100))
    println(addMore(200))
    more = 100
    println(addMore(300))
    println(multiplier(10))
    println(sum)
  }
  
  var more = 2
  var sum = 10

  val addMore =(x:Int) => x+more;
  
  def multiplier(y:Int) = {
    y*more;
  }
  
  val someNumbers = List(1,2,3,4,5)
  someNumbers.foreach(sum+=_)
}