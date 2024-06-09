import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayDate {
	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?user=root&password=root");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM std");
		
		System.out.print(String.format("%-15s", "ID"));
		System.out.print(String.format("%-15s", "NAME"));
		System.out.print(String.format("%-15s", "Date")+"\n");
		
		while(rs.next()) {
			System.out.print(String.format("%-15s",rs.getInt(1)));
			System.out.print(String.format("%-15s",rs.getString(2)));
			System.out.print(String.format("%-15s",rs.getDate(3))+"\n");
		}
		
	}
}
