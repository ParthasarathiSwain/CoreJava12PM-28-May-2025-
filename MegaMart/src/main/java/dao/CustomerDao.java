package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entity.User;
import util.Dbconnection;

public class CustomerDao {

	public int addCustomer(User user) {
		int status=0;
		try {
			Connection con=Dbconnection.getCon();
			String query="insert into user(uName,uEmail,uPass,uAdd,uPhone,uImg,createdDate,role) values(?,?,?,?,?,?,now(),?)";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, user.getUName());
			ps.setString(2, user.getUEmail());
			ps.setString(3, user.getUPass());
			ps.setString(4, user.getUAdd());
			ps.setString(5, user.getUPhone());
			ps.setString(6, user.getUImg());
			ps.setString(7, "Customer");
			status=ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	public List<User> getAllCustomer() {
		List<User> list=new ArrayList<>();
		try {
			Connection con=Dbconnection.getCon();
			String query="select uId,uName,uEmail,uPass,uPhone,uAdd,role,uImg,createdDate,status from user where role=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, "Customer");
			ResultSet rs=ps.executeQuery();
			while (rs.next()) {
				User u=new User();
				u.setUId(rs.getInt(1));
				u.setUName(rs.getString(2));
				u.setUEmail(rs.getString(3));
				u.setUPass(rs.getString(4));
				u.setUPhone(rs.getString(5));
				u.setUAdd(rs.getString(6));
				u.setRole(rs.getString(7));
				u.setUImg(rs.getString(8));
				u.setCreatedDate(rs.getString(9));
				u.setStatus(rs.getString(10));
				list.add(u);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public int blockCustomer(int uId) {
		int status=0;
		try {
			Connection con=Dbconnection.getCon();
			String query="update user set status=? where uId=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, "Block");
			ps.setInt(2, uId);
			status=ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	public User getCustomerById(int uId) {
		User u=new User();
		try {
			Connection con=Dbconnection.getCon();
			String query="select uId,uName,uEmail,uPass,uPhone,uAdd,role,uImg,createdDate,status from user where uId=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, uId);
			ResultSet rs=ps.executeQuery();
			while (rs.next()) {
				u.setUId(rs.getInt(1));
				u.setUName(rs.getString(2));
				u.setUEmail(rs.getString(3));
				u.setUPass(rs.getString(4));
				u.setUPhone(rs.getString(5));
				u.setUAdd(rs.getString(6));
				u.setRole(rs.getString(7));
				u.setUImg(rs.getString(8));
				u.setCreatedDate(rs.getString(9));
				u.setStatus(rs.getString(10));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return u;
	}

	public int updateCustomer(User user) {
		int res=0;
		try {
			Connection con=Dbconnection.getCon();
			String query="update user set uName=?,uEmail=?,uPass=?,uAdd=?,uPhone=?,status=? where uId=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, user.getUName());
			ps.setString(2, user.getUEmail());
			ps.setString(3, user.getUPass());
			ps.setString(4, user.getUAdd());
			ps.setString(5, user.getUPhone());
			ps.setString(6, user.getStatus());
			ps.setInt(7, user.getUId());
			res=ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}

}
