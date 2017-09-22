package com.scala.examples

object FirsClassFunc {
  var increase = (x:Int) => x+1;
  
  var increaseWithPrint = (y:Int) => {
    println("We");
    println("are");
    println("here");
    y+1;
  }
  
  def main(args:Array[String]){
    println(increase(20));
    println(increaseWithPrint(100));
    numbers.foreach((x:Int) => println(x))
    println(numbers.filter((x:Int) => x > 30));
  }
  
  val numbers = List(10,20,30,40,50,60)
  
}