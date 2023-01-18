import java.sql.*;

public class QuestionNo02 {
    public QuestionNo02()
    {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String user = "root";
            String pass = "Surya@1238";
            String url = "jdbc:mysql://localhost:2138/MSBTE";
            Connection conn = DriverManager.getConnection(url,user,pass);
			String q = "update student set name = 'Saurabh Jadhav' where id = 1;";
            Statement st = conn.createStatement();

			int i = st.executeUpdate(q);
			System.out.println(i + " records Updated");
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
