import java.sql.*;

public class QuestionNo01 {
    public QuestionNo01()
    {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String user = "root";
            String pass = "Surya@1238";
            String url = "jdbc:mysql://localhost:2138/abc";
            Connection conn = DriverManager.getConnection(url,user,pass);
			PreparedStatement st = conn.prepareStatement("update student set fname='John' where fname='Jack'");
			int n = st.executeUpdate();
			System.out.println(n + " records updated..");
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
