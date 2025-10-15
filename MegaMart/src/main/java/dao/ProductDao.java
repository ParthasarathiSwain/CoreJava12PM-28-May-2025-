package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

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

}
