import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    Client() throws Exception
    {
        Socket s = new Socket("localhost",3030);

        DataInputStream in = new DataInputStream(s.getInputStream());
        DataOutputStream out = new DataOutputStream((s.getOutputStream()));

        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        out.writeUTF(n);

        String prime = in.readUTF();
        System.out.println(prime);

    }

    public static void main(String[] args) throws Exception{
        new Client();
    }
}
