package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import helper.Student;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jdbcLayer.StudentOperation;



@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String sid=request.getParameter("id");
		int id=Integer.parseInt(sid);
		
		StudentOperation so=new StudentOperation();
		Student std=so.getDataById(id);
		
		out.print("<form action='UpdateServlet' method='get'>");
		out.print("Name <input type='text'     name='name' value='"+std.getName()+"' ><br>");
		out.print("Email <input type='email'   name='email' value='"+std.getEmail()+"' ><br>");
		out.print("Pass <input type='password' name='pass' value='"+std.getPass()+"' ><br>");
		out.print("Add <input type='text' name='add' value='"+std.getAdd()+"' ><br><br>");
		out.print("<input type='hidden' name='id'  value='"+std.getId()+"' >");
		out.print("<input type='submit' value='Update & Save' ><br><br>");
		out.print("</form>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
