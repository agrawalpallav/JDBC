import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetEmps {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException  {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?user=root&password=root");
		Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet rs = st.executeQuery("SELECT * FROM emp");
		
		rs.afterLast();
		rs.beforeFirst();
		
		while(rs.next()) {
			System.out.print(rs.getInt(1)+"  ");
			System.out.print(rs.getString(2)+"  ");
			System.out.println(rs.getInt(3)+"  ");
		}
		
		System.in.read();
		rs.refreshRow();
		
		while(rs.previous()) {
			System.out.print(rs.getInt(1)+"  ");
			System.out.print(rs.getString(2)+"  ");
			System.out.println(rs.getInt(3)+"  ");
		}
	}
}
