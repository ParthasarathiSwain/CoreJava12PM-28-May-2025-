package controller;

import java.io.IOException;
import java.io.PrintWriter;

import dao.LoginDao;
import entity.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;



@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();

		String email=request.getParameter("email");
		String pass=request.getParameter("pass");

		LoginDao ld=new LoginDao();
		int status=ld.checkUserExist(email,pass);

		if(status>0) {
			HttpSession session=request.getSession();
			session.setAttribute("uEmail", email);
					
			User user=ld.getUserDetails(email,pass);
			String role=user.getRole();
			if(role.equals("CUST")) {
				out.print("CUST");
			}
			else if(role.equals("SELLER")) {
				out.print("SELLER");
			}
			else if(role.equals("ADMIN")) {
				out.print("ADMIN");
			}
		}else {
			out.print("failed");
		}
	}

}






