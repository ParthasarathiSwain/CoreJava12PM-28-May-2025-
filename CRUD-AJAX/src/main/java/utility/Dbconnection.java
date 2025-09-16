package utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbconnection {
	
	public static Connection getCon() {
		Connection con=null;
		String url="jdbc:mysql://localhost:3306/jdbc6pm";
		String userName="TURGUT";
		String pass="TURGUT";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,userName,pass);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
}
