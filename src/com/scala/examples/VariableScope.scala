package com.scala.examples

object VariableScope {
  def main(args:Array[String]) {
    printA()
    printB()
  }
  
  def printA() = {
    val a = 1;
    {
      val a = 2;
      {
        println(a)
      }
    }
  }
  
  def printB() = {
    val b = 10;
    {
      val b = 20;
      println(b)
    }
    println(b);
  }
}
