package com.scala.examples

object stringReturnExmp {
  def main(args:Array[String]) {
    println(func1)
    println(func2)
    println(func3)
  }
  
  def func1:Unit = {
    "This String wont be returned"
  }
  
  def func2 {
    "This Strig also wont be returned"
  }
  
  def func3 = {
    "This String will be returned"
  }
}