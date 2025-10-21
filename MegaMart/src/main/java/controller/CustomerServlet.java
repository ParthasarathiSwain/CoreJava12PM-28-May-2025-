package controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import dao.CustomerDao;
import entity.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import util.Dbconnection;


@WebServlet("/CustomerServlet")
@MultipartConfig(maxFileSize =1024*1024*2)
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private boolean validateImage1(String orifileName){
	      String fileExt1 = orifileName.substring(orifileName.length()-3);
	      if("jpg".equals(fileExt1) || "png".equals(fileExt1) || "gif".equals(fileExt1))
	      { 
	    	  return true;
	      }
	      return false;
	    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String secret=request.getParameter("secret");
		CustomerDao cd=new CustomerDao();
		
		if(secret.equals("addCustomer")) {
			String uName=request.getParameter("uName");
			String uEmail=request.getParameter("uEmail");
			String uPass=request.getParameter("uPass");
			String uPhone=request.getParameter("uPhone");
			String uAdd=request.getParameter("uAdd");
			
			//image start
			Part p=request.getPart("uImg");
			String path=Dbconnection.Path();
			String appPath =path+"/userImg";
			String imagePath = appPath + "";
			File fileDir = new File(imagePath);
		        if (!fileDir.exists()) 
		                 fileDir.mkdirs();
		    String orifileName = p.getSubmittedFileName();
		    String fileExt1 = orifileName.substring(orifileName.length()-3);
		    String imgname1=new Date().getTime() +"1"+"."+fileExt1;
		    String finalImgPath="userImg" + "/"+ imgname1;
		    if (validateImage1(orifileName)) {
		    	 try{
		                p.write(imagePath + "/" + imgname1);
		            }catch (Exception ex) { 
		            	ex.printStackTrace();
		            }
			}
		    
			//image end
		    User user=new User();
		    user.setUAdd(uAdd);
		    user.setUEmail(uEmail);
		    user.setUImg(imgname1);
		    user.setUPass(uPass);
		    user.setUPhone(uPhone);
		    user.setUName(uName);
		    
		    int status=cd.addCustomer(user);
		    if (status>0) {
				pw.print("Yes");
			} else {
				pw.print("No");
			}
		}
	}

}
