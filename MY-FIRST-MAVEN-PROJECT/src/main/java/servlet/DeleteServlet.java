package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jdbcLayer.StudentOperation;


@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		String sid=request.getParameter("id");
		int stdId=Integer.parseInt(sid);
		
		StudentOperation so=new StudentOperation();
		int status=so.deleteStudent(stdId);
		
		if(status>0) {
			pw.print("<h1>Deleted Successfully!</h1>");
			pw.print("<br><a href='StudentViewServlet'>back</a>");
		}else {
			pw.print("<h1>Deleted Failed!</h1>");
			pw.print("<br><a href='StudentViewServlet'>back</a>");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
