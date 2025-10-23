<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Megamart</title>

    <%@ include file="custInclude/link.jsp" %>
</head>

<body>

  <%@ include file="custInclude/navbar.jsp" %>

    <!-- Breadcrumb Section Start -->
    <div class="section">

        <!-- Breadcrumb Area Start -->
        <div class="breadcrumb-area bg-primary">
            <div class="container">
                <div class="breadcrumb-content">
                    <ul>
                        <li>
                            <a href="index.html"><i class="fa fa-home"></i> </a>
                        </li>
                        <li class="active"> Register Page</li>
                    </ul>
                </div>
            </div>
        </div>
        <!-- Breadcrumb Area End -->

    </div>
    <!-- Breadcrumb Section End -->

    <!-- Register Section Start -->
    <div class="section section-margin">
        <div class="container">
            <div class="row">
                <div class="col-lg-6 col-md-8 m-auto">
                    <!-- Register Wrapper Start -->
                    <div class="register-wrapper">

                        <!-- Login Title & Content Start -->
                        <div class="section-content text-center mb-5">
                            <h2 class="title mb-2">Create Account</h2>
                            <p class="desc-content">Please Register using account detail bellow.</p>
                        </div>
                        <!-- Login Title & Content End -->

                        <!-- Form Action Start -->
                        <form id="myForm">

                            <div class="single-input-item mb-3">
                                <input type="text" name="uName"  placeholder="First Name" required>
                            </div>

                            <div class="single-input-item mb-3">
                                <input type="email" name="uEmail"  placeholder="Email or Username" required>
                            </div>

                            <div class="single-input-item mb-3">
                                <input type="password"  name="uPass"  placeholder="Enter your Password" required>
                            </div>
                            
                            <div class="single-input-item mb-3">
                                <input type="text"  name="uPhone"  placeholder="Enter your Phone" required>
                            </div>
							<div class="single-input-item mb-3">
                                <input type="text"  name="uAdd"  placeholder="Enter your Address" required>
                            </div>
                            <div class="single-input-item mb-3">
                                <input type="file"  name="uImg"   required>
                            </div>
                            <input type="hidden" name="secret" value="addCustomer">
                            <!-- Register Button Start -->
                            <div class="single-input-item mb-3">
                                <button class="btn btn btn-dark btn-hover-primary rounded-0">Register</button>
                            </div>
                            <!-- Register Button End -->

                        </form>
                        <!-- Form Action End -->

                    </div>
                    <!-- Register Wrapper End -->
                </div>
            </div>
        </div>
    </div>
    <!-- Register Section End -->

   


   

  
    
    <%@ include file="custInclude/footer.jsp" %>


   <%@ include file="custInclude/mobile.jsp" %>

    <%@ include file="custInclude/script.jsp" %>
    
    
    <script>
	$(document).ready(function(){
		$("#myForm").on("submit",function(event){
			event.preventDefault();//stop default form submit
			var formdata=new FormData(this);//collect form data
			
			$.ajax({
				url : "CustomerServlet",
				type: "Post",
				data: formdata,
				contentType: false,
                processData: false,
				success:function(response){
					if(response.trim()=="Yes"){
						$.toast({
						    text: "Registered Successfully!", 
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
						
					}else{
						$.toast({
						    text: "Registered Failed!", 
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