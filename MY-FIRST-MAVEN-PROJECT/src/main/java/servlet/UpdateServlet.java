package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jdbcLayer.StudentOperation;


@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		
		String newName=request.getParameter("name");
		String newEmai=request.getParameter("email");
		String newPass=request.getParameter("pass");
		String newAdd=request.getParameter("add");
		String sid=request.getParameter("id");
		int id=Integer.parseInt(sid);
		
		StudentOperation so=new StudentOperation();
		int status=so.updateStudent(newName, newEmai, newPass, newAdd, id);
		
		if(status>0) {
			pw.print("<h1>Student Updated Successfully!</h1>");
			pw.print("<br><a href='StudentViewServlet'>back</a>");
		}else {
			pw.print("<h1>Student Updated Failed!</h1>");
			pw.print("<br><a href='StudentViewServlet'>back</a>");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
