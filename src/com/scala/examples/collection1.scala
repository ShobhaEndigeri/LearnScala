package com.scala.examples

object collection1 {

  val colors = List("red","yellow","pink","white")
  val fiveInts = new Array[Int](5)
  val fiveToOne = Array(5,4,3,2,1)
  
  def main(args:Array[String]) {
    println(colors.head)
    println(colors.tail)
    fiveInts.foreach((x:Int)=>print(x+" "))
    println()
    fiveToOne.foreach((x:Int)=>print(x+" "))
    println()
    fiveInts(1) = fiveToOne(3)
    fiveInts.foreach((x:Int)=>print(x+" "))
  }
  
}