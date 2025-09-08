package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jdbcLayer.StudentOperation;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		String name=request.getParameter("stdName");
		String email=request.getParameter("stdEmail");
		String pass=request.getParameter("stdPass");
		String add=request.getParameter("stdAdd");
		
		StudentOperation so=new StudentOperation();
		int status=so.addStudent(name, email, pass, add);
		
		if(status>0) {
			pw.print("<h1>Student Added Successfully!</h1>");
		}else {
			pw.print("<h1>Student Added Failed!</h1>");
		}
				
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
