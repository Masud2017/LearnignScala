import java.io._

object FileHandling {
  def main(args:Array[String]):Unit={
    println("File is creating : ")

    val filePointer = new File("log.txt");
    val fileWriter = new FileWriter(filePointer)

    fileWriter.write("hello world")
    fileWriter.close()


    val fp2 = new File("log2.txt")
    val writer = new PrintWriter(fp2)

    writer.write("Hello world this is printwriter output\n")
    writer.close()
  }
}
