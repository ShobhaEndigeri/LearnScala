package com.scala.examples

object placeHolder {
  
  val list =  List(10,20,30,40,50,60,70,80,90,100)

  val sum = (_:Int) + (_:Int)

  def main(args:Array[String]) {
    
    println(list.filter(x => x>50))
    
    println(list.filter(_>50))

    println(sum(1,2))
    
  }
}