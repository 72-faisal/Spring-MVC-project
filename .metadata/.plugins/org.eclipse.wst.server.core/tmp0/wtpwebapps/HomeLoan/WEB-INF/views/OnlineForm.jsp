<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE HTML>
<html lang="zxx">

<head>
<title>Home Loan a Banking Category Flat Bootstrap Responsive
	Website Template | Contact :: w3layouts</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="utf-8">
<meta name="keywords"
	content="Home Loan Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
SmartPhone Compatible web template, free WebDesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script>
	addEventListener("load", function() {
		setTimeout(hideURLbar, 0);
	}, false);

	function hideURLbar() {
		window.scrollTo(0, 1);
	}
</script>

<!-- Bootstrap Core CSS -->
<link href="<%=request.getContextPath()%>/resources/css/bootstrap.css"
	rel='stylesheet' type='text/css' />
<link href="<%=request.getContextPath()%>/resources/css/style.css"
	rel='stylesheet' type='text/css' />
<!-- font-awesome icons -->
<link
	href="<%=request.getContextPath()%>/resources/css/fontawesome-all.min.css"
	rel="stylesheet">
<!-- //Custom Theme files -->
<!-- online fonts -->
<!-- titles -->
<link
	href="//fonts.googleapis.com/css?family=Raleway:300,400,500,600,700,800,900"
	rel="stylesheet">
<!-- body -->
<link
	href="//fonts.googleapis.com/css?family=Poppins:400,500,600,700,800"
	rel="stylesheet">
<style type="text/css">
body {
    font-family: Arial, sans-serif;
}

.form-container {
    max-width: 600px;
    margin: 0 auto;
}

.form-slide {
    display: none;
}

.form-slide:first-child {
    display: block;
}

h2 {
    background-color: #f2f2f2;
    padding: 10px;
    margin-top: 20px;
}

label, input {
    margin: 5px 0;
    display: block;
}

input[type="submit"], button {
    background-color: #4CAF50;
    color: white;
    padding: 10px 15px;
    border: none;
    border-radius: 5px;
    cursor: pointer;
}

br {
    margin-bottom: 10px;
}

</style>
</head>
<body>

	<!-- header -->
	<header>
		<div class="top">
			<div class="container">
				<div class="t-op row">
					<div class="col-sm-6 top-middle">
						<ul>
							<li><a href="#"><i class="fab fa-facebook-f"></i></a></li>
							<li><a href="#"><i class="fab fa-twitter"></i></a></li>
							<li><a href="#"><i class="fab fa-google-plus-g"></i></a></li>
							<li><a href="#"><i class="fab fa-linkedin-in"></i></a></li>
						</ul>
					</div>
					<div class="col-sm-6 top-left">
						<ul>
							<li><i class="fas fa-phone"></i> +021 365 777</li>
						</ul>
					</div>
				</div>
			</div>
		</div>
		<div class="container">
			<nav class="navbar navbar-expand-lg navbar-light">
				<h1>
					<a class="navbar-brand text-capitalize" href=index> Home Loan </a>
				</h1>
				<button class="navbar-toggler" type="button" data-toggle="collapse"
					data-target="#navbarSupportedContent"
					aria-controls="navbarSupportedContent" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>

				<div class="collapse navbar-collapse" id="navbarSupportedContent">
					<ul class="navbar-nav text-center  ml-lg-auto">
						<li class="nav-item mr-3"><a class="nav-link" href=index>Home
								<span class="sr-only">(current)</span>
						</a></li>
						<li class="nav-item  mr-3"><a class="nav-link" href="about">About</a>
						</li>
						<li class="nav-item  mr-3"><a class="nav-link"
							href="services">Services</a></li>
						<li class="nav-item dropdown mr-3"><a
							class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
							role="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false"> Singup </a>
							<div class="dropdown-menu" aria-labelledby="navbarDropdown">
								<a class="dropdown-item" href="UserRegister">Register</a>
								<!-- <a class="dropdown-item" href="gallery">Gallery</a> -->
							</div></li>
						<li class="nav-item dropdown mr-3"><a
							class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
							role="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false"> Login </a>
							<div class="dropdown-menu" aria-labelledby="navbarDropdown">
								<a class="dropdown-item" href="UserLogin">Login</a>
								<!-- <a class="dropdown-item" href="gallery">Gallery</a> -->
							</div></li>
						<!-- 	<li class="nav-item active"><a class="nav-link"
							href="contact">contact</a></li> -->
					</ul>
				</div>
			</nav>
		</div>
	</header>
	<!-- //header -->
	<!-- banner -->
	<section class="banner-1"></section>
	<!-- //banner -->
	<!--/contact-->
	<section class="contact py-5">
		<div class="container py-md-4 mt-md-3">
			<h2 class="heading-agileinfo">
				Contact Us<span>Speed Up The Loan Process</span>
			</h2>
			<span class="w3-line black"></span>
			<div class="inner-sec-w3layouts-agileinfo mt-md-5 pt-5">

