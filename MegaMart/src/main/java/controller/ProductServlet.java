package controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import dao.ProductDao;
import entity.Product;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import util.Dbconnection;

@WebServlet("/ProductServlet")
@MultipartConfig(maxFileSize =1024*1024*2)
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	private boolean validateImage1(String orifileName){
	      String fileExt1 = orifileName.substring(orifileName.length()-3);
	      if("jpg".equals(fileExt1) || "png".equals(fileExt1) || "gif".equals(fileExt1))
	      { 
	    	  return true;
	      }
	      return false;
	    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String secret=request.getParameter("secret");
		ProductDao pd=new ProductDao();
		
		if(secret.equals("addProduct")) {
			String  pName=request.getParameter("pName");
			String  pDesc=request.getParameter("pDesc");
			int qty=Integer.parseInt(request.getParameter("qty"));
			double price=Double.parseDouble(request.getParameter("price"));
			int catId=Integer.parseInt(request.getParameter("catId"));
			int comId=Integer.parseInt(request.getParameter("comId"));
			
			//image start
			Part p=request.getPart("pImg");
			String path=Dbconnection.Path();
			String appPath =path+"/productImg";
			String imagePath = appPath + "";
			File fileDir = new File(imagePath);
		        if (!fileDir.exists()) 
		                 fileDir.mkdirs();
		    String orifileName = p.getSubmittedFileName();
		    String fileExt1 = orifileName.substring(orifileName.length()-3);
		    String imgname1=new Date().getTime() +"1"+"."+fileExt1;
		    String finalImgPath="productImg" + "/"+ imgname1;
		    if (validateImage1(orifileName)) {
		    	 try{
		                p.write(imagePath + "/" + imgname1);
		            }catch (Exception ex) { 
		            	ex.printStackTrace();
		            }
			}
		    
			//image end
		    Product product=new Product();
		    product.setCatId(catId);
		    product.setComId(comId);
		    product.setPDesc(pDesc);
		    product.setPImg(imgname1);
		    product.setPName(pName);
		    product.setQty(qty);
		    product.setPrice(price);
		    
		    int status=pd.addProduct(product);
		    if (status>0) {
				pw.print("Yes");
			} else {
				pw.print("No");
			}
		    
		}
		else if(secret.equals("getAllProduct")) {
			List<Product> listProduct=pd.getAllProduct();
			Gson gson = new GsonBuilder().create();
	        String json = gson.toJson(listProduct);
	        pw.print(json);
		}
		else if(secret.equals("blockProduct")) {
			int pId=Integer.parseInt(request.getParameter("id"));
			int status=pd.blockProduct(pId);
		    if (status>0) {
				pw.print("Yes");
			} else {
				pw.print("No");
			}
		}
		
	}

}







