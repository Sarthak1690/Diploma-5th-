import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutionException;

public class Server {
    Server() throws Exception{
        ServerSocket s1 = new ServerSocket(3030);
        Socket s = s1.accept();

        DataInputStream in = new DataInputStream(s.getInputStream());
        DataOutputStream out = new DataOutputStream((s.getOutputStream()));

        int n = Integer.parseInt(in.readUTF());
        boolean flag = false;

        if(n == 0 || n == 1)
        {
            flag = true;
        }

        for(var i = 2; i <= n/2; i++)
        {
            if(n % i == 0)
            {
                flag = true;
                break;
            }
        }

        if(flag == false)
        {
            out.writeUTF("The Number is Prime...");
        }
        else
        {
            out.writeUTF("The Number isn't Prime...");
        }
    }

    public static void main(String[] args) throws Exception{
        new Server();
    }
}
