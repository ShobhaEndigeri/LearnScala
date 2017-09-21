
object Tuples {
  def main(args: Array[String]) {
    val t1 = new Tuple3(2, "abc",220.2356)
    
    val t2 = (1,2,3,4)
    
    val sum = t2._1+t2._2+t2._3+t2._4
    println( "Sum of elements: " + sum )
    
    val t3 = ("abc","def","ijk","lmn")
    t3.productIterator.foreach(i => println("value ---"+i))

    var t4 = new Tuple2(123,"abc")
    println("Swapped tuple-----"+t4.swap);
    
    val t5 = (1,"a",2,"b")
    println(t5.toString())
  }
}