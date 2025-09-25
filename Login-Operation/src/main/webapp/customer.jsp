<%
	
    if(session.getAttribute("uEmail").equals("") || session.getAttribute("uEmail").equals(null)){
    	response.sendRedirect("index.jsp");
    }

   String email=(String)session.getAttribute("uEmail");
%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>Welcome to Customer <% out.print(email); %></h1>
	
	
	<a href="logout.jsp">logout</a>
</body>
</html>