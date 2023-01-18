import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    Client() throws Exception
    {
        Socket s = new Socket("localhost",1010);

        DataInputStream in = new DataInputStream(s.getInputStream());
        DataOutputStream out = new DataOutputStream(s.getOutputStream());

        Scanner sc = new Scanner(System.in);
        String userid;
        String password;
        System.out.println("Enter User ID: ");
        userid = sc.next();
        System.out.println("Enter Password: ");
        password = sc.next();
        out.writeUTF(userid);
        out.writeUTF(password);


        String str = in.readUTF();
        System.out.println(str);

    }

    public static void main(String[] args) throws Exception{
        new Client();
    }
}
