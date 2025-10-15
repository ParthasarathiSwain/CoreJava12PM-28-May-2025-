package controller;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import dao.CompanyDao;
import entity.Category;
import entity.Company;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;




@WebServlet("/CompanyServlet")
public class CompanyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String secret=request.getParameter("secret");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		CompanyDao cd=new CompanyDao();
		
		if(secret.equals("addCompany")) {
			String comName=request.getParameter("comName");
			int status=cd.addCompany(comName);
			
			if(status>0) {
				out.print("Yes");
			}else {
				out.print("No");
			}
		}
		else if(secret.equals("getAllCompany")) {
			List<Company> comList= cd.getAllCompany();
			Gson gson = new GsonBuilder().create();
	        String json = gson.toJson(comList);
	        out.print(json);
		}
		else if(secret.equals("deleteCompany")) {
			int comId=Integer.parseInt(request.getParameter("id"));
			int status=cd.deleteCompany(comId);
			if(status>0) {
				out.print("Yes");
			}else {
				out.print("No");
			}
		}
		else if(secret.equals("getDataById")) {
			int comId=Integer.parseInt(request.getParameter("id"));
			Company com=cd.getCompanyById(comId);
			Gson gson = new GsonBuilder().create();
	        String json = gson.toJson(com);
	        out.print(json);
		}
		else if(secret.equals("updateCompany")) {
			String comName=request.getParameter("comName");
			int comId=Integer.parseInt(request.getParameter("id"));
			int status=cd.updateCompany(comId,comName);
			
			if(status>0) {
				out.print("Yes");
			}else {
				out.print("No");
			}
		}
	}

}
