import java.io.DataOutputStream;
import java.net.Socket;

object Server { 
  def main(args: Array[String]) : Unit = {
    try {
      val socket = new Socket ("localhost",4444);

      val dos = new DataOutputStream(socket.getOutputStream());

      dos.writeUTF("Hello world");

      dos.flush();
      dos.close();

      socket.close();
    } catch {
      case x:Exception=> {
        x.printStackTrace();
      }
    }
  }
}
