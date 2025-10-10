package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entity.Category;
import util.Dbconnection;

public class CategoryDao {
	//add Category
	public int addCategory(String catName) {
		int status=0;
		try {
			Connection con=Dbconnection.getCon();
			String query="insert into category(catName) values(?)";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, catName);
			status=ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	public List<Category> getAllCategory() {
		List<Category> list=new ArrayList<>();
		try {
			Connection con=Dbconnection.getCon();
			String query="Select catId,catName from category ";
			PreparedStatement ps=con.prepareStatement(query);
			ResultSet rs=ps.executeQuery();
			while (rs.next()) {
				Category cat=new Category();
				cat.setCatId(rs.getInt(1));
				cat.setCatName(rs.getString(2));
				list.add(cat);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public int deleteCategory(int catId) {
		int status=0;
		try {
			Connection con=Dbconnection.getCon();
			String query="delete from category where catId=? ";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, catId);
			status=ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	public Category getCategoryById(int catId) {
		Category cat=new Category();
		try {
			Connection con=Dbconnection.getCon();
			String query="Select catId,catName from category where catId=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1,catId);
			ResultSet rs=ps.executeQuery();
			while (rs.next()) {
				cat.setCatId(rs.getInt(1));
				cat.setCatName(rs.getString(2));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cat;
	}

	public int updateCategory(String catName, int catId) {
		int status=0;
		try {
			Connection con=Dbconnection.getCon();
			String query="update category set catName=? where catId=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, catName);
			ps.setInt(2, catId);
			status=ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
}
