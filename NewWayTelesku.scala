/*
 *  This piece code not completely borrowed from telesku only 1% of code is learned from telesku rest of them is from different soruces... Especially ;
 *  From Site : https://examples.javacodegeeks.com/jvm-languages/scala/functional-programming-scala/#prog-paradignm
 *
 * */
object NewWayTelesku {
  case class Hero (name:String) {
    def printName() : String ={
      
      println("hello "+this.name)
      val name = "Masud karim"
      return name
    }
    def fun():Unit = {
      println("Fun with no arg")
    }
    def fun(num:Int):Unit={
      println("Fun with arg")
    }

  }
  def main(args:Array[String]) {
    println("hello world")
    val obj = Hero("masud karim");
    val name = obj.printName();

    println("VAirable name : "+name)

    val anno = (name:String) => {
      "Hello " +name
    }

    println(anno("Masud karim"))

    def sayHello(name:String) = {
      "Hello this is def method type of function "+name
    }

    println(sayHello("masud krim"))
    val x = "Hello masud "

    println(s"New way of printing a string like python $x")
    val xx = x.reverse

    println(xx)

    obj.fun
    obj.fun(43)

    // Higher order function (HOF)
    val add = (x:Int, y:Int) => {x + y}  
    operation(add)
    val subtract = (x:Int, y:Int) => {x - y}  
    operation(subtract)
    val multiply = (x:Int, y:Int) => {x * y}  
    operation(multiply)

  }

  def operation(f:(Int, Int)=> Int) {
    println(f(5,5))
  } 
}
