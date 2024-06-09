import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SaveEmp {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?user=root&password=root");
		/*
		Connection con1;
		Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?user=root&password=root");
		try(Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?user=root&password=root");
		){
		
		}catch(){
		
		}
		finally{
		con1.close();
		}
		*/
		con.setAutoCommit(false);
		Statement st = con.createStatement();
		
		String sql1 = "insert into emp values(101, 'SMITH', 800)";
		String sql2 = "insert into emp values(102, 'SMITH', 800)";
		String sql3 = "insert into emp values(103, 'SMITH', 800)";
		String sql4 = "insert into emp values(104, 'SMITH', 800)";
		String sql5 = "insert into emp values(105, 'SMITH', 800)";
		
		st.execute(sql1);
		st.execute(sql2);
		st.execute(sql3);
//		con.rollback();
		st.execute(sql4);
		st.execute(sql5);
		
		con.commit();
		
		con.close();	
		System.out.println("Success");
	}

}
