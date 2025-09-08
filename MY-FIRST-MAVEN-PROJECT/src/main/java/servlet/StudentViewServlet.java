package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import helper.Student;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jdbcLayer.StudentOperation;


@WebServlet("/StudentViewServlet")
public class StudentViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();

		StudentOperation so=new StudentOperation();
		List<Student> stdList=so.getAllStudent();


		pw.print("<table border=1>");

		pw.print("<tr>");
		pw.print("<th>ID</th>");
		pw.print("<th>NAME</th>");
		pw.print("<th>EMAIL</th>");
		pw.print("<th>PASS</th>");
		pw.print("<th>Address</th>");
		pw.print("</tr>");

		for (Student student : stdList) {
			pw.print("<tr>");
			pw.print("<td>"+student.getId()+"</td>");
			pw.print("<td>"+student.getName()+"</td>");
			pw.print("<td>"+student.getEmail()+"</td>");
			pw.print("<td>"+student.getPass()+"</td>");
			pw.print("<td>"+student.getAdd()+"</td>");
			pw.print("</tr>");
		}
		
		pw.print("/<table>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
