package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbconnection {
	
	public static Connection getCon() {
		Connection con=null;
		String url="jdbc:mysql://localhost:3306/megamart";
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
	
	public static String Path() {
		return "C:/Users/PC/eclipse-workspace/MegaMart/src/main/webapp/image";
		
	}
	
}
