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
    					<form>
    				
						  <div class="mb-3">
						    <label for="inputName" class="form-label">Name</label>
						    <input type="text" class="form-control" id="inputName" name="name" >
						  </div>
						  
						  <div class="mb-3">
						    <label for="inputEmail" class="form-label">Email</label>
						    <input type="email" class="form-control" id="inputEmail"  name="email">
						  </div>
						 
						   <div class="mb-3">
						    <label for="inputPass" class="form-label">Password</label>
						    <input type="password" class="form-control" id="inputPass" name="pass" >
						  </div>
						  
						  <div class="mb-3">
						    <label for="inputPhone" class="form-label">Phone</label>
						    <input type="text" class="form-control" id="inputPhone" name="phone" >
						  </div>
						  
						  <div class="mb-3">
						    <label for="inputDob" class="form-label">DOB</label>
						    <input type="date" class="form-control" id="inputDob"  name="dob">
						  </div>
						  <div class="mb-3">
						    <label for="inputDob" class="form-label">Gender</label>
						    <input type="radio"  id="inputDob" name="gender" value="male" >Male
						    <input type="radio"  id="inputDob" name="gender"  value="female" >Female
						    <input type="radio"  id="inputDob" name="gender"  value="others" >Others
						  </div>
						  
						  <div class="mb-3">
						    <label for="inputAdd" class="form-label">Address</label>
						    <input type="text" class="form-control" id="inputAdd" name="add" >
						  </div>
						  
						  <button type="submit" class="btn btn-primary">Submit</button>
					</form>
    				</div>
    		</div>
    		
    		<div class="row mt-5">
    				<table class="table">
					  <thead>
					    <tr>
					      <th scope="col">#</th>
					      <th scope="col">Name</th>
					      <th scope="col">Email</th>
					      <th scope="col">Phone</th>
					      <th scope="col">Dob</th>
					      <th scope="col">Address</th>
					      <th scope="col">Edit</th>
					      <th scope="col">Delete</th>
					    </tr>
					  </thead>
					  <tbody>
					    <tr>
					      <th scope="row">1</th>
					      <td>Mark</td>
					      <td>Otto</td>
					      <td>@mdo</td>
					      <td>Mark</td>
					      <td>Otto</td>
					      <td>@mdo</td>
					      <td>Otto</td>
					    </tr>
					    
					  </tbody>
					</table>
    		</div>
    </div>
    
    
    
    
     <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
  </body>
</html>
