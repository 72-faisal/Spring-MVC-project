<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Loan a Banking Category Flat Bootstrap Responsive
	Website Template | Services :: w3layouts</title>
<style type="text/css">
/* Global Styles */
body {
	font-family: 'Poppins', sans-serif;
	margin: 0;
	padding: 0;
	background-color: #f5f5f5;
}

/* Header Styles */
/*   header {
        background-color: #333;
        color: #fff;
        padding: 10px 0;
    } */
.top {
	background-color: #555;
	padding: 5px 0;
}

.top-middle ul, .top-left ul {
	padding: 0;
	margin: 0;
	list-style: none;
}

.top-middle ul li, .top-left ul li {
	display: inline;
	margin-right: 10px;
}

/* Apply Online Section Styles */
.apply-online {
	/* background-color: #fff; */
	padding: 20px;
	margin: 20px 0;
	border-radius: 8px;
	box-shadow: 0 0 6px rgba(0, 0, 0, 0.1);
}

.apply-online h2 span {
	color: #333;
}

.apply-online ul {
	list-style: none;
	padding: 60px;
	margin: 0;
	text-align: center;
}

.apply-online ul li {
	display: inline-block;
	margin-right: 75px;
	vertical-align: top;
}

.apply-online ul li img {
	max-width: 100%;
}

.apply-online ul li p {
	margin: 5px 0;
}

.apply-online .apply-btn {
	background-color: #bfbfbf;
	color: #000;
	padding: 10px 20px;
	text-decoration: none;
	border-radius: 5px;
	display: inline-block;
	margin-top: 20px;
}

/* Footer Styles */
/*  footer {
        background-color: #f1f1f1;
        color: #fff;
        text-align: center;
        padding: 10px 0;
        margin-top: 20px;
    } */
</style>
<!-- Additional stylesheets -->
<title>Home Loan a Banking Category Flat Bootstrap Responsive
	Website Template | Services :: w3layouts</title>
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
					<a class="navbar-brand text-capitalize" href="index"> Home Loan
					</a>
				</h1>
				<button class="navbar-toggler" type="button" data-toggle="collapse"
					data-target="#navbarSupportedContent"
					aria-controls="navbarSupportedContent" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>

				<div class="collapse navbar-collapse" id="navbarSupportedContent">
					<ul class="navbar-nav text-center  ml-lg-auto">
						<li class="nav-item mr-3"><a class="nav-link" href="index">Home
								<span class="sr-only">(current)</span>
						</a></li>
						<li class="nav-item  mr-3"><a class="nav-link" href="about">About
								Us</a></li>

						<li class="nav-item dropdown mr-3"><a
							class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
							role="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false"> Services </a>
							<div class="dropdown-menu" aria-labelledby="navbarDropdown">
								<a class="dropdown-item" href="LoanApplyOnline">Apply Online</a>
								<a class="dropdown-item" href="LoanApprovedProject">Approved
									Project</a> <a class="dropdown-item" href="LoanCalculator">Loan
									Calculator</a>
							</div></li>
						<li class="nav-item dropdown mr-3"><a
							class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
							role="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false"> ${user.name } </a>
							<div class="dropdown-menu" aria-labelledby="navbarDropdown">
								<a class="dropdown-item" href="UserProfile">Profile</a> <a
									class="dropdown-item" href="UserChangePassword">Change
									Password</a> <a class="dropdown-item" href="UserLogout">Logout</a>
							</div></li>
						<!-- 	<li class="nav-item">
							<a class="nav-link" href="contact">contact</a>
						</li> -->
					</ul>
				</div>
			</nav>
		</div>
	</header>
	<!-- //header -->

	<!-- Apply Online Section -->
	<form action="LoanApply" method="post">
		<div
			class="apply-online resp-tab-content hor_1 resp-tab-content-active"
			aria-labelledby="hor_1_tab_item-2" style="display: block">
			<h2 style="text-align: center">
				<span >Calculator</span>
			</h2>
			<ul>
				<li>
					<p>
						<a href="homeLoanEMI"> <img
							src="<%=request.getContextPath()%>/resources/images/calc-img1.png"
							alt="Home Loan EMI Calculator" title="Home Loan EMI Calculator"></a>
					</p>
					<p>
						<a href="homeLoanEMI">Home Loan <br> EMI Calculator
						</a>
					</p>
				</li>
				<li>
					<p>
						<a href="homeLoan"> <img
							src="<%=request.getContextPath()%>/resources/images/calc-img2.png"
							alt="Home Loan Takeover Calculator"
							title="Home Loan Takeover Calculator"></a>
					</p>
					<p>
						<a href="homeLoan">Home Loan <br> Takeover Calculator
						</a>
					</p>
				</li>
				<li>
					<p>
						<a href="Maxgain"> <img
							src="<%=request.getContextPath()%>/resources/images/calc-img3.png"
							alt="Maxgain Home Loan Calculator"
							title="Maxgain Home Loan Calculator"></a>
					</p>
					<p>
						<a href="Maxgain">Maxgain <br>Home Loan
						</a>
					</p>
				</li>
				<li>
					<p>
						<a href="flexiPay"> <img
							src="<%=request.getContextPath()%>/resources/images/calc-img4.png"
							alt="Flexipay Home Loan Calculator"
							title="Flexipay Home Loan Calculator"></a>
					</p>
					<p>
						<a href="flexiPay">Flexipay <br>Home loan
						</a>
					</p>
				</li>
				<li>
					<p>
						<a href="privilegeCalculator"> <img
							src="<%=request.getContextPath()%>/resources/images/calc-img5.png"
							alt="Privilege / Shaurya Home Loan EMI Calculator"
							title="Privilege / Shaurya Home Loan Calculator"></a>
					</p>
					<p>
						<a href="privilegeCalculator">Privilege <br> Shaurya Home
						</a>

					</p>
				</li>
			</ul>
			<!-- <p>&nbsp;</p>
		<p>&nbsp;</p> -->
			<!-- <p class="txt-center" style="text-align: center;">
			<input type="submit" class="apply-btn" value="Apply Now">
		</p> -->
		</div>
	</form>
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
