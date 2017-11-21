package com.scala.examples

object TraitExample {
  trait Philosophical {
    def philosophize() {
      println("I consume memory, therefore I am!")
    }
  }
  
  class Frog extends Philosophical {
    
  }
  
  def main(args:Array[String]) {
    val Frog = new Frog
    println(Frog.philosophize())
  }
  
}