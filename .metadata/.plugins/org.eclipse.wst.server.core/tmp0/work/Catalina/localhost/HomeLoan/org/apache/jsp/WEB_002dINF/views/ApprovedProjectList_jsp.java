/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.82
 * Generated at: 2023-12-29 05:30:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ApprovedProjectList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--\r\n");
      out.write("Author: W3layouts\r\n");
      out.write("Author URL: http://w3layouts.com\r\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\r\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\r\n");
      out.write("-->\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html lang=\"zxx\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<title>Home Loan a Banking Category Flat Bootstrap Responsive\r\n");
      out.write("	Website Template | Contact :: w3layouts</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"keywords\"\r\n");
      out.write("	content=\"Home Loan Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \r\n");
      out.write("SmartPhone Compatible web template, free WebDesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\r\n");
      out.write("<script>\r\n");
      out.write("	addEventListener(\"load\", function() {\r\n");
      out.write("		setTimeout(hideURLbar, 0);\r\n");
      out.write("	}, false);\r\n");
      out.write("\r\n");
      out.write("	function hideURLbar() {\r\n");
      out.write("		window.scrollTo(0, 1);\r\n");
      out.write("	}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap Core CSS -->\r\n");
      out.write("<link href=\"");
      out.print(request.getContextPath());
      out.write("/resources/css/bootstrap.css\"\r\n");
      out.write("	rel='stylesheet' type='text/css' />\r\n");
      out.write("<link href=\"");
      out.print(request.getContextPath());
      out.write("/resources/css/style.css\"\r\n");
      out.write("	rel='stylesheet' type='text/css' />\r\n");
      out.write("<!-- font-awesome icons -->\r\n");
      out.write("<link\r\n");
      out.write("	href=\"");
      out.print(request.getContextPath());
      out.write("/resources/css/fontawesome-all.min.css\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<!-- //Custom Theme files -->\r\n");
      out.write("<!-- online fonts -->\r\n");
      out.write("<!-- titles -->\r\n");
      out.write("<link\r\n");
      out.write("	href=\"//fonts.googleapis.com/css?family=Raleway:300,400,500,600,700,800,900\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<!-- body -->\r\n");
      out.write("<link\r\n");
      out.write("	href=\"//fonts.googleapis.com/css?family=Poppins:400,500,600,700,800\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("table {\r\n");
      out.write("	width: 100%; /* Adjust the width as needed (e.g., 70% to 80%) */\r\n");
      out.write("	border-collapse: collapse;\r\n");
      out.write("	margin-top: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("th, td {\r\n");
      out.write("	border: 1px solid #dddddd;\r\n");
      out.write("	text-align: left;\r\n");
      out.write("	padding: 8px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("th {\r\n");
      out.write("	background-color: #d3d3d3;\r\n");
      out.write("	/* Slightly darker color for the table header */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("tbody {\r\n");
      out.write("	text-align: center; /* Center the content of the tbody */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a {\r\n");
      out.write("	color: #0066cc;\r\n");
      out.write("	text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a:hover {\r\n");
      out.write("	text-decoration: underline;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".button-container {\r\n");
      out.write("	margin-top: 20px;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".button {\r\n");
      out.write("	display: inline-block;\r\n");
      out.write("	padding: 10px 20px;\r\n");
      out.write("	margin: 0 10px;\r\n");
      out.write("	text-decoration: none;\r\n");
      out.write("	background-color: #0066cc;\r\n");
      out.write("	color: #fff;\r\n");
      out.write("	border: 1px solid #0066cc;\r\n");
      out.write("	border-radius: 5px;\r\n");
      out.write("	cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".button:hover {\r\n");
      out.write("	background-color: #004080;\r\n");
      out.write("	border-color: #004080;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Align buttons */\r\n");
      out.write(".button-left {\r\n");
      out.write("	text-align: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".button-right {\r\n");
      out.write("	text-align: right;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	<!-- header -->\r\n");
      out.write("	<header>\r\n");
      out.write("		<div class=\"top\">\r\n");
      out.write("			<div class=\"container\">\r\n");
      out.write("				<div class=\"t-op row\">\r\n");
      out.write("					<div class=\"col-sm-6 top-middle\">\r\n");
      out.write("						<ul>\r\n");
      out.write("							<li><a href=\"#\"><i class=\"fab fa-facebook-f\"></i></a></li>\r\n");
      out.write("							<li><a href=\"#\"><i class=\"fab fa-twitter\"></i></a></li>\r\n");
      out.write("							<li><a href=\"#\"><i class=\"fab fa-google-plus-g\"></i></a></li>\r\n");
      out.write("							<li><a href=\"#\"><i class=\"fab fa-linkedin-in\"></i></a></li>\r\n");
      out.write("						</ul>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-sm-6 top-left\">\r\n");
      out.write("						<ul>\r\n");
      out.write("							<li><i class=\"fas fa-phone\"></i> +021 365 777</li>\r\n");
      out.write("						</ul>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<nav class=\"navbar navbar-expand-lg navbar-light\">\r\n");
      out.write("				<h1>\r\n");
      out.write("					<a class=\"navbar-brand text-capitalize\" href=index> Home Loan </a>\r\n");
      out.write("				</h1>\r\n");
      out.write("				<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\r\n");
      out.write("					data-target=\"#navbarSupportedContent\"\r\n");
      out.write("					aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n");
      out.write("					aria-label=\"Toggle navigation\">\r\n");
      out.write("					<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("				</button>\r\n");
      out.write("\r\n");
      out.write("				<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("					<ul class=\"navbar-nav text-center  ml-lg-auto\">\r\n");
      out.write("						<li class=\"nav-item mr-3\"><a class=\"nav-link\" href=index>Home\r\n");
      out.write("								<span class=\"sr-only\">(current)</span>\r\n");
      out.write("						</a></li>\r\n");
      out.write("						<li class=\"nav-item  mr-3\"><a class=\"nav-link\" href=\"about\">About</a>\r\n");
      out.write("						</li>\r\n");
      out.write("						<li class=\"nav-item  mr-3\"><a class=\"nav-link\"\r\n");
      out.write("							href=\"services\">Services</a></li>\r\n");
      out.write("						<li class=\"nav-item dropdown mr-3\"><a\r\n");
      out.write("							class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("							role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("							aria-expanded=\"false\"> Singup </a>\r\n");
      out.write("							<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("								<a class=\"dropdown-item\" href=\"UserRegister\">Register</a>\r\n");
      out.write("								<!-- <a class=\"dropdown-item\" href=\"gallery\">Gallery</a> -->\r\n");
      out.write("							</div></li>\r\n");
      out.write("						<li class=\"nav-item dropdown mr-3\"><a\r\n");
      out.write("							class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("							role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("							aria-expanded=\"false\"> Login </a>\r\n");
      out.write("							<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("								<a class=\"dropdown-item\" href=\"UserLogin\">Login</a>\r\n");
      out.write("								<!-- <a class=\"dropdown-item\" href=\"gallery\">Gallery</a> -->\r\n");
      out.write("							</div></li>\r\n");
      out.write("						<!-- 	<li class=\"nav-item active\"><a class=\"nav-link\"\r\n");
      out.write("							href=\"contact\">contact</a></li> -->\r\n");
      out.write("					</ul>\r\n");
      out.write("				</div>\r\n");
      out.write("			</nav>\r\n");
      out.write("		</div>\r\n");
      out.write("	</header>\r\n");
      out.write("	<!-- //header -->\r\n");
      out.write("	<!-- banner -->\r\n");
      out.write("	<section class=\"banner-1\"></section>\r\n");
      out.write("	<!-- //banner -->\r\n");
      out.write("	<!--/contact-->\r\n");
      out.write("	<section class=\"contact py-5\">\r\n");
      out.write("		<div class=\"container py-md-4 mt-md-3\">\r\n");
      out.write("			<h2 class=\"heading-agileinfo\">\r\n");
      out.write("				Contact Us<span>Speed Up The Loan Process</span>\r\n");
      out.write("			</h2>\r\n");
      out.write("			<span class=\"w3-line black\"></span>\r\n");
      out.write("			<div class=\"inner-sec-w3layouts-agileinfo mt-md-5 pt-5\">\r\n");
      out.write("\r\n");
      out.write("				<div class=\"contact_grid_right mt-5\">\r\n");
      out.write("					<h6>Please fill this form to contact with us.</h6>\r\n");
      out.write("					<form action=\"UploadDocuments\" method=\"post\"\r\n");
      out.write("						enctype=\"multipart/form-data\">\r\n");
      out.write("\r\n");
      out.write("						<table>\r\n");
      out.write("							<thead>\r\n");
      out.write("								<tr>\r\n");
      out.write("									<th>No</th>\r\n");
      out.write("									<th>Project Name</th>\r\n");
      out.write("									<th>Details</th>\r\n");
      out.write("								</tr>\r\n");
      out.write("							</thead>\r\n");
      out.write("							<tbody>\r\n");
      out.write("								<tr>\r\n");
      out.write("									<td>1</td>\r\n");
      out.write("									<td>Project A</td>\r\n");
      out.write("									<td><a href=\"project1\">Details</a></td>\r\n");
      out.write("								</tr>\r\n");
      out.write("								<tr>\r\n");
      out.write("									<td>2</td>\r\n");
      out.write("									<td>Project B</td>\r\n");
      out.write("									<td><a href=\"http://example.com/projectB/details\">Details</a></td>\r\n");
      out.write("								</tr>\r\n");
      out.write("								<tr>\r\n");
      out.write("									<td>3</td>\r\n");
      out.write("									<td>Project C</td>\r\n");
      out.write("									<td><a href=\"http://example.com/projectC/details\">Details</a></td>\r\n");
      out.write("								</tr>\r\n");
      out.write("								<tr>\r\n");
      out.write("									<td>4</td>\r\n");
      out.write("									<td>Project D</td>\r\n");
      out.write("									<td><a href=\"http://example.com/projectD/details\">Details</a></td>\r\n");
      out.write("								</tr>\r\n");
      out.write("								<tr>\r\n");
      out.write("									<td>5</td>\r\n");
      out.write("									<td>Project E</td>\r\n");
      out.write("									<td><a href=\"http://example.com/projectD/details\">Details</a></td>\r\n");
      out.write("								</tr>\r\n");
      out.write("								<tr>\r\n");
      out.write("									<td>6</td>\r\n");
      out.write("									<td>Project F</td>\r\n");
      out.write("									<td><a href=\"http://example.com/projectD/details\">Details</a></td>\r\n");
      out.write("								</tr>\r\n");
      out.write("								<tr>\r\n");
      out.write("									<td>7</td>\r\n");
      out.write("									<td>Project G</td>\r\n");
      out.write("									<td><a href=\"http://example.com/projectD/details\">Details</a></td>\r\n");
      out.write("								</tr>\r\n");
      out.write("\r\n");
      out.write("								<tr>\r\n");
      out.write("									<td>8</td>\r\n");
      out.write("									<td>Project H</td>\r\n");
      out.write("									<td><a href=\"http://example.com/projectD/details\">Details</a></td>\r\n");
      out.write("								</tr>\r\n");
      out.write("								<tr>\r\n");
      out.write("									<td>9</td>\r\n");
      out.write("									<td>Project I</td>\r\n");
      out.write("									<td><a href=\"http://example.com/projectD/details\">Details</a></td>\r\n");
      out.write("								</tr>\r\n");
      out.write("\r\n");
      out.write("							</tbody>\r\n");
      out.write("							\r\n");
      out.write("						</table>\r\n");
      out.write("						<div class=\"button-container\">\r\n");
      out.write("								<a href=\"LoanApprovedProject\" class=\"button button-left\">Back</a>\r\n");
      out.write("								<a href=\"next-page.html\" class=\"button button-right\">Next</a>\r\n");
      out.write("							</div>\r\n");
      out.write("					</form>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</section>\r\n");
      out.write("	<!--//contact-->\r\n");
      out.write("	<!--footer-->\r\n");
      out.write("	<footer>\r\n");
      out.write("		<div class=\"container py-md-4 mt-md-3\">\r\n");
      out.write("			<div class=\"row footer-top-w3layouts-agile py-5\">\r\n");
      out.write("				<div class=\"col-lg-3 col-md-6 col-sm-6 footer-grid\">\r\n");
      out.write("					<div class=\"footer-title\">\r\n");
      out.write("						<h3>About Us</h3>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"footer-text\">\r\n");
      out.write("						<p>Curabitur non nulla sit amet nisl tempus convallis quis ac\r\n");
      out.write("							lectus. lacinia eget consectetur sed, convallis at tellus..</p>\r\n");
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-lg-3 col-md-6 col-sm-6 footer-grid\">\r\n");
      out.write("					<div class=\"footer-title\">\r\n");
      out.write("						<h3>Contact Us</h3>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"footer-office-hour\">\r\n");
      out.write("						<ul>\r\n");
      out.write("							<li class=\"hd\">Address :</li>\r\n");
      out.write("							<li>No.27 - 5549436 street lorem, Newyork City, USA</li>\r\n");
      out.write("\r\n");
      out.write("						</ul>\r\n");
      out.write("						<ul>\r\n");
      out.write("							<li class=\"hd\">Phone:+ 1 (234) 567 8901</li>\r\n");
      out.write("							<li class=\"hd\">Email: <a href=\"mailto:info@example.com\">info@example.com</a>\r\n");
      out.write("							</li>\r\n");
      out.write("							<li class=\"hd\">Fax: 1(234) 567 8901</li>\r\n");
      out.write("						</ul>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-lg-3 col-md-6 col-sm-6 footer-grid\">\r\n");
      out.write("					<div class=\"footer-title\">\r\n");
      out.write("						<h3>Recent Posts</h3>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"footer-list\">\r\n");
      out.write("						<div class=\"flickr-grid\">\r\n");
      out.write("							<a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal\"> <img\r\n");
      out.write("								src=\"");
      out.print(request.getContextPath());
      out.write("/resources/images/g1.jpg\"\r\n");
      out.write("								class=\"img-fluid\" alt=\" \">\r\n");
      out.write("							</a>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"flickr-grid\">\r\n");
      out.write("							<a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal\"> <img\r\n");
      out.write("								src=\"");
      out.print(request.getContextPath());
      out.write("/resources/images/g2.jpg\"\r\n");
      out.write("								class=\"img-fluid\" alt=\" \">\r\n");
      out.write("							</a>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"flickr-grid\">\r\n");
      out.write("							<a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal\"> <img\r\n");
      out.write("								src=\"");
      out.print(request.getContextPath());
      out.write("/resources/images/g3.jpg\"\r\n");
      out.write("								class=\"img-fluid\" alt=\" \">\r\n");
      out.write("							</a>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"flickr-grid\">\r\n");
      out.write("							<a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal\"> <img\r\n");
      out.write("								src=\"");
      out.print(request.getContextPath());
      out.write("/resources/images/g4.jpg\"\r\n");
      out.write("								class=\"img-fluid\" alt=\" \">\r\n");
      out.write("							</a>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"flickr-grid\">\r\n");
      out.write("							<a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal\"> <img\r\n");
      out.write("								src=\"");
      out.print(request.getContextPath());
      out.write("/resources/images/g5.jpg\"\r\n");
      out.write("								class=\"img-fluid\" alt=\" \">\r\n");
      out.write("							</a>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"flickr-grid\">\r\n");
      out.write("							<a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal\"> <img\r\n");
      out.write("								src=\"");
      out.print(request.getContextPath());
      out.write("/resources/images/g6.jpg\"\r\n");
      out.write("								class=\"img-fluid\" alt=\" \">\r\n");
      out.write("							</a>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"flickr-grid\">\r\n");
      out.write("							<a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal\"> <img\r\n");
      out.write("								src=\"");
      out.print(request.getContextPath());
      out.write("/resources/images/g7.jpg\"\r\n");
      out.write("								class=\"img-fluid\" alt=\" \">\r\n");
      out.write("							</a>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"flickr-grid\">\r\n");
      out.write("							<a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal\"> <img\r\n");
      out.write("								src=\"");
      out.print(request.getContextPath());
      out.write("/resources/images/g9.jpg\"\r\n");
      out.write("								class=\"img-fluid\" alt=\" \">\r\n");
      out.write("							</a>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"flickr-grid\">\r\n");
      out.write("							<a href=\"#\" data-toggle=\"modal\" data-target=\"#myModal\"> <img\r\n");
      out.write("								src=\"");
      out.print(request.getContextPath());
      out.write("/resources/images/g8.jpg\"\r\n");
      out.write("								class=\"img-fluid\" alt=\" \">\r\n");
      out.write("							</a>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"clearfix\"></div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-lg-3 col-md-6 col-sm-6 footer-grid\">\r\n");
      out.write("					<div class=\"footer-title\">\r\n");
      out.write("						<h3>Subscribe</h3>\r\n");
      out.write("					</div>\r\n");
      out.write("					<p>Vivamus magna justo, lacinia eget consectetur sed.</p>\r\n");
      out.write("					<form action=\"#\" method=\"post\" class=\"newsletter\">\r\n");
      out.write("						<input class=\"email\" type=\"email\" placeholder=\"Your email...\"\r\n");
      out.write("							required=\"\">\r\n");
      out.write("						<button class=\"btn1\">\r\n");
      out.write("							<i class=\"far fa-envelope\"></i>\r\n");
      out.write("						</button>\r\n");
      out.write("					</form>\r\n");
      out.write("					<div class=\"clearfix\"></div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</footer>\r\n");
      out.write("	<!---->\r\n");
      out.write("	<div class=\"copyright py-3\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<div class=\"copyrighttop\">\r\n");
      out.write("				<ul>\r\n");
      out.write("					<li>\r\n");
      out.write("						<h4>Follow us on:</h4>\r\n");
      out.write("					</li>\r\n");
      out.write("					<li><a class=\"facebook\" href=\"#\"> <i\r\n");
      out.write("							class=\"fab fa-facebook-f\"></i>\r\n");
      out.write("					</a></li>\r\n");
      out.write("					<li><a class=\"facebook\" href=\"#\"> <i\r\n");
      out.write("							class=\"fab fa-twitter\"></i>\r\n");
      out.write("					</a></li>\r\n");
      out.write("					<li><a class=\"facebook\" href=\"#\"> <i\r\n");
      out.write("							class=\"fab fa-google-plus-g\"></i>\r\n");
      out.write("					</a></li>\r\n");
      out.write("					<li><a class=\"facebook\" href=\"#\"> <i\r\n");
      out.write("							class=\"fab fa-pinterest-p\"></i>\r\n");
      out.write("					</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"copyrightbottom\">\r\n");
      out.write("				<p>\r\n");
      out.write("					© 2018 Home Loan. All Rights Reserved | Design by <a\r\n");
      out.write("						href=\"http://w3layouts.com/\">W3layouts</a>\r\n");
      out.write("				</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"clearfix\"></div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- Modal -->\r\n");
      out.write("	<div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\"\r\n");
      out.write("		aria-labelledby=\"exampleModalCenterTitle\" aria-hidden=\"true\">\r\n");
      out.write("		<div class=\"modal-dialog modal-dialog-centered\" role=\"document\">\r\n");
      out.write("			<div class=\"modal-content\">\r\n");
      out.write("				<div class=\"modal-header\">\r\n");
      out.write("					<h4 class=\"modal-title\">Home Loan</h4>\r\n");
      out.write("					<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\r\n");
      out.write("						aria-label=\"Close\">\r\n");
      out.write("						<span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("					</button>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"modal-body\">\r\n");
      out.write("					<div class=\"agileits-w3layouts-info\">\r\n");
      out.write("						<img src=\"");
      out.print(request.getContextPath());
      out.write("/resources/images/g6.jpg\"\r\n");
      out.write("							class=\"img-fluid\" alt=\"\" />\r\n");
      out.write("						<p>Duis venenatis, turpis eu bibendum porttitor, sapien quam\r\n");
      out.write("							ultricies tellus, ac rhoncus risus odio eget nunc. Pellentesque\r\n");
      out.write("							ac fermentum diam. Integer eu facilisis nunc, a iaculis felis.\r\n");
      out.write("							Pellentesque pellentesque tempor enim, in dapibus turpis\r\n");
      out.write("							porttitor quis.</p>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"modal-footer\">\r\n");
      out.write("					<button type=\"button\" class=\"btn btn-secondary\"\r\n");
      out.write("						data-dismiss=\"modal\">Close</button>\r\n");
      out.write("					<button type=\"button\" class=\"btn btn-primary\">Save changes</button>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- //Modal -->\r\n");
      out.write("	<!-- js-->\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"");
      out.print(request.getContextPath());
      out.write("/resources/js/jquery-2.2.3.min.js\"></script>\r\n");
      out.write("	<!-- js-->\r\n");
      out.write("	<!-- Bootstrap Core JavaScript -->\r\n");
      out.write("	<script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/js/bootstrap.js \">\r\n");
      out.write("		\r\n");
      out.write("	</script>\r\n");
      out.write("	<!-- //Bootstrap Core JavaScript -->\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
