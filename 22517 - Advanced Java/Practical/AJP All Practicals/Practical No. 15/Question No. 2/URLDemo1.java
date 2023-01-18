import java.net.URL;
import java.net.URLConnection;

public class URLDemo1 {
    URLDemo1() throws Exception
    {
        URL url = new URL("http://www.msbte.org.in");
        URLConnection urc = url.openConnection();

        System.out.println("Date: "+urc.getDate());
        System.out.println("Content Type: "+urc.getContentType());
        System.out.println("Content Length: "+urc.getContentLength());
    }

    public static void main(String[] args) throws Exception
    {
        new URLDemo1();
    }
}
