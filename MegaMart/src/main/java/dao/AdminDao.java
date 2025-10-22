package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import entity.User;
import util.Dbconnection;

public class AdminDao {

	public int addAdmin(User user) {
		int status=0;
		try {
			Connection con=Dbconnection.getCon();
			String query="insert into user (uName,uEmail,uPass,uAdd,uPhone,uImg,createdDate,role) values(?,?,?,?,?,?,now(),?)";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1,user.getUName());
			ps.setString(2,user.getUEmail());
			ps.setString(3,user.getUPass());
			ps.setString(4,user.getUAdd());
			ps.setString(5,user.getUPhone());
			ps.setString(6,user.getUImg());
			ps.setString(7,"Admin");
			
			status=ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

}
