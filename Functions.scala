package com.sundogsoftware.spark.examples

object Functions {
  def main(args:Array[String]) {
    someFunc
    println(isEven(2))
    funFunc(5)
  }
  
  def someFunc() {
    val list = List (10,33,99,23,76,45)
    
    list.foreach(x => println(x))
    
    list.foreach(println _)
    
    list.foreach(println)
  }
  
  def isEven(x:Int):Boolean = {
    if(x==0)
       true;
    else
      isOdd(x-1)
  }
  
  def isOdd(y:Int):Boolean = {
    if(y==0)
       false;
    else
      isEven(y-1)
  }
  
  
  val funFunc = nestedFunc _
  
	def nestedFunc(z:Int) {
	  if(z==0)
		  print(z+" ")
		else {
			  print(z+" ")
			  funFunc(z-1)
		  }
  }
  
}