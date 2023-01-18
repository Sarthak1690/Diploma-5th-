import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    Server() throws Exception
    {
        ServerSocket s1 = new ServerSocket(1010);
        Socket s = s1.accept();

        DataInputStream in = new DataInputStream(s.getInputStream());
        DataOutputStream out = new DataOutputStream((s.getOutputStream()));

        String Userid = in.readUTF();
        String pass = in.readUTF();
        if(Userid.equals("1238") && pass.equals("Surya@1238"))
        {
            String validate = "Authenticated Successfully!!!";
            out.writeUTF(validate);
        }
        else
        {
            String str = "Enter correct details!!!";
            out.writeUTF(str);
        }
    }

    public static void main(String[] args) throws Exception{
        new Server();
    }
}
