import java.util.List;
import java.util.ArrayList;
import java.io.DataInputStream;
import java.net.ServerSocket;
object Client {
  def main(args:Array[String]) : Unit = {
    val port:Int = 4444;
    try {
      val socket = new ServerSocket (port)
    
      val s = socket.accept();
    
      val dis = new DataInputStream(s.getInputStream());

      val str:String = dis.readUTF();

      println("msg : "+str);

      socket.close();
    }
    catch {
      case e : Exception =>{
    
        println(e.printStackTrace())
       }
    }
  }
}
