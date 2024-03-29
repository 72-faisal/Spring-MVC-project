<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
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
table {
	width: 100%; /* Adjust the width as needed (e.g., 70% to 80%) */
	border-collapse: collapse;
	margin-top: 20px;
}

th, td {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

th {
	background-color: #d3d3d3;
	/* Slightly darker color for the table header */
}

tbody {
	text-align: center; /* Center the content of the tbody */
}

a {
	color: #0066cc;
	text-decoration: none;
}

a:hover {
	text-decoration: underline;
}

.button-container {
	margin-top: 20px;
	text-align: center;
}

.button {
	display: inline-block;
	padding: 10px 20px;
	margin: 0 10px;
	text-decoration: none;
	background-color: #0066cc;
	color: #fff;
	border: 1px solid #0066cc;
	border-radius: 5px;
	cursor: pointer;
}

.button:hover {
	background-color: #004080;
	border-color: #004080;
}

/* Align buttons */
.button-left {
	text-align: left;
}

.button-right {
	text-align: right;
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

				<div class="contact_grid_right mt-5">
					<h6>Please fill this form to contact with us.</h6>
					<form action="UploadDocuments" method="post"
						enctype="multipart/form-data">

						<table>
							<thead>
								<tr>
									<th>No</th>
									<th>Project Name</th>
									<th>Details</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>1</td>
									<td>Project A</td>
									<td><a href="project1">Details</a></td>
								</tr>
								<tr>
									<td>2</td>
									<td>Project B</td>
									<td><a href="project2">Details</a></td>
								</tr>
								<tr>
									<td>3</td>
									<td>Project C</td>
									<td><a href="project3">Details</a></td>
								</tr>
								<tr>
									<td>4</td>
									<td>Project D</td>
									<td><a href="project4">Details</a></td>
								</tr>
								<tr>
									<td>5</td>
									<td>Project E</td>
									<td><a href="project5">Details</a></td>
								</tr>
								<tr>
									<td>6</td>
									<td>Project F</td>
									<td><a href="project6">Details</a></td>
								</tr>
								

							</tbody>
							
						</table>
						<div class="button-container">
								<a href="LoanApprovedProject" class="button button-left">Back</a>
								<a href="next-page.html" class="button button-right">Next</a>
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
	<!-- js-->
	<script
		src="<%=request.getContextPath()%>/resources/js/jquery-2.2.3.min.js"></script>
	<!-- js-->
	<!-- Bootstrap Core JavaScript -->
	<script src="<%=request.getContextPath()%>/resources/js/bootstrap.js ">
		
	</script>
	<!-- //Bootstrap Core JavaScript -->
</body>
</html>