import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SaveEmp1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?user=root&password=root");
		CallableStatement cs = con.prepareCall(" call saveemp(103, 'Alex', 2000) ");
		int res = cs.executeUpdate();
		System.out.println(res);
		con.close();
	}
}
