object Threading {
  class Th extends Thread {
    override def run () {
      println("Hello world this is msg from the new thread")
    }
  }


  class ThRunable extends Runnable {
    override def run() {
      println ("Hello world this from runnable thred")
    }
  }
  def main(arg:Array[String]) :Unit = {
    // let's do this 
    println ("Printing from the main thread: ")
    val th = new Th()

    th.start()

    val thRunnable = new Thread(new ThRunable)
    thRunnable.start();
  }
}
