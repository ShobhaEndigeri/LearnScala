package com.scala.examples

import scala.collection.mutable.ArrayBuffer

object collection2 {
  def main(args:Array[String]){
    val buf = new ArrayBuffer[Int]()
    buf +=10
    buf +=20
    buf +=30
    buf +=40
    
    buf.foreach((x:Int) => print(x+" "))
    println()
    println(buf.length)
    println(buf(1))
  }
}