<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
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
                        <li class="active"> Login Page</li>
                    </ul>
                </div>
            </div>
        </div>
        <!-- Breadcrumb Area End -->

    </div>
    <!-- Breadcrumb Section End -->

    <!-- Login Section Start -->
    <div class="section section-margin">
        <div class="container">
            <div class="row">
                <div class="col-lg-6 col-md-8 m-auto">
                    <div class="login-wrapper">

                        <!-- Login Title & Content Start -->
                        <div class="section-content text-center mb-5">
                            <h2 class="title mb-2">Login</h2>
                            <p class="desc-content">Please login using account detail bellow.</p>
                        </div>
                        <!-- Login Title & Content End -->

                        <!-- Form Action Start -->
                        <form id="myForm">

                            <!-- Input Email Start -->
                            <div class="single-input-item mb-3">
                                <input type="email" name="uEmail" placeholder="Email or Username" required>
                            </div>
                            <!-- Input Email End -->

                            <!-- Input Password Start -->
                            <div class="single-input-item mb-3">
                                <input type="password" name="uPass" placeholder="Enter your Password" required>
                            </div>
                            <!-- Input Password End -->

                            <!-- Checkbox/Forget Password Start -->
                            <div class="single-input-item mb-3">
                                <div class="login-reg-form-meta d-flex align-items-center justify-content-between">
                                    <div class="remember-meta mb-3">
                                        <div class="custom-control custom-checkbox">
                                            <input type="checkbox" class="custom-control-input" id="rememberMe">
                                            <label class="custom-control-label" for="rememberMe">Remember Me</label>
                                        </div>
                                    </div>
                                    <a href="#" class="forget-pwd mb-3">Forget Password?</a>
                                </div>
                            </div>
                            <!-- Checkbox/Forget Password End -->

                            <!-- Login Button Start -->
                            <div class="single-input-item mb-3">
                                <button class="btn btn btn-dark btn-hover-primary rounded-0">Login</button>
                            </div>
                            <!-- Login Button End -->

                            <!-- Lost Password & Creat New Account Start -->
                            <div class="lost-password">
                                <a href="register.html">Create Account</a>
                            </div>
                            <!-- Lost Password & Creat New Account End -->

                        </form>
                        <!-- Form Action End -->

                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Login Section End -->

   <%@ include file="custInclude/footer.jsp" %>


   <%@ include file="custInclude/mobile.jsp" %>

    <%@ include file="custInclude/script.jsp" %>
    <script>
	$(document).ready(function(){
		$("#myForm").on("submit",function(event){
			event.preventDefault();//stop default form submit
			var formdata=$(this).serialize();//collect form data
			
			$.ajax({
				url : "LoginServlet",
				type: "Post",
				data: formdata,
				success:function(response){
					if(response.trim()==="Customer"){
						alert("Login Successfull!");
						window.location.href="index.jsp";
					}
					else if(response.trim()==="Admin"){
						alert("Login Successfull!");
						window.location.href="admin/index.jsp";
					}
					else if(response.trim()==="NotActive"){
							$.toast({
							    text: "User Not Active!", 
							    heading: 'User', 
							    icon: 'warning', 
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
					else{
						$.toast({
						    text: "Login Failed!", 
						    heading: 'User', 
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