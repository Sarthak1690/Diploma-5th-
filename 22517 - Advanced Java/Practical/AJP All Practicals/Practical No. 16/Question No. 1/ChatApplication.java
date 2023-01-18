import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ChatApplication {
    ChatApplication() throws Exception
    {
        Socket s = new Socket("localhost",2020);

        DataInputStream in = new DataInputStream(s.getInputStream());
        DataOutputStream out = new DataOutputStream(s.getOutputStream());

        String hii = "";
        String bye = "";


        Scanner sc = new Scanner(System.in);
        hii = sc.nextLine();
        out.writeUTF(hii);

        String hello = in.readUTF();
        if(hello.equals("Hello"))
        {
            System.out.println(hello);
            bye = sc.nextLine();
            out.writeUTF(bye);
        }

        String goodbye = in.readUTF();
        System.out.println(goodbye);
    }

    public static void main(String[] args) throws Exception{
        new ChatApplication();
    }
}
