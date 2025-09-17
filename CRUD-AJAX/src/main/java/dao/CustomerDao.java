package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entity.Customer;
import utility.Dbconnection;

public class CustomerDao {
	//add customer
	public int addCustomer(Customer cust) {
		int status=0;
		try {
			Connection con=Dbconnection.getCon();
			String query="insert into customer(custName,custEmail,custPass,custAdd,custGen,custPhone,custDob) values(?,?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, cust.getCustName());
			ps.setString(2, cust.getCustEmail());
			ps.setString(3, cust.getCustPass());
			ps.setString(4, cust.getCustAdd());
			ps.setString(5, cust.getCustGen());
			ps.setString(6, cust.getCustPhone());
			ps.setString(7, cust.getCustDob());
			
			status=ps.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
	//get all data
	public List<Customer> getAllCustomer(){
		List<Customer> list=new ArrayList<Customer>();
		try {
			Connection con=Dbconnection.getCon();
			String query="select custId,custName,custEmail,custPass,custAdd,custGen,custPhone,custDob from customer";
			PreparedStatement ps=con.prepareStatement(query);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Customer cust=new Customer();
				cust.setCustId(rs.getInt(1));
				cust.setCustName(rs.getString(2));
				cust.setCustEmail(rs.getString(3));
				cust.setCustPass(rs.getString(4));
				cust.setCustAdd(rs.getString(5));
				cust.setCustGen(rs.getString(6));
				cust.setCustPhone(rs.getString(7));
				cust.setCustDob(rs.getString(8));
				list.add(cust);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}






