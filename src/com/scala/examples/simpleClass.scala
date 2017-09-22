package com.scala.examples

object simpleClass {
  
  class checkSumAccumulator {
    private var sum = 0
    
    def add(x:Int):Int ={
      sum = sum+1
      sum
    }
    
    def printSum(){
      println(sum)
    }
  }
  
  def main(args:Array[String]) {
    val calc1 = new checkSumAccumulator()
    calc1.printSum
    calc1.add(2)
    calc1.printSum
    
    val calc2 = new checkSumAccumulator()
    calc2.printSum
    calc2.add(10)
    calc2.printSum
  }
  
}