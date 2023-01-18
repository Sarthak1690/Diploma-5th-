import java.net.InetAddress;
import java.util.Scanner;

public class FindIP {
    void find()
    {
            try
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Hostname: ");
                String s = sc.next();

                if(s.equals("localhost"))
                {
                    InetAddress ip = InetAddress.getByName("localhost");
                    System.out.println("IP Address: "+ip.getHostAddress());
                }
            }
            catch (Exception e)
            {
                System.out.println(e);
            }

    }

    public static void main(String[] args) {
        new FindIP().find();
    }
}
