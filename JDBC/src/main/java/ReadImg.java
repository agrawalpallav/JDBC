import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class ReadImg {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?user=root&password=root");
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM imgstore");
		
		rs.next();
		int id = rs.getInt(1);
		Blob b = rs.getBlob(2);
		
		String p = "C:\\Users\\pkapa\\OneDrive\\Pictures\\New folder\\read.jpg";
		FileOutputStream fos = new FileOutputStream(p);
		byte arr[] = b.getBytes(1, (int) b.length());
		fos.write(arr);
		System.out.println("success");
	}

}
