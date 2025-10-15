package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entity.Company;
import util.Dbconnection;

public class CompanyDao {

	public int addCompany(String comName) {
		int status=0;
		try {
			Connection con=Dbconnection.getCon();
			String query="insert into company(comName) values(?)";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, comName);
			status=ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	public List<Company> getAllCompany() {
		List<Company> list=new ArrayList<>();
		try {
			Connection con=Dbconnection.getCon();
			String query="select comId,comName from company ";
			PreparedStatement ps=con.prepareStatement(query);
			ResultSet rs=ps.executeQuery();
			while (rs.next()) {
				Company com=new Company();
				com.setComId(rs.getInt(1));
				com.setComName(rs.getString(2));
				list.add(com);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public int deleteCompany(int comId) {
		int status=0;
		try {
			Connection con=Dbconnection.getCon();
			String query="delete from company where comId=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, comId);
			status=ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	public Company getCompanyById(int comId) {
		Company com=new Company();
		try {
			Connection con=Dbconnection.getCon();
			String query="select comId,comName from company where comId=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, comId);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				com.setComId(rs.getInt(1));
				com.setComName(rs.getString(2));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return com;
	}

	public int updateCompany(int comId, String comName) {
		int status=0;
		try {
			Connection con=Dbconnection.getCon();
			String query="update company set comName=? where comId=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, comName);
			ps.setInt(2, comId);
			status=ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

}	
		
