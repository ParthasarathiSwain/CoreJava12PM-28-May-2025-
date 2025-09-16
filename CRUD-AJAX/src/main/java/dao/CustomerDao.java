package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

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
}






