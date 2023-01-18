import java.sql.*;

public class Main1 {
    public Main1()
    {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String user = "root";
            String pass = "Surya@1238";
            String url = "jdbc:mysql://localhost:2138/MSBTE";
            Connection conn = DriverManager.getConnection(url,user,pass);
			String q = "delete from student where id = 1;";
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
        new Main1();
    }
}
