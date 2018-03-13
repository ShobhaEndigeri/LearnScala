package com.scala.examples.classes

abstract class Shape {
   def getArea:Int
}

class Circle(r:Int) extends Shape {
  def getArea:Int ={
    val area = Math.PI*r*r
    area.toInt
  }
}

object AbstractClassDemo {
  def main(args:Array[String]) {
    val c = new Circle(2);
    println(c.getArea);
  }
}
