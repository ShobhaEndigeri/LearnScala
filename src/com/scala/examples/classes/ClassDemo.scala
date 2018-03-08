package com.scala.examples.classes

class MyClass(x:Int,y:Int) {
  require(y>0, "y must be positive");
  def this(x:Int) = this(x,1);
  def nb1 = x;
  def nb2 = y;
  private def test(x:Int):Int = x*nb2;
  val nb3 = x+y;
  override def toString = x+","+y;
  
}

object ClassDemo {
  def main(args: Array[String]) {
    println(new MyClass(1,2));
  }
}