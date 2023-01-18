import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class QuestionNo01 {
    public QuestionNo01()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String user = "root";
            String pass = "Surya@1238";
            String url = "jdbc:mysql://localhost:2138/diploma_fifth_semester";
            Connection conn = DriverManager.getConnection(url,user,pass);

            String q = "select * from user;";

            Statement s = conn.createStatement();

            ResultSet r = s.executeQuery(q);

            while(r.next())
            {
                String User_Name = r.getString(1);
                int PassWord = r.getInt(2);

                System.out.println("User Name: "+User_Name);
                System.out.println("Password: "+PassWord);
            }

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new QuestionNo01();
    }
}
