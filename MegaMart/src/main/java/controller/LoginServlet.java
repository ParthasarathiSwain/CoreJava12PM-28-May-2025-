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
		
		String uEmail=request.getParameter("uEmail");
		String uPass=request.getParameter("uPass");
		
		LoginDao ld=new LoginDao();
		int status=ld.checkUserExistOrNot(uEmail,uPass);
		
		if (status>0) {
				User user=ld.getUserDetailsByEmailAndPass(uEmail,uPass);
				HttpSession session=request.getSession();
				
				
				if (user.getRole().equals("Customer") && user.getStatus().equals("Active")) {
					String first=user.getUName().substring(0, user.getUName().indexOf(' '));
					session.setAttribute("uName", first);
					session.setAttribute("uImg", user.getUImg());
					session.setAttribute("uId", user.getUId());
					out.print("Customer");
				} 
				else if (user.getRole().equals("Admin") && user.getStatus().equals("Active")){
					session.setAttribute("uName", user.getUName());
					session.setAttribute("uImg", user.getUImg());
					session.setAttribute("uId", user.getUId());
					out.print("Admin");
				}
				else {
					out.print("NotActive");
				}
		} else {
			out.print("Failed");
		}
	}


	

}
