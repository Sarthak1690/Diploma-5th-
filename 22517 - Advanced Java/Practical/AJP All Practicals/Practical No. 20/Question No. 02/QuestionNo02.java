import java.sql.*;

public class QuestionNo02 {
    public QuestionNo02()
    {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String user = "root";
            String pass = "Surya@1238";
            String url = "jdbc:mysql://localhost:2138/abc";
            Connection conn = DriverManager.getConnection(url,user,pass);
			String q = "delete from product where price > 500 AND id='P1234'";
            Statement st = conn.createStatement();

			int i = st.executeUpdate(q);
			System.out.println(i + " records Deleted");
			conn.close();
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
