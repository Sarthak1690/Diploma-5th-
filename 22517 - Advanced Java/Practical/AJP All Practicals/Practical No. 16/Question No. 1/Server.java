import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    Server() throws Exception
    {
        ServerSocket s1 = new ServerSocket(2020);
        Socket s = s1.accept();

        DataInputStream in = new DataInputStream(s.getInputStream());
        DataOutputStream out = new DataOutputStream(s.getOutputStream());

        String hello = "";
        String goodbye = "";

        Scanner sc = new Scanner(System.in);
        String hii = in.readUTF();
        if(hii.equals("Hii")){
            System.out.println(hii);
            hello = sc.nextLine();
            out.writeUTF(hello);
        }

        String bye = in.readUTF();

        if(bye.equals("Bye"))
        {
            System.out.println(bye);
            bye = sc.nextLine();
            out.writeUTF(bye);
        }
    }

    public static void main(String[] args) throws Exception{
        new Server();
    }
}
