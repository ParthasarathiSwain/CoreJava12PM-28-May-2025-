<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>Hello, world!</title>
  </head>
  <body>
    
		<div  class="container mt-5">
				<div class="row  justify-content-center">
						<div class="col-4">
							<div class="card" >
							  <div class="card-body">
							    <h5 class="card-title text-center" >Login </h5>
							    
							   		<form id="loginForm">
							   			<label class="form-label">Email</label>
							   			<input type="email" name="email" class="form-control" required>
							   			
							   			<label class="form-label">Password</label>
							   			<input type="password" name="pass" class="form-control" required>
							   			
							   			<div class=" d-flex justify-content-center">
							   				 <input type="submit" Value="Login Here" class="btn btn-primary mt-3" >
							   			</div>
							   		</form>
							   		
							  </div>
							</div>
						</div>
				</div>
		</div>
		



    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
 	 <!-- jquery cdn link -->
 	<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
 	
 	<script>
		 	$(document).ready(function(){
		 		$("#loginForm").on("submit",function(event){
					event.preventDefault();//stop default form submit
					var formdata=$(this).serialize();//collect form data
					$.ajax({
						url : "LoginServlet",
						type: "Post",
						data: formdata,
						success:function(response){
							if(response.trim()=="CUST"){
								alert("Login Successfull!");
								window.location.href="customer.jsp";
							}
							else if(response.trim()=="SELLER"){
								alert("Login Successfull!");
								window.location.href="seller.jsp";
							}
							else if(response.trim()=="ADMIN"){
								alert("Login Successfull!");
								window.location.href="admin.jsp";
							}
							else{
								alert("Login Failed!");
							}
							$("#loginForm")[0].reset();
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