<div class="form-container">
    <form id="loanForm" action="${pageContext.request.contextPath}/UploadData" method="post" enctype="multipart/form-data">
        <!-- Part 1: Personal Information -->
        <div class="form-slide">
            <h2>Personal Information</h2>
		    
    		<label for="lname">Name:</label>
    		<input type="text" id="lname" name="lname" required><br>

		    <label for="lemail">Email:</label>
		    <input type="email" id="lemail" name="lemail" required><br>

		    <label for="laddress">Address:</label>
		    <input type="text" id="laddress" name="laddress" required><br>

		    <label for="lcontact">Contact:</label>
		    <input type="text" id="lcontact" name="lcontact" required><br>

            <!-- ... (your personal information fields) -->
            <button type="button" onclick="nextSlide(1)">Next</button>
        </div>

        <!-- Part 2: Proof Documents -->
        <div class="form-slide">
            <h2>Proof Documents</h2>
           <label for="poidentity">Identity Proof:</label>
 		   <input type="file" id="poidentity" name="poidentity" required><br>

    		<label for="poresidence">Residence Proof:</label>
		    <input type="file" id="poresidence" name="poresidence" required><br>

		    <label for="poincome">Income Proof:</label>
    		<input type="file" id="poincome" name="poincome" required><br>

    		<label for="emp_proof">Employment Proof:</label>
    		<input type="file" id="emp_proof" name="emp_proof" required><br>

    		<label for="property_documents">Property Documents:</label>
    		<input type="file" id="property_documents" name="property_documents" required><br>
            <!-- ... (your proof documents fields) -->
            <button type="button" onclick="nextSlide(2)">Next</button>
        </div>

        <!-- Part 3: Additional Documents -->
        <div class="form-slide">
         <h2>Additional Documents</h2>
 	    	<label for="bank_statment">Bank Statement:</label>
	    	<input type="file" id="bank_statment" name="bank_statment" required><br>

    		<label for="dp_proof">Down Payment Proof:</label>
    		<input type="file" id="dp_proof" name="dp_proof" required><br>

		    <label for="guarantor_document">Guarantor Document:</label>
    		<input type="file" id="guarantor_document" name="guarantor_document" required><br>

    		<label for="property_valuation_proof">Property Valuation Proof:</label>
	    	<input type="file" id="property_valuation_proof" name="property_valuation_proof" required><br>

    		<label for="property_insurance">Property Insurance:</label>
    		<input type="file" id="property_insurance" name="property_insurance" required><br>

    <!-- Submit Button -->
    		<input type="submit"  value="Submit">
        	</div>
        	<div class="modal fade" id="uploadSuccessModal" tabindex="-1"
			role="dialog" aria-labelledby="uploadSuccessModalLabel"
			aria-hidden="true">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<h5 class="modal-title" id="uploadSuccessModalLabel">Data
							Sent Successfully!</h5>
						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
					</div>
					<div class="modal-body">
						<p>Bank Executive call you within 48 hours. Till then stay safe and happy.</p>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-primary"
							onclick="redirectToHome()">Go to Home</button>
					</div>
				</div>
			</div>
		</div>
    	</form>
	</div>
