package com.scala.examples

object PartiallyAppliedFuncs {
  
  def main(args:Array[String]) {
    sum(1,2,3)
    a(4,5,6)
    a.apply(10, 20, 30)
    b(2)
    b(5)
  }
  
  val a = sum _
  
  val b = sum(1,_:Int,3)
  
  def sum(a:Int,b:Int,c:Int):Int = {
    println(a+b+c)
    a+b+c
  }
  
}