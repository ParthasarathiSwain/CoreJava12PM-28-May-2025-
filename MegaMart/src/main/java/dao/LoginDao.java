package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import entity.User;
import util.Dbconnection;

public class LoginDao {

	public int checkUserExistOrNot(String uEmail, String uPass) {
		int status=0;
		try {
			Connection con=Dbconnection.getCon();
			String query="Select count(*) from user where uEmail=? and uPass=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, uEmail);
			ps.setString(2, uPass);
			ResultSet rs=ps.executeQuery();
			while (rs.next()) {
				status=rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	public User getUserDetailsByEmailAndPass(String uEmail, String uPass) {
		User u=new User();
		try {
			Connection con=Dbconnection.getCon();
			String query="Select uId,uImg,uName,role,status from user where uEmail=? and uPass=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, uEmail);
			ps.setString(2, uPass);
			ResultSet rs=ps.executeQuery();
			while (rs.next()) {
				u.setUId(rs.getInt(1));
				u.setUImg(rs.getString(2));
				u.setUName(rs.getString(3));
				u.setRole(rs.getString(4));
				u.setStatus(rs.getString(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return u;
	}

}









