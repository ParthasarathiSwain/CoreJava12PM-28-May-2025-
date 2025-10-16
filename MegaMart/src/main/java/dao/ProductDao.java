package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entity.Product;
import util.Dbconnection;

public class ProductDao {

	public int addProduct(Product product) {
		int status=0;
		try {
			Connection con=Dbconnection.getCon();
			String query="insert into product (pName,pDesc,pImg,qty,price,comId,catId,createdDate) values(?,?,?,?,?,?,?,now())";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, product.getPName());
			ps.setString(2, product.getPDesc());
			ps.setString(3, product.getPImg());
			ps.setInt(4, product.getQty());
			ps.setDouble(5, product.getPrice());
			ps.setInt(6, product.getComId());
			ps.setInt(7, product.getCatId());
			status=ps.executeUpdate();
		} catch (Exception e) {
				e.printStackTrace();
		}
		return status;
	}

	public List<Product> getAllProduct() {
		List<Product> list=new ArrayList<>();
		try {
			Connection con=Dbconnection.getCon();
			String query="SELECT A.pId,A.pName,A.pDesc,A.pImg,A.qty,A.price,A.createdDate,A.status,"
					    + "B.catId,B.catName,C.comId,C.comName FROM megamart.product as A "
					    + "inner join megamart.category as B on A.catId=B.catId "
					    + "inner join megamart.company as C on A.comId=C.comId ";
			
			PreparedStatement ps=con.prepareStatement(query);
			ResultSet rs= ps.executeQuery();
			while (rs.next()) {
				Product p=new Product();
				p.setPId(rs.getInt(1));
				p.setPName(rs.getString(2));
				p.setPDesc(rs.getString(3));
				p.setPImg(rs.getString(4));
				p.setQty(rs.getInt(5));
				p.setPrice(rs.getDouble(6));
				p.setCreatedDate(rs.getString(7));
				p.setStatus(rs.getString(8));
				p.setCatId(rs.getInt(9));
				p.setCatName(rs.getString(10));
				p.setComId(rs.getInt(11));
				p.setComName(rs.getString(12));
				list.add(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public int blockProduct(int pId) {
		int status=0;
		try {
			Connection con=Dbconnection.getCon();
			String query="update product set status=? where pId=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, "Block");
			ps.setInt(2, pId);
			status=ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

}
