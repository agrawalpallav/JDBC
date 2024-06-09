import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test {
	public static void main(String[] args) throws Exception {
		File f = new File("C:\\Users\\pkapa\\OneDrive\\Pictures\\New folder\\3598.jpg");
		FileInputStream fis = new FileInputStream(f);
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?user=root&password=root");
		PreparedStatement ps = con.prepareStatement("INSERT INTO imgstore VALUES(?,?)");
		ps.setInt(1, 101);
		ps.setBlob(2, fis);
		
		ps.execute();
		con.close();
		System.out.println("success");
		
	}

}
