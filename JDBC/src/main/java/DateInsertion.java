import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DateInsertion {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?user=root&password=root");
		Statement st = con.createStatement();
//		String sql = "insert into std values(101, 'AAAA', '1997-7-10')";
//		st.execute(sql);
		PreparedStatement ps = con.prepareStatement("INSERT INTO std VALUES(?,?,?)");
		ps.setInt(1, 103);
		ps.setString(2, "CCCC");
		
		//to find current date
		java.util.Date d = new java.util.Date();
		long time = d.getTime();
		java.sql.Date dt = new java.sql.Date(time);
		
		//to custom date
		java.sql.Date cd = java.sql.Date.valueOf("1947-8-15");
		System.out.println(cd);
		
		ps.setDate(3, dt);
		ps.execute();
		con.close();
		System.out.println("Success");
	}
}
