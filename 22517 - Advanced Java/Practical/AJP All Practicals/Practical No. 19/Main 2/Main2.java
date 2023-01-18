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

            PreparedStatement stmt = conn.prepareStatement("insert into student values(?,?,?)");
			stmt.setInt(1,101);
			stmt.setString(2,"Abhishek");
			stmt.setString(3,"Yadav");

			int i = stmt.executeUpdate();
			System.out.println(i + " records inserted");
			conn.close();
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
