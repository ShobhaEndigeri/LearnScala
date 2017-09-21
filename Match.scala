
object Match {
  def main(args: Array[String]){
    match1(Array(1,2,13))
    match2(Array("a"))
  }
  
  def match1(args:Array[Int]):Unit = {
    for( a <- args ) a match{
      case 1 =>
        println("argument is one");
      case 2 =>
        println("argument is two");
      case x =>
        println("Unknown");
    }
  }
  
  def match2(args:Array[String]):Unit = {
    val firstArg = if(args.length>0) args(0) else ""
    val result = firstArg match {
      case "a" => "pressed a"
      case "b" => "pressed b"
      case "c" => "pressed c"
      case _ => "bla! bla!"
    }
    println(result)
  }
}
