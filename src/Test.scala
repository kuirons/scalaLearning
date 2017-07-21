/**
  * Created by khx on 17-7-21.
  */
object Test {
  def main(args: Array[String]) {
    printStrings("Runoob", "Scala", "Python");
  }
  def printStrings( args:String* ) = {
    var i : Int = 0;
    for( arg <- args ){
      println("Arg value[" + i + "] = " + arg );
      i = i + 1;
    }
  }
}
