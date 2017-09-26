package com.scala.examples

object Lists {
	def main(args:Array[String]) {
	  //List literals
		    val fruit1 = List("apples", "oranges", "pears")
				val nums1 = List(1,2,3,4)
				val diag31 = List(
						List(1,0,0),
						List(0,1,0),
						List(0,0,1)
						)
				val empty1 = List()
				
	//List Types
				val fruit2:List[String] = List("apples", "oranges", "pears")
				val nums2:List[Int] = List(1,2,3,4)
				val diag32:List[List[Int]]= List(
						List(1,0,0),
						List(0,1,0),
						List(0,0,1)
						)
				val empty2:List[Nothing] = List()
				
	//Basic operations
				println(empty1.isEmpty)
		    println(fruit1.isEmpty)
		    println(fruit1.head)
		    println(fruit1.tail.head)
		    println(diag31.head)
		    
	//List patterns
		    val List(a,b,c) = fruit1
		    println(a)
		    println(b)
		    println(c)
		    
	//reversing Lists
		    println(fruit1.reverse)
		    println(fruit1(0))
		    print(fruit1 take 2)
		    println(fruit1 drop 1)
		    println(fruit1 splitAt(1))
	}
}