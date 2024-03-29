<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body {
	font-family: 'Arial', sans-serif;
	margin: 0;
	padding: 0;
	background-color: #f4f4f4;
}

header {
	background-color: #333;
	color: #fff;
	text-align: center;
	padding: 1rem;
}

.container {
	max-width: 800px;
	margin: 20px auto;
	padding: 20px;
	background-color: #fff;
	border-radius: 8px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

.project-image {
	width: 50%;
	border-radius: 8px;
	margin-bottom: 20px;
}

.apply-button {
	display: block;
	width: 100%;
	padding: 10px;
	background-color: #333;
	color: #fff;
	text-align: center;
	text-decoration: none;
	border-radius: 4px;
	cursor: pointer;
}

.apply-button:hover {
	background-color: #555;
}
</style>
</head>
<body>
	<header>
		<h1>Oak Ridge Residences</h1>
	</header>

	<div class="container">
		<img src="<%=request.getContextPath()%>/resources/images/approved-img-1.png" alt="Oak Ridge Residences"
			class="project-image">

		<h2>Project Highlights</h2>
		<ul>
			<li>Spacious 2 and 3 BHK apartments</li>
			<li>State-of-the-art amenities: Gym, Swimming Pool, Community
				Center</li>
			<li>Proximity to schools, parks, and shopping centers</li>
		</ul>

		<h2>Loan Terms</h2>
		<ul>
			<li>Interest Rate: 4.5% per annum</li>
			<li>Loan Tenure: Up to 20 years</li>
		</ul>

		<h2>Application Process</h2>
		<ol>
			<li>Fill out the online application form.</li>
			<li>Submit necessary documents: income proof, identity proof,
				property details.</li>
		</ol>

		<h2>Customer Reviews</h2>
		<p>"We love our new home at Oak Ridge! The process of getting a
			loan was smooth, and the amenities are fantastic." - John D.</p>

		<h2>Contact Information</h2>
		<p>Sales Office: [Contact Details]</p>
		<p>Customer Service: [Contact Details]</p>

		<h2>FAQs</h2>
		<dl>
			<dt>Q: What are the eligibility criteria for the home loan?</dt>
			<dd>
				A: Eligibility is based on income, credit history, and property
				details. Check our eligibility criteria <a href="#">here</a>.
			</dd>

			<dt>Q: Can I prepay my loan without penalties?</dt>
			<dd>A: Yes, you can prepay your loan without incurring any
				penalties.</dd>
		</dl>

		<a href="OnlineForm" class="apply-button">Apply Now</a>
	</div>
</body>
</html>