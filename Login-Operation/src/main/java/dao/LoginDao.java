package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import entity.User;
import util.Dbconnection;

public class LoginDao {

	public int checkUserExist(String email, String pass) {
		int status=0;
		try {
			Connection con=Dbconnection.getCon();
			String query="select count(*) from user where uEmail=? and uPass=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, email);
			ps.setString(2, pass);
			ResultSet rs=ps.executeQuery();
			while (rs.next()) {
				status=rs.getInt(1);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	public User getUserDetails(String email, String pass) {
		User u=new User();
		try {
			Connection con=Dbconnection.getCon();
			String query="select uId,uName,uEmail,uPass,uAdd,role  from user where uEmail=? and uPass=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, email);
			ps.setString(2, pass);
			ResultSet rs=ps.executeQuery();
			while (rs.next()) {
				u.setuId(rs.getInt(1));
				u.setuName(rs.getString(2));
				u.setuEmail(rs.getString(3));
				u.setuPass(rs.getString(4));
				u.setuAdd(rs.getString(5));
				u.setRole(rs.getString(6));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return u;
	}

}






