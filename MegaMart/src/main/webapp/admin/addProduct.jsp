
<%@ page import="java.sql.*"  %>
<%@ page import="util.Dbconnection"  %>
<!doctype html>
<html lang="en" class="minimal-theme">

<head>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  
  <%@ include file="include/link.jsp" %>

  <title>MegaMart</title>
</head>

<body>


  <!--start wrapper-->
  <div class="wrapper">
  		
  		<%@ include file="include/header.jsp" %>

        <%@ include file="include/sidebar.jsp" %>

       <!--start content-->
          <main class="page-content">
            <!--breadcrumb-->
				<div class="page-breadcrumb d-none d-sm-flex align-items-center mb-3">
					<div class="breadcrumb-title pe-3">Product</div>
					<div class="ps-3">
						<nav aria-label="breadcrumb">
							<ol class="breadcrumb mb-0 p-0">
								<li class="breadcrumb-item"><a href="javascript:;"><i class="bx bx-home-alt"></i></a>
								</li>
								<li class="breadcrumb-item active" aria-current="page">Add Product</li>
							</ol>
						</nav>
					</div>
					<div class="ms-auto">
						<div class="btn-group">
							<button type="button" class="btn btn-primary">Settings</button>
							<button type="button" class="btn btn-primary split-bg-primary dropdown-toggle dropdown-toggle-split" data-bs-toggle="dropdown">	<span class="visually-hidden">Toggle Dropdown</span>
							</button>
							<div class="dropdown-menu dropdown-menu-right dropdown-menu-lg-end">	<a class="dropdown-item" href="javascript:;">Action</a>
								<a class="dropdown-item" href="javascript:;">Another action</a>
								<a class="dropdown-item" href="javascript:;">Something else here</a>
								<div class="dropdown-divider"></div>	<a class="dropdown-item" href="javascript:;">Separated link</a>
							</div>
						</div>
					</div>
				</div>
				<!--end breadcrumb-->
            	<div class="row">
					<div class="col-xl-9 mx-auto">
						<h6 class="mb-0 text-uppercase">Add Product</h6>
						<hr/>
						<div class="card">
							<div class="card-body">
							
							 <form  id="myForm">
							 	<input type="text" name="pName" class="form-control form-control-lg mb-3"   placeholder="Product Name" aria-label=".form-control-lg example" required>
								<input type="text" name="pDesc" class="form-control form-control-lg mb-3"   placeholder="Product Description" aria-label=".form-control-lg example" required>
								<input type="number" name="qty" class="form-control form-control-lg mb-3"   placeholder="Product Quantity" aria-label=".form-control-lg example" required>
								<input type="number" name="price" class="form-control form-control-lg mb-3"   placeholder="Product Price" aria-label=".form-control-lg example" required>
								
								<select name="catId"  class="form-control form-control-lg mb-3">
									<option>--SELECT CATEGORY--</option>
									<%
									  Connection con1=Dbconnection.getCon();
									  String query1="select catId,catName from category";
									  PreparedStatement ps1= con1.prepareStatement(query1);
									  ResultSet rs1=ps1.executeQuery();
									  while(rs1.next()){
									%>
										<option  value="<%= rs1.getInt(1) %>"><%= rs1.getString(2) %></option>
									<%
									  }
									%>
								</select>
								
								<select name="comId"  class="form-control form-control-lg mb-3">
									<option>--SELECT COMPANY--</option>
									<%
									  Connection con2=Dbconnection.getCon();
									  String query2="select comId,comName from company";
									  PreparedStatement ps2= con2.prepareStatement(query2);
									  ResultSet rs2=ps2.executeQuery();
									  while(rs2.next()){
									%>
										<option  value="<%= rs2.getInt(1) %>"><%= rs2.getString(2) %></option>
									<%
									  }
									%>
								</select>
								<input type="file" name="pImg" class="form-control form-control-lg mb-3"   aria-label=".form-control-lg example" required>
								
								<input type="hidden" name="secret" value="addProduct">
								
								<input class="form-control btn btn-primary" type="submit" value="Add Product">
							 </form>
								
							</div>
						</div>
           		    </div>
            	</div>
		</main>
       <!--end page main-->

       <!--start overlay-->
        <div class="overlay nav-toggle-icon"></div>
       <!--end overlay-->

       <!--Start Back To Top Button-->
		     <a href="javaScript:;" class="back-to-top"><i class='bx bxs-up-arrow-alt'></i></a>
       <!--End Back To Top Button-->

       <!--start switcher-->
       <div class="switcher-body">
        <button class="btn btn-primary btn-switcher shadow-sm" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasScrolling" aria-controls="offcanvasScrolling"><i class="bi bi-paint-bucket me-0"></i></button>
        <div class="offcanvas offcanvas-end shadow border-start-0 p-2" data-bs-scroll="true" data-bs-backdrop="false" tabindex="-1" id="offcanvasScrolling">
          <div class="offcanvas-header border-bottom">
            <h5 class="offcanvas-title" id="offcanvasScrollingLabel">Theme Customizer</h5>
            <button type="button" class="btn-close text-reset" data-bs-dismiss="offcanvas"></button>
          </div>
          <div class="offcanvas-body">
            <h6 class="mb-0">Theme Variation</h6>
            <hr>
            <div class="form-check form-check-inline">
              <input class="form-check-input" type="radio" name="inlineRadioOptions" id="LightTheme" value="option1">
              <label class="form-check-label" for="LightTheme">Light</label>
            </div>
            <div class="form-check form-check-inline">
              <input class="form-check-input" type="radio" name="inlineRadioOptions" id="DarkTheme" value="option2">
              <label class="form-check-label" for="DarkTheme">Dark</label>
            </div>
            <div class="form-check form-check-inline">
              <input class="form-check-input" type="radio" name="inlineRadioOptions" id="SemiDarkTheme" value="option3">
              <label class="form-check-label" for="SemiDarkTheme">Semi Dark</label>
            </div>
            <hr>
            <div class="form-check form-check-inline">
              <input class="form-check-input" type="radio" name="inlineRadioOptions" id="MinimalTheme" value="option3" checked>
              <label class="form-check-label" for="MinimalTheme">Minimal Theme</label>
            </div>
            <hr/>
            <h6 class="mb-0">Header Colors</h6>
            <hr/>
            <div class="header-colors-indigators">
              <div class="row row-cols-auto g-3">
                <div class="col">
                  <div class="indigator headercolor1" id="headercolor1"></div>
                </div>
                <div class="col">
                  <div class="indigator headercolor2" id="headercolor2"></div>
                </div>
                <div class="col">
                  <div class="indigator headercolor3" id="headercolor3"></div>
                </div>
                <div class="col">
                  <div class="indigator headercolor4" id="headercolor4"></div>
                </div>
                <div class="col">
                  <div class="indigator headercolor5" id="headercolor5"></div>
                </div>
                <div class="col">
                  <div class="indigator headercolor6" id="headercolor6"></div>
                </div>
                <div class="col">
                  <div class="indigator headercolor7" id="headercolor7"></div>
                </div>
                <div class="col">
                  <div class="indigator headercolor8" id="headercolor8"></div>
                </div>
              </div>
            </div>
          </div>
        </div>
       </div>
       <!--end switcher-->

  </div>
  <!--end wrapper-->


  <%@ include file="include/script.jsp" %>


	<script>
	$(document).ready(function(){
		$("#myForm").on("submit",function(event){
			event.preventDefault();//stop default form submit
			var formdata=new FormData(this);//collect form data
			
			$.ajax({
				url : "../ProductServlet",
				type: "Post",
				data: formdata,
				contentType: false,
                processData: false,
				success:function(response){
					if(response.trim()=="Yes"){
						$.toast({
						    text: "Product Added Successfully!", 
						    heading: 'Product', 
						    icon: 'success', 
						    showHideTransition: 'fade', 
						    allowToastClose: true, 
						    hideAfter: 5000, 
						    stack: 5, 
						    position: 'top-center',     
						    textAlign: 'left', 
						    loader: true, 
						    loaderBg: '#9EC600',     
						});
						
					}else{
						$.toast({
						    text: "Product Added Failed!", 
						    heading: 'Product', 
						    icon: 'error', 
						    showHideTransition: 'fade', 
						    allowToastClose: true, 
						    hideAfter: 5000, 
						    stack: 5, 
						    position: 'top-center',     
						    textAlign: 'left', 
						    loader: true, 
						    loaderBg: '#9EC600',     
						});
					}
					$("#myForm")[0].reset();
				},
				error:function(){
					console.log("Something went wrong on Server!")
				}
			})
		})
			
	})
	</script>
	
</body>

</html>