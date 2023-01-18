import java.net.*;

public class URLDemo
{
    URLDemo() throws Exception
    {
        URL url = new URL("http://www.msbte.org.in");
        System.out.println("Host: "+url.getHost());
        System.out.println("Protocol: "+url.getProtocol());
        System.out.println("Port: "+url.getPort());
        System.out.println("File: "+url.getFile()); 
    }
    public static void main(String args[]) throws Exception
    {
        new URLDemo();
    }
}