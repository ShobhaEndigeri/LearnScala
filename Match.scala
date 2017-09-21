
object Match {
  def main(args: Array[String]){
    for( a <- args ) a match{
      case "1" =>
        println("argument is one");
      case "2" =>
        println("argument is two");
      case x =>
        println("Unknown");
    }
  }
}
