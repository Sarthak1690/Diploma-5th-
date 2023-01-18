import java.sql.*;

public class Main2 {
    public Main2()
    {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String user = "root";
            String pass = "Surya@1238";
            String url = "jdbc:mysql://localhost:2138/abc";
            Connection conn = DriverManager.getConnection(url,user,pass);
			PreparedStatement st = conn.prepareStatement("update student set roll_no=3 where fname='Abhishek'");
			st.executeUpdate();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws Exception {
        new Main2();
    }
}
