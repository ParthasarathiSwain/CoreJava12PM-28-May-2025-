package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import dao.CustomerDao;
import entity.Customer;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet("/CustomerServlet")
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String secret=request.getParameter("secret");
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		if(secret.equals("addCustomer")) {
			String name =request.getParameter("name");
			String email =request.getParameter("email");
			String pass =request.getParameter("pass");
			String add =request.getParameter("add");
			String gender =request.getParameter("gender");
			String phone =request.getParameter("phone");
			String dob =request.getParameter("dob");
			
			Customer cust=new Customer();
			cust.setCustName(name);
			cust.setCustEmail(email);
			cust.setCustPass(pass);
			cust.setCustAdd(add);
			cust.setCustGen(gender);
			cust.setCustPhone(phone);
			cust.setCustDob(dob);
			
			CustomerDao cd=new CustomerDao();
			int status=cd.addCustomer(cust);
			pw.print((status==1)?"yes":"no");
		}
	}

}









