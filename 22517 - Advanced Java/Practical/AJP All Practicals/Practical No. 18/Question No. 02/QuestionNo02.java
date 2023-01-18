import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class QuestionNo02 {
    public QuestionNo02()
    {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String user = "root";
            String pass = "Surya@1238";
            String url = "jdbc:mysql://localhost:2138/suraj";
            Connection conn = DriverManager.getConnection(url,user,pass);
			String q = "select roll_no,name from student where marks > 70;";

            Statement s = conn.createStatement();

            ResultSet rs = s.executeQuery(q);
			while(rs.next())
			{
				int roll_no = rs.getInt(1);
				String name = rs.getString(2);
				System.out.println("ID: " + roll_no + " " + "Name: " + name);
			}
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws Exception {
        new QuestionNo02();
    }
}
