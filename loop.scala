object Loop {
  def main(args:Array[String]) :Unit = {
    val list = List (1,21,321,231,32,1,21,3265,32);

    val aList = for {x <- list if x != 3; if x <= 32}   yield x

    for (x <- aList) {
      println(x)
    }
  }
}
