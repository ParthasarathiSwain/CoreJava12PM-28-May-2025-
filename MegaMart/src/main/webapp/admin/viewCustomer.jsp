<!doctype html>
<html lang="en" class="minimal-theme">

<head>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  
  <%@ include file="include/link.jsp" %>
  <title>Mega Mart</title>
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
					<div class="breadcrumb-title pe-3">Customer</div>
					<div class="ps-3">
						<nav aria-label="breadcrumb">
							<ol class="breadcrumb mb-0 p-0">
								<li class="breadcrumb-item"><a href="javascript:;"><i class="bx bx-home-alt"></i></a>
								</li>
								<li class="breadcrumb-item active" aria-current="page">View Customers</li>
							</ol>
						</nav>
					</div>
					<div class="ms-auto">
						<div class="btn-group">
							<button type="button" class="btn btn-primary">Settings</button>
							<button type="button" class="btn btn-primary split-bg-primary dropdown-toggle dropdown-toggle-split" data-bs-toggle="dropdown">	<span class="visually-hidden">Toggle Dropdown</span>
							</button>
							<div class="dropdown-menu dropdown-menu-right dropdown-menu-lg-end">	
								<a class="dropdown-item" href="javascript:;">Action</a>
								<a class="dropdown-item" href="javascript:;">Another action</a>
								<a class="dropdown-item" href="javascript:;">Something else here</a>
								<div class="dropdown-divider"></div>	<a class="dropdown-item" href="javascript:;">Separated link</a>
							</div>
						</div>
					</div>
				</div>
				<!--end breadcrumb-->
				 <div class="card">
                 <div class="card-body">
                   <div class="d-flex align-items-center">
                      <h5 class="mb-0">Customer Details</h5>
                       <form class="ms-auto position-relative">
                         <div class="position-absolute top-50 translate-middle-y search-icon px-3"><i class="bi bi-search"></i></div>
                         <input class="form-control ps-5" type="text" placeholder="search">
                       </form>
                   </div>
                   
                    <div class="table-responsive mt-3">
                     <table class="table align-middle">
                       <thead class="table-secondary">
                         <tr>
                          <th>#</th>
                          <th>Name</th>
                          <th>Email</th>
                          <th>Password</th>
                          <th>Phone</th>
                          <th>Address</th>
                          <th>Role</th>
                          <th>Status</th>
                          <th>Actions</th>
                         </tr>
                       </thead>
                       <tbody id="myData">
                         
                         
                         
                       </tbody>
                     </table>
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
	
	<!-- Modal -->
	<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
			  <div class="modal-dialog">
			    <div class="modal-content">
			      <div class="modal-header">
			        <h5 class="modal-title" id="exampleModalLabel">Edit Customer</h5>
			        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
			      </div>
			      <div class="modal-body">
			        <div class="container">
			        	<form id="myForm">
								<input type="text"   id="uName"	  name="uName" 	class="form-control form-control-lg mb-3"   aria-label=".form-control-lg example" >
								
								<input type="email"  id="uEmail"   name="uEmail" 	class="form-control form-control-lg mb-3"   aria-label=".form-control-lg example" >
								
								<input type="password" id="uPass" name="uPass" class="form-control form-control-lg mb-3"   aria-label=".form-control-lg example" >
								
								<input type="number" id="uPhone"  name="uPhone" 	class="form-control form-control-lg mb-3"   aria-label=".form-control-lg example" >
								
								<input type="text" 	id="uAdd"     name="uAdd" 	class="form-control form-control-lg mb-3"   aria-label=".form-control-lg example" >
								<label><b>Status</b></label>
								<div class="mb-2" id="status">
									<input type="radio" name="status" id="Active" value="Active">Active &nbsp;&nbsp;
									<input type="radio" name="status" id="Block" value="Block">Block
								</div> 
								
								<input type="hidden" id="uId" name="uId">
								<input type="hidden" value="updateCustomer" name="secret">
								<input class="form-control btn btn-primary" type="submit" value="Update Customer">
							</form>
			        </div>
			      </div>
			      
			    </div>
			  </div>
			</div>
    <!-- Modal end -->
	
  	<%@ include file="include/script.jsp" %>
  	
  	<script>
  	$(document).ready(function(){
		getData();
		
	})
	
	function getData(){
  		$.ajax({
  				url:"../CustomerServlet",
  				type:"Post",
  				data:{"secret":"getAllCustomer"},
  				dataType:"json",
  				success:function(response){
  					let s="";
  					for(var key in response){
  						if(response.hasOwnProperty(key)){
   							s+="<tr>";
 							s+="<td>"+response[key].uId+"</td>";
 							
   							s+="<td> <div class='d-flex align-items-center gap-3 cursor-pointer'> ";
							s+="<img src='../image/userImg/"+response[key].uImg+"' class='rounded-circle' width='44' height='44' alt=''>";
   	                        s+="<div class=''><p class='mb-0'>"+response[key].uName+"</p></div> </div> </div> </td>";
  	                        s+="<td>"+response[key].uEmail+"</td>";
  	                        s+="<td>"+response[key].uPass+"</td>";
  	                        s+="<td>"+response[key].uPhone+"</td>";
  	                        s+="<td>"+response[key].uAdd+"</td>";
  	                      	s+="<td>"+response[key].role+"</td>";
  	                        
  	                        
  	                        if(response[key].status=="Active"){
  	                        	s+="<td><span class='badge bg-light-success text-success w-100'>Active</span></td>";
  	                        	s+="<td><div class='table-actions d-flex align-items-center gap-3 fs-6'>";
  	   	                        s+="<a  class='text-primary editCustomer' id='"+response[key].uId+"' data-bs-toggle='tooltip' data-bs-placement='bottom' title='Edit'><i class='bi bi-pencil-fill'></i></a>";
  	 	                        s+="<a  class='text-danger deleteCustomer' id='"+response[key].uId+"' data-bs-toggle='tooltip' data-bs-placement='bottom' title='Delete'><i class='bi bi-trash-fill'></i></a>";
  	 	                        s+="</div></td>";
  	                        }
  	                        
  	                        if(response[key].status=="Block"){
  	                        	s+="<td><span class='badge bg-light-danger text-danger w-100'>Block</span></td>";
  	                        	s+="<td><div class='table-actions d-flex align-items-center gap-3 fs-6'>";
  	   	                        s+="<a  class='text-primary editCustomer' id='"+response[key].uId+"' data-bs-toggle='tooltip' data-bs-placement='bottom' title='Edit'><i class='bi bi-pencil-fill'></i></a>";
  	 	                        s+="<a  class='text-secondary'  data-bs-toggle='tooltip' data-bs-placement='bottom' title='Delete'><i class='bi bi-trash-fill'></i></a>";
  	 	                        s+="</div></td>";
  	                        }
  	                        
  	                        
 	                        
   							s+="</tr>"; 
  						}
  							
  					}
  					$("#myData").html(s);
  				},
  				error:function(){
  					console.log("Something went to wrong on server");
  				},
  		})
  	}
  	
 	
   	 	$(document).on('click','.deleteCustomer',function(){
			var uId=$(this).attr('id');
 			if(confirm("Are you sure you want to block this ?")){
	 			$.ajax({
 				url:"../CustomerServlet",
 				type:"Post",
 				data:{"secret":"blockCustomer","id":uId},
				
 				success:function(response){
 					if(response.trim()=="Yes"){
 						$.toast({
 						    text: "Customer Blocked Successfully",     
 						    heading: 'Customer', 
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
 						getData();
 						}else{
 						$.toast({
 						    text: "Customer Block failed",     
 						    heading: 'Customer', 
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
 				},
				error:function(){
 					console.log("Something went wrong on server!");
 				}
 			})
 		}
		
	});
  	
    $(document).on('click','.editCustomer',function(){
 		var uId=$(this).attr('id');
 		$("#exampleModal").modal("show");
 		$.ajax({
 			url:"../CustomerServlet",
 			type:"Post",
 			data:{"secret":"getCustomerDataById","id":uId},
 			dataType:"json",
 			success:function(response){
 				$("#uName").val(response.uName);
 				$("#uEmail").val(response.uEmail);
 				$("#uPass").val(response.uPass);
 				$("#uPhone").val(response.uPhone);
 				$("#uAdd").val(response.uAdd);
 				$("#uId").val(response.uId);
				$("input[name='status'][value='" + response.status + "']").prop("checked", true);	

 			},
 			error:function(){
				console.log("Something went wrong on server!");
 			}
 			
 		 })
 	});
  	
    $(document).ready(function(){
 		$("#myForm").on("submit",function(event){
 			event.preventDefault();
 			var formdata=$(this).serialize();
			
 			$.ajax({
 				url:"../CustomerServlet",
 				type:"Post",
 				data:formdata,
 				success:function(response){
 					if(response.trim()=="Yes"){
 						$.toast({
 						    text: "Customer Updated Successfully",     
 						    heading: 'Customer', 
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
 						getData();
 					}else{
 						$.toast({
 						    text: "Customer Updated Failed",     
 						    heading: 'Customer', 
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
 					$("#exampleModal").modal("hide");
 				},
 				error:function(){
 					console.log("Something went wrong on server!")
 				},
 			})
 		})
 	})  
  	 
  	
  	</script>

</body>

</html>