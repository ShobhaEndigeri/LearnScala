package com.scala.examples.classes

class Calculator(brand:String) {
	val color: String = if(brand == "TI") {
    "red";
  }
	else if(brand == "HP") {
    "black";
  }
  else {
    "green"
  }
  
	def add(m:Int,n:Int) = m+n;
	
	override def toString = {
	  "Calculator with color "+color;
	}
}
  
object ConstructorDemo {
  def main(args:Array[String]) {
    val calc = new Calculator("HP")
    println(calc)
    println(calc.color)
    println(calc.add(1,2))
    
  }
}