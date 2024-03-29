/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.82
 * Generated at: 2024-01-15 06:29:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class project1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("body {\r\n");
      out.write("	font-family: 'Arial', sans-serif;\r\n");
      out.write("	margin: 0;\r\n");
      out.write("	padding: 0;\r\n");
      out.write("	background-color: #f4f4f4;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("header {\r\n");
      out.write("	background-color: #333;\r\n");
      out.write("	color: #fff;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	padding: 1rem;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".container {\r\n");
      out.write("	max-width: 800px;\r\n");
      out.write("	margin: 20px auto;\r\n");
      out.write("	padding: 20px;\r\n");
      out.write("	background-color: #fff;\r\n");
      out.write("	border-radius: 8px;\r\n");
      out.write("	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".project-image {\r\n");
      out.write("	width: 50%;\r\n");
      out.write("	border-radius: 8px;\r\n");
      out.write("	margin-bottom: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".apply-button {\r\n");
      out.write("	display: block;\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	padding: 10px;\r\n");
      out.write("	background-color: #333;\r\n");
      out.write("	color: #fff;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	text-decoration: none;\r\n");
      out.write("	border-radius: 4px;\r\n");
      out.write("	cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".apply-button:hover {\r\n");
      out.write("	background-color: #555;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<header>\r\n");
      out.write("		<h1>Oak Ridge Residences</h1>\r\n");
      out.write("	</header>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<img src=\"");
      out.print(request.getContextPath());
      out.write("/resources/images/approved-img-1.png\" alt=\"Oak Ridge Residences\"\r\n");
      out.write("			class=\"project-image\">\r\n");
      out.write("\r\n");
      out.write("		<h2>Project Highlights</h2>\r\n");
      out.write("		<ul>\r\n");
      out.write("			<li>Spacious 2 and 3 BHK apartments</li>\r\n");
      out.write("			<li>State-of-the-art amenities: Gym, Swimming Pool, Community\r\n");
      out.write("				Center</li>\r\n");
      out.write("			<li>Proximity to schools, parks, and shopping centers</li>\r\n");
      out.write("		</ul>\r\n");
      out.write("\r\n");
      out.write("		<h2>Loan Terms</h2>\r\n");
      out.write("		<ul>\r\n");
      out.write("			<li>Interest Rate: 4.5% per annum</li>\r\n");
      out.write("			<li>Loan Tenure: Up to 20 years</li>\r\n");
      out.write("		</ul>\r\n");
      out.write("\r\n");
      out.write("		<h2>Application Process</h2>\r\n");
      out.write("		<ol>\r\n");
      out.write("			<li>Fill out the online application form.</li>\r\n");
      out.write("			<li>Submit necessary documents: income proof, identity proof,\r\n");
      out.write("				property details.</li>\r\n");
      out.write("		</ol>\r\n");
      out.write("\r\n");
      out.write("		<h2>Customer Reviews</h2>\r\n");
      out.write("		<p>\"We love our new home at Oak Ridge! The process of getting a\r\n");
      out.write("			loan was smooth, and the amenities are fantastic.\" - John D.</p>\r\n");
      out.write("\r\n");
      out.write("		<h2>Contact Information</h2>\r\n");
      out.write("		<p>Sales Office: [Contact Details]</p>\r\n");
      out.write("		<p>Customer Service: [Contact Details]</p>\r\n");
      out.write("\r\n");
      out.write("		<h2>FAQs</h2>\r\n");
      out.write("		<dl>\r\n");
      out.write("			<dt>Q: What are the eligibility criteria for the home loan?</dt>\r\n");
      out.write("			<dd>\r\n");
      out.write("				A: Eligibility is based on income, credit history, and property\r\n");
      out.write("				details. Check our eligibility criteria <a href=\"#\">here</a>.\r\n");
      out.write("			</dd>\r\n");
      out.write("\r\n");
      out.write("			<dt>Q: Can I prepay my loan without penalties?</dt>\r\n");
      out.write("			<dd>A: Yes, you can prepay your loan without incurring any\r\n");
      out.write("				penalties.</dd>\r\n");
      out.write("		</dl>\r\n");
      out.write("\r\n");
      out.write("		<a href=\"OnlineForm\" class=\"apply-button\">Apply Now</a>\r\n");
      out.write("	</div>\r\n");
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
