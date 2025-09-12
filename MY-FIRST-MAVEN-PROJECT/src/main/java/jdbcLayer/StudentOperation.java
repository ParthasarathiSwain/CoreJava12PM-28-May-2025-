package jdbcLayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import helper.Student;

public class StudentOperation {
	
	public int addStudent(String name,String email,String pass,String add) {
		int status=0;
		try {
			Connection con=Dbconnection.getCon();
			String query="insert into student(stdname,stdAdd,PASS,EMAIL) values(?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, name);
			ps.setString(2, add);
			ps.setString(3, pass);
			ps.setString(4, email);
			status=ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
	public List<Student> getAllStudent(){
		List<Student> stdList=new ArrayList<Student>();
		try {
			Connection con=Dbconnection.getCon();
			String query="select stdid,stdname,stdadd,email,pass from student";
			PreparedStatement ps=con.prepareStatement(query);
			ResultSet rs=ps.executeQuery();
			while (rs.next()) {
				Student std=new Student();
				std.setId(rs.getInt(1));
				std.setName(rs.getString(2));
				std.setAdd(rs.getString(3));
				std.setEmail(rs.getString(4));
				std.setPass(rs.getString(5));
				stdList.add(std);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return stdList;
		
	}
	
	//delete Student
	public int deleteStudent(int id) {
		int status=0;
		try {
			Connection con=Dbconnection.getCon();
			String query="delete from student where stdid=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, id);
			status=ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
	public Student  getDataById(int id) {
		Student obj=new Student();
		try {
			Connection con=Dbconnection.getCon();
			String query="Select stdId,stdName,Email,Pass,stdAdd from student where stdid=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			while (rs.next()) {
				obj.setId(rs.getInt(1));
				obj.setName(rs.getString(2));
				obj.setEmail(rs.getString(3));
				obj.setPass(rs.getString(4));
				obj.setAdd(rs.getString(5));
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return obj;
	}
	
	
	public int updateStudent(String name,String email,String pass,String add,int id) {
		int status=0;
		try {
			Connection con=Dbconnection.getCon();
			String query="update student set stdname=? ,stdAdd=?,PASS=?,EMAIL=? where stdid=? ";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, name);
			ps.setString(2, add);
			ps.setString(3, pass);
			ps.setString(4, email);
			ps.setInt(5, id);
			status=ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
		
	}
}