</div>
</div>
</section>
	<!--//contact-->
	<!--footer-->
	<footer>
		<div class="container py-md-4 mt-md-3">
			<div class="row footer-top-w3layouts-agile py-5">
				<div class="col-lg-3 col-md-6 col-sm-6 footer-grid">
					<div class="footer-title">
						<h3>About Us</h3>
					</div>
					<div class="footer-text">
						<p>Curabitur non nulla sit amet nisl tempus convallis quis ac
							lectus. lacinia eget consectetur sed, convallis at tellus..</p>

					</div>
				</div>
				<div class="col-lg-3 col-md-6 col-sm-6 footer-grid">
					<div class="footer-title">
						<h3>Contact Us</h3>
					</div>
					<div class="footer-office-hour">
						<ul>
							<li class="hd">Address :</li>
							<li>No.27 - 5549436 street lorem, Newyork City, USA</li>

						</ul>
						<ul>
							<li class="hd">Phone:+ 1 (234) 567 8901</li>
							<li class="hd">Email: <a href="mailto:info@example.com">info@example.com</a>
							</li>
							<li class="hd">Fax: 1(234) 567 8901</li>
						</ul>
					</div>
				</div>
				<div class="col-lg-3 col-md-6 col-sm-6 footer-grid">
					<div class="footer-title">
						<h3>Recent Posts</h3>
					</div>
					<div class="footer-list">
						<div class="flickr-grid">
							<a href="#" data-toggle="modal" data-target="#myModal"> <img
								src="<%=request.getContextPath()%>/resources/images/g1.jpg"
								class="img-fluid" alt=" ">
							</a>
						</div>
						<div class="flickr-grid">
							<a href="#" data-toggle="modal" data-target="#myModal"> <img
								src="<%=request.getContextPath()%>/resources/images/g2.jpg"
								class="img-fluid" alt=" ">
							</a>
						</div>
						<div class="flickr-grid">
							<a href="#" data-toggle="modal" data-target="#myModal"> <img
								src="<%=request.getContextPath()%>/resources/images/g3.jpg"
								class="img-fluid" alt=" ">
							</a>
						</div>
						<div class="flickr-grid">
							<a href="#" data-toggle="modal" data-target="#myModal"> <img
								src="<%=request.getContextPath()%>/resources/images/g4.jpg"
								class="img-fluid" alt=" ">
							</a>
						</div>
						<div class="flickr-grid">
							<a href="#" data-toggle="modal" data-target="#myModal"> <img
								src="<%=request.getContextPath()%>/resources/images/g5.jpg"
								class="img-fluid" alt=" ">
							</a>
						</div>
						<div class="flickr-grid">
							<a href="#" data-toggle="modal" data-target="#myModal"> <img
								src="<%=request.getContextPath()%>/resources/images/g6.jpg"
								class="img-fluid" alt=" ">
							</a>
						</div>
						<div class="flickr-grid">
							<a href="#" data-toggle="modal" data-target="#myModal"> <img
								src="<%=request.getContextPath()%>/resources/images/g7.jpg"
								class="img-fluid" alt=" ">
							</a>
						</div>
						<div class="flickr-grid">
							<a href="#" data-toggle="modal" data-target="#myModal"> <img
								src="<%=request.getContextPath()%>/resources/images/g9.jpg"
								class="img-fluid" alt=" ">
							</a>
						</div>
						<div class="flickr-grid">
							<a href="#" data-toggle="modal" data-target="#myModal"> <img
								src="<%=request.getContextPath()%>/resources/images/g8.jpg"
								class="img-fluid" alt=" ">
							</a>
						</div>
						<div class="clearfix"></div>
					</div>
				</div>
				<div class="col-lg-3 col-md-6 col-sm-6 footer-grid">
					<div class="footer-title">
						<h3>Subscribe</h3>
					</div>
					<p>Vivamus magna justo, lacinia eget consectetur sed.</p>
					<form action="#" method="post" class="newsletter">
						<input class="email" type="email" placeholder="Your email..."
							required="">
						<button class="btn1">
							<i class="far fa-envelope"></i>
						</button>
					</form>
					<div class="clearfix"></div>
				</div>
			</div>
		</div>
	</footer>
	<!---->
	<div class="copyright py-3">
		<div class="container">
			<div class="copyrighttop">
				<ul>
					<li>
						<h4>Follow us on:</h4>
					</li>
					<li><a class="facebook" href="#"> <i
							class="fab fa-facebook-f"></i>
					</a></li>
					<li><a class="facebook" href="#"> <i
							class="fab fa-twitter"></i>
					</a></li>
					<li><a class="facebook" href="#"> <i
							class="fab fa-google-plus-g"></i>
					</a></li>
					<li><a class="facebook" href="#"> <i
							class="fab fa-pinterest-p"></i>
					</a></li>
				</ul>
			</div>
			<div class="copyrightbottom">
				<p>
					� 2018 Home Loan. All Rights Reserved | Design by <a
						href="http://w3layouts.com/">W3layouts</a>
				</p>
			</div>
			<div class="clearfix"></div>
		</div>
	</div>
	<!-- Modal -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
		<div class="modal-dialog modal-dialog-centered" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h4 class="modal-title">Home Loan</h4>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<div class="agileits-w3layouts-info">
						<img src="<%=request.getContextPath()%>/resources/images/g6.jpg"
							class="img-fluid" alt="" />
						<p>Duis venenatis, turpis eu bibendum porttitor, sapien quam
							ultricies tellus, ac rhoncus risus odio eget nunc. Pellentesque
							ac fermentum diam. Integer eu facilisis nunc, a iaculis felis.
							Pellentesque pellentesque tempor enim, in dapibus turpis
							porttitor quis.</p>
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Close</button>
					<button type="button" class="btn btn-primary">Save changes</button>
				</div>
			</div>
		</div>
	</div>
	<!-- //Modal -->

