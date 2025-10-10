package controller;



import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import dao.CategoryDao;
import entity.Category;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/CategoryServlet")
public class CategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String secret=request.getParameter("secret");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		CategoryDao cd=new CategoryDao();

		if(secret.equals("addCategory")) {
			String catName=request.getParameter("catName");

			int status=cd.addCategory(catName);
			if (status>0) {
				out.print("Yes");
			} else {
				out.print("No");
			}
		}
		else if(secret.equals("getAllCategory")) {
			List<Category> catList=cd.getAllCategory();
			Gson gson = new GsonBuilder().create();
			String json = gson.toJson(catList);
			out.print(json);
		}
		else if(secret.equals("deleteCategory")) {
			int catId=Integer.parseInt(request.getParameter("id"));
			int status=cd.deleteCategory(catId);
			if (status>0) {
				out.print("Yes");
			} else {
				out.print("No");
			}
		}
		else if(secret.equals("getDataById")) {
			int catId=Integer.parseInt(request.getParameter("id"));
			Category cat=cd.getCategoryById(catId);
			Gson gson = new GsonBuilder().create();
			String json = gson.toJson(cat);
			out.print(json);
		}
		else if(secret.equals("updateCategory")) {
			String catName=request.getParameter("catName");
			int catId=Integer.parseInt(request.getParameter("id"));
			
			int status=cd.updateCategory(catName,catId);
			if (status>0) {
				out.print("Yes");
			} else {
				out.print("No");
			}
		}
	}

}






