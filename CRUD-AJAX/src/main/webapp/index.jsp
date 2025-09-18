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
    <div class="container mt-5">
    		<div class="row  justify-content-center ">
    				<div class="col-6">
    				
    				<div class="card" >
					  <div class="card-body">
					    <h5 class="card-title text-center">Registration</h5>
					    
					    <form    id="myForm" >
						  <div class="mb-3">
						    <label for="inputName" class="form-label">Name</label>
						    <input type="text" class="form-control" id="inputName" name="name" required>
						  </div>
						  
						  <div class="mb-3">
						    <label for="inputEmail" class="form-label">Email</label>
						    <input type="email" class="form-control" id="inputEmail"  name="email" required>
						  </div>
						 
						   <div class="mb-3">
						    <label for="inputPass" class="form-label">Password</label>
						    <input type="password" class="form-control" id="inputPass" name="pass" required>
						  </div>
						  
						  <div class="mb-3">
						    <label for="inputPhone" class="form-label">Phone</label>
						    <input type="text" class="form-control" id="inputPhone" name="phone" required>
						  </div>
						  
						  <div class="mb-3">
						    <label for="inputDob" class="form-label">DOB</label>
						    <input type="date" class="form-control" id="inputDob"  name="dob" required>
						  </div>
						  <div class="mb-3">
						    <label for="inputDob" class="form-label">Gender</label>
						    <input type="radio"  name="gender"  value="male" >Male
						    <input type="radio"  name="gender"  value="female" >Female
						    <input type="radio"  name="gender"  value="others" >Others
						  </div>
						  <input type="hidden" name="secret" value="addCustomer">
						  <div class="mb-3">
						    <label for="inputAdd" class="form-label">Address</label>
						    <input type="text" class="form-control" id="inputAdd" name="add" required>
						  </div>
						  
						  <button type="submit" class="btn btn-primary">Submit</button>
					</form>
					
					  </div>
					</div>    					
    					
    				</div>
    		</div>
    		
    		<div class="row mt-5">
    				<table class="table  table-primary table-striped  table-hover">
					  <thead class="table-dark">
					    <tr>
					      <th scope="col">#</th>
					      <th scope="col">Name</th>
					      <th scope="col">Email</th>
					      <th scope="col">Phone</th>
					       <th scope="col">Gender</th>
					      <th scope="col">Dob</th>
					      <th scope="col">Address</th>
					      <th scope="col">Edit</th>
					      <th scope="col">Delete</th>
					    </tr>
					  </thead>
					  <tbody  id="myAllData">
					   
					  </tbody>
					</table>
    		</div>
    </div>
    
    
    <!-- modal start -->
    
		
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
		       					<form id="updateForm">
		       						<label for="name" class="form-label">Name</label>
						   		    <input type="text" class="form-control" id="name" name="editName" required>
						   		    
						   		    <label for="email" class="form-label">Email</label>
						   		    <input type="email" class="form-control" id="email" name="editEmail" required>
						   		    
						   		    <label for="pass" class="form-label">Password</label>
						   		    <input type="text" class="form-control" id="pass" name="editPass" required>
						   		    
						   		    <label for="dob" class="form-label">Dob</label>
						   		    <input type="date" class="form-control" id="dob" name="editDob" required>
						   		    
						   		    <label for="phone" class="form-label">Phone</label>
						   		    <input type="text" class="form-control" id="phone" name="editPhone" required>
						   		    
						   		    <label for="add" class="form-label">Address</label>
						   		    <input type="text" class="form-control" id="add" name="editAdd" required>
						   		    
						   		    <input type="hidden" name="secret" value="UpdateCustomer">
						   		    <input type="hidden" id="cid" name="id">
						   		    
						   		    <input type="submit" value="Save & Update" class="btn btn-primary mt-3">
						   		    
		       					</form>
		       			</div>
		      </div>
		      
		    </div>
		  </div>
		</div>
   <!--  modal end -->
    
     <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
 	 <!-- jquery cdn link -->
 	<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
 	
 	<script>
 		$(document).ready(function(){
 			addCustomer();
 			getAllCustomer();
 			
 		})
 		
 		function addCustomer(){

			$("#myForm").on("submit",function(event){
				event.preventDefault();//stop default form submit
				var formdata=$(this).serialize();//collect form data
				
				$.ajax({
					url : "CustomerServlet",
					type: "Post",
					data: formdata,
					success:function(response){
						if(response.trim()=="yes"){
							alert("Customer Added Successfully!")
							getAllCustomer();
						}else{
							alert("Customer Added Failed!")
						}
						$("#myForm")[0].reset();
					},
					error:function(){
						console.log("Something went wrong on Server!")
					}
				})
			})
 		}
 		
 		function getAllCustomer(){
				$.ajax({
					url : "CustomerServlet",
					type: "Post",
					data: {"secret":"getAllCustomer"},
					dataType: "json",
					success:function(response){
						let s="";
						for(var key in response){
							if(response.hasOwnProperty(key)){
								s+="<tr>";
								s+="<td>"+response[key].custId+"</td>";
								s+="<td>"+response[key].custName+"</td>";
								s+="<td>"+response[key].custEmail+"</td>";
								s+="<td>"+response[key].custPhone+"</td>";
								s+="<td>"+response[key].custGen+"</td>";
								s+="<td>"+response[key].custDob+"</td>";
								s+="<td>"+response[key].custAdd+"</td>";
								s+="<td><a class='btn btn-primary  custEdit' id='"+response[key].custId+"'  >edit</a></td>";
								s+="<td><a class='btn btn-danger custDelete'  id='"+response[key].custId+"'>delete</a></td>";
								s+="</tr>";
							}
						}
						$("#myAllData").html(s);
					},
					error:function(){
						console.log("Something went to wrong on server!");
					},
				})
 		}
 		
 		
 		$(document).on('click','.custEdit',function(){
				var cid=$(this).attr('id');
				$("#exampleModal").modal("show");
				
				$.ajax({
					url : "CustomerServlet",
					type: "Post",
					data: {"secret":"getDataById","id":cid},
					dataType: "json",
					success:function(response){
						$("#name").val(response.custName);
						$("#email").val(response.custEmail);
						$("#phone").val(response.custPhone);
						$("#pass").val(response.custPass);
						$("#dob").val(response.custDob);
						$("#add").val(response.custAdd);
						$("#cid").val(response.custId);
					},
					error:function(){
						console.log("Something went to wrong on server!");
					}
				})
 		});
 		
 		
 		
 		
 		$("#updateForm").on("submit",function(event){
			event.preventDefault();//stop default form submit
			var formdata=$(this).serialize();//collect form data
			
			$.ajax({
				url : "CustomerServlet",
				type: "Post",
				data: formdata,
				success:function(response){
					if(response.trim()=="yes"){
						alert("Updated Successfully!");
						getAllCustomer();
						$("#exampleModal").modal("hide");
					}else{
						alert("Updated Failed!");
					}
				},
				error:function(){
					console.log("Something went wrong on Server!")
				}
			})
		})
 		
		
		
		$(document).on('click','.custDelete',function(){
				var cid=$(this).attr('id');
				
				if(confirm("Are You Sure You Want Delete This ?")){
					$.ajax({
						url : "CustomerServlet",
						type: "Post",
						data: {"secret":"deleteCustomer","id":cid},
						success:function(response){
							if(response.trim()=="yes"){
								alert("Deleted Successfully!");
								getAllCustomer();
							}else{
								alert("Deleted Failed!");
							}
						},
						error:function(){
							console.log("Something went to wrong on server!");
						}
					})
				
				}
				
 		});
 	</script>
 	
  </body>
</html>