</body>
<script>
    let currentSlide = 1;
    
    function showSlide(slideNumber) {
        const slides = document.querySelectorAll('.form-slide');
        
        slides.forEach((slide) => {
            slide.style.display = 'none';
        });
    
        slides[slideNumber - 1].style.display = 'block';
    }
    
    function nextSlide() {
        if (currentSlide < 3) {
            currentSlide++;
            showSlide(currentSlide);
        }
    }
    
    function submitForm(event) {
        event.preventDefault();
        alert('Form submitted successfully!'); // Replace with your form submission logic
    }
    
    showSlide(currentSlide);
    </script>
    	<!-- //pop-up-box -->
	<!-- Bootstrap JS and jQuery -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.0.7/dist/umd/popper.min.js"
        integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8Wv5lA4M7HA"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"
        integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8sh+WyL/QD6XJkzI1Wkw6ovJQOp6W2tNPDwV8y"
        crossorigin="anonymous"></script>

<!-- Your custom script -->
<script>
    function redirectToHome() {
        // You can replace this with the actual URL of your home page
        window.location.href = 'UserHome';
    }

    // Show the modal when the page loads
    $(document).ready(function () {
        $('#uploadSuccessModal').modal('show');
    });
</script>
<script
		src="<%=request.getContextPath()%>/resources/js/jquery-2.2.3.min.js"></script>
	<!-- js-->
	<!-- Bootstrap Core JavaScript -->
	<script src="<%=request.getContextPath()%>/resources/js/bootstrap.js ">
		
	</script>
	<!-- //Bootstrap Core JavaScript -->
</body>
</html>
</html>