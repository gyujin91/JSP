/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.60
 * Generated at: 2022-04-29 08:12:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class boardDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/connectPool.conf", Long.valueOf(1651200059933L));
    _jspx_dependants.put("/ft.jsp", Long.valueOf(1651219446798L));
    _jspx_dependants.put("/connectClose.conf", Long.valueOf(1651200059928L));
    _jspx_dependants.put("/nav.jsp", Long.valueOf(1651219446802L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP?????? ?????? GET, POST ?????? HEAD ??????????????? ???????????????. Jasper??? OPTIONS ????????? ?????? ???????????????.");
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

	request.setCharacterEncoding("UTF-8");
	int bno = Integer.parseInt(request.getParameter("bno"));

      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>????????? ??? ??????</title>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-latest.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css\">\r\n");
      out.write("<!-- ?????? -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css\">\r\n");
      out.write("<!-- ?????????????????? -->\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container-full\">\r\n");
      out.write("<header id=\"hd\" class=\"panel-heading navbar navbar-default\">\r\n");
      out.write("	<div class=\"hd_wrap container\">\r\n");
      out.write("		");
      out.write('\r');
      out.write('\n');
  /*
	???????????????(scriptlet)  */
	String[] dp1 = {"????????????","????????????","?????????","????????????","????????????"};
	String[][] dp2 = {{"????????????","?????????","????????????","????????????"},
			{"?????????","????????????","?????????","????????????"},
			{"??????????????????","???????????????","???????????????"},
			{"?????????","?????????","?????????"},
			{"????????????","???????????????","??????????????????"}};
	String[][] lnk = {{"sub1.jsp#page1","sub1.jsp#page2","sub1.jsp#page3","sub1.jsp#page4"},
			{"sub2.jsp#page1","sub2.jsp#page2","sub2.jsp#page3","sub2.jsp#page4"},
			{"service1.jsp","service2.jsp","service3.jsp"},
			{"board1.jsp","board2.jsp","board3.jsp"},
			{"user1.jsp","user2.jsp","user3.jsp"}};

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<a class=\"logo navbar-header\" href=\"index.jsp\"><img src=\"./images/samsung_logo.svg\" alt=\"??????\"></a>\r\n");
      out.write("<nav id=\"gnb\" class=\"nav navbar-nav navbar-left\">\r\n");
      out.write("<ul class=\"nav navbar-nav\">\r\n");

	for(int i=0;i<dp1.length;i++) {

      out.write("\r\n");
      out.write("	<li class=\"dropdown\">\r\n");
      out.write("		<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">");
      out.print(dp1[i] );
      out.write("<span class=\"caret\"></span></a>\r\n");
      out.write("		<ul class=\"dropdown-menu\">\r\n");

		for(int j=0;j<dp2[i].length;j++) {

      out.write("\r\n");
      out.write("			<li><a class=\"dp2\" href=\"");
      out.print(lnk[i][j] );
      out.write('"');
      out.write('>');
      out.print(dp2[i][j] );
      out.write("</a></li>\r\n");

		}

      out.write("\r\n");
      out.write("		</ul>\r\n");
      out.write("	</li>\r\n");

	}

      out.write("\r\n");
      out.write("</ul>\r\n");
      out.write("</nav>\r\n");
      out.write("<p id=\"tnb\" class=\"nav navbar-nav navbar-right\" style=\"padding-top:18px;\">\r\n");
      out.write("	");
  
		String sid = (String) session.getAttribute("uid");
		String sname = (String) session.getAttribute("name");
		if(sid==null) {	//?????????
	
      out.write("\r\n");
      out.write("	<a href=\"login.jsp\">?????????</a>\r\n");
      out.write("	<a href=\"\">??????</a>\r\n");
      out.write("	<a href=\"agree.jsp\">????????????</a>\r\n");
      out.write("	");

		} else if(!sid.equals("admin")){ //????????????
	
      out.write("\r\n");
      out.write("	<a href=\"logout.jsp\">????????????</a>\r\n");
      out.write("	<a href=\"mypage.jsp\">");
      out.print(sname );
      out.write("</a>\r\n");
      out.write("	<a href=\"board1.jsp\">?????????</a>\r\n");
      out.write("	");

		} else {	//?????????
	
      out.write("\r\n");
      out.write("	<a href=\"mypage.jsp\">");
      out.print(sname );
      out.write("</a>\r\n");
      out.write("	<a href=\"board1.jsp\">????????? ??????</a>\r\n");
      out.write("	<a href=\"memberList.jsp\">????????????</a>\r\n");
      out.write("	<a href=\"\">????????????</a>\r\n");
      out.write("	<a href=\"logout.jsp\">????????????</a>\r\n");
      out.write("	<span id=\"msg_a\"></span>\r\n");
      out.write("	");

		}
	
      out.write("\r\n");
      out.write("</p>\r\n");
      out.write("<script>\r\n");
      out.write("	//?????? ???????????? ?????? msg??? ?????? ???????????? ?????????\r\n");
      out.write("	var url = location.href;  //url???????????? ???????????? ????????? ????????? ??????\r\n");
      out.write("	var pos = url.indexOf(\"?msg=\");\r\n");
      out.write("	var msg = url.substr(pos+5); //???????????? ??????\r\n");
      out.write("	var msg_a = document.getElementById(\"msg_a\"); //?????? msg_a ????????? ?????? ??????\r\n");
      out.write("	//msg_a.innerHTML = decodeURI(msg);\r\n");
      out.write("	if(pos>0) {\r\n");
      out.write("		if(msg!=\"\"){\r\n");
      out.write("			msg_a.innerHTML = msg;\r\n");
      out.write("			alert(msg);\r\n");
      out.write("		}\r\n");
      out.write("	}\r\n");
      out.write("</script>");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("</header>\r\n");
      out.write("<div class=\"content\" class=\"panel-body\">\r\n");
      out.write("	<div class=\"container-fluid\">\r\n");
      out.write("		<h2>????????? ??? ????????????</h2>\r\n");
      out.write("		<table class=\"table\">\r\n");
      out.write("			<tbody>\r\n");
      out.write("\r\n");
      out.write("\r\n");

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	int cnt = 0;
	String sql = "";
	try {
		Class.forName("org.mariadb.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mariadb://localhost:3308/company", "root", "1234");
		

      out.write('\r');
      out.write('\n');

	sql = "select * from board where bno=?";
	pstmt = conn.prepareStatement(sql);
	pstmt.setInt(1, bno);
	rs = pstmt.executeQuery();
	if(rs.next()){

      out.write("\r\n");
      out.write("		<tr><th>?????????</th><td>");
      out.print(rs.getInt("bno") );
      out.write("</td></tr>\r\n");
      out.write("		<tr><th>??????</th><td>");
      out.print(rs.getString("btitle") );
      out.write("</td></tr>\r\n");
      out.write("		<tr><th>??????</th><td>");
      out.print(rs.getString("content") );
      out.write("</td></tr>\r\n");
      out.write("		<tr><th>?????????</th><td>");
      out.print(rs.getDate("regdate") );
      out.write("</td></tr>\r\n");
      out.write("		<tr><th>?????????</th><td>");
      out.print(rs.getString("writer") );
      out.write("</td></tr>\r\n");
      out.write("		<tr>\r\n");
      out.write("			<td colspan=\"2\">			\r\n");
      out.write("			");
 if(sid.equals("admin")) { 
      out.write("\r\n");
      out.write("				<a href=\"boardUpdate.jsp?bno=");
      out.print(bno );
      out.write("\" class=\"btn btn-primary\">??????</a>\r\n");
      out.write("				&nbsp;&nbsp;&nbsp;\r\n");
      out.write("				<a href=\"boardDeletePro.jsp?bno=");
      out.print(bno );
      out.write("\" class=\"btn btn-primary\">??????</a>\r\n");
      out.write("				&nbsp;&nbsp;&nbsp;\r\n");
      out.write("			");
 } 
      out.write("\r\n");
      out.write("				<a href=\"board1.jsp\" class=\"btn btn-primary\">??????</a>\r\n");
      out.write("			</td>\r\n");
      out.write("		</tr>\r\n");

	}

      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');

	} catch(Exception e) {
		e.printStackTrace();
	} finally {
		try {
			rs.close();
			pstmt.close();
			conn.close();
		} catch(Exception e){
			e.printStackTrace();		
		}
	}

      out.write("\r\n");
      out.write("			</tbody>\r\n");
      out.write("		</table>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("<footer id=\"ft\" class=\"panel-footer\">\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("<div class=\"ft_wrap\">\r\n");
      out.write("	<p class=\"copyright\">Copyrights</p>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("</footer>\r\n");
      out.write("</div>\r\n");
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
