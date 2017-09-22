package com.scala.examples

object Tuples2 {
  def main(args:Array[String]) {
    var longWord = longestWord("Hello , good afternoon".split(" "))
    println("Longest word found is ["+longWord._1+"] found at location ["+longWord._2+"]")
  }
  
  def longestWord(arr:Array[String]) ={
    var word = arr(0);
    var idx = 0
    for(i<-0 until arr.length) {
      if(arr(i).length() > word.length()){
        word = arr(i)
        idx = i
      }
    }
    (word,idx)
  }
}