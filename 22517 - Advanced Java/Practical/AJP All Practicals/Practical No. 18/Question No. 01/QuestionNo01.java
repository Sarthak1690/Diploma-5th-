import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class QuestionNo01 {
    public QuestionNo01()
    {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String user = "root";
            String pass = "Surya@1238";
            String url = "jdbc:mysql://localhost:2138/student";
            Connection conn = DriverManager.getConnection(url,user,pass);

            Statement st = conn.createStatement();
			String sql = "create table employee(emp_id int, emp_name varchar(100))";

			st.executeUpdate(sql);  
			System.out.println("Created table in given database..."); 
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws Exception {
        new QuestionNo01();
    }
}
