import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class main1 {
    public main1()
    {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String user = "root";
            String pass = "Surya@1238";
            String url = "jdbc:mysql://localhost:2138/student";
            Connection conn = DriverManager.getConnection(url,user,pass);

            PreparedStatement stmt=conn.prepareStatement("insert into student values(?,?,?)");  
			stmt.setInt(1,1); 
			stmt.setString(2,"Suraj Tapkir");  
			stmt.setString(3,"Karjat");  
			  
			int i=stmt.executeUpdate();  
			System.out.println(i+" records inserted"); 
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws Exception {
        new main1();
    }
}
