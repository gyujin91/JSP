/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.60
 * Generated at: 2022-04-28 16:08:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/ft.jsp", Long.valueOf(1651161515563L));
    _jspx_dependants.put("/nav.jsp", Long.valueOf(1651161525265L));
  }

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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>메인 페이지</title>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-latest.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css\">\r\n");
      out.write("<!-- 테마 -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css\">\r\n");
      out.write("<!-- 자바스크립트 -->\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write("#hd { width:100%; }\r\n");
      out.write("#hd .hd_wrap { }\r\n");
      out.write(".content { min-height:90vh; }\r\n");
      out.write(".logo { display:block; width:180px; padding-top:8px; }\r\n");
      out.write(".logo img { display:block; width:100%; }\r\n");
      out.write("#tnb a { padding-left:20px;	 }\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container-full\">\r\n");
      out.write("<header id=\"hd\" class=\"panel-heading navbar navbar-default\">\r\n");
      out.write("	<div class=\"hd_wrap container\">\r\n");
      out.write("		");
      out.write('\r');
      out.write('\n');
  /*
	스크립트릿(scriptlet)  */
	String[] dp1 = {"회사소개", "연구개발", "제품정보", "사회공헌", "화이자소식"};
	String[][] dp2 = {{"기업소개","연혁","핵심가치","윤리경영","비전및미션"},
			{"주요의약품","제품파이프라인","연도별활동","성과"},
			{},
			{"화이자사랑의장학금","환자지원활동","의학연구지원","지역사회기여"},
			{}};
	String[][] lnk = {{"sub1.jsp","sub2.jsp","sub3.jsp","sub4.jsp","sub5.jsp"},
			{"sub11.jsp","sub12.jsp","sub13.jsp","sub14.jsp"},
			{},
			{"sub31.jsp","sub32.jsp","sub33.jsp","sub34.jsp"},
			{}};

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<a class=\"logo navbar-header\" href=\"index.jsp\"><img src=\"./images/samsung_logo.svg\" alt=\"로고\"></a>\r\n");
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
		if(sid==null) {	//방문자
	
      out.write("\r\n");
      out.write("	<a href=\"login.jsp\">로그인</a>\r\n");
      out.write("	<a href=\"\">손님</a>\r\n");
      out.write("	<a href=\"agree.jsp\">회원가입</a>\r\n");
      out.write("	");

		} else if(!sid.equals("admin")){ //일반회원
	
      out.write("\r\n");
      out.write("	<a href=\"logout.jsp\">로그아웃</a>\r\n");
      out.write("	<a href=\"mypage.jsp\">");
      out.print(sname );
      out.write("</a>\r\n");
      out.write("	");

		} else {	//관리자
	
      out.write("\r\n");
      out.write("	<a href=\"mypage.jsp\">");
      out.print(sname );
      out.write("</a>\r\n");
      out.write("	<a href=\"board1.jsp\">게시판관리</a>\r\n");
      out.write("	<a href=\"memberList.jsp\">회원관리</a>\r\n");
      out.write("	<a href=\"\">상품관리</a>\r\n");
      out.write("	<a href=\"logout.jsp\">로그아웃</a>\r\n");
      out.write("	<span id=\"msg_a\"></span>\r\n");
      out.write("	");

		}
	
      out.write("\r\n");
      out.write("</p>\r\n");
      out.write("<script>\r\n");
      out.write("	//주소 입력줄로 받은 msg를 받아 출력하는 부분임\r\n");
      out.write("	var url = location.href;  //url입력줄의 메시지를 포함한 주소를 저장\r\n");
      out.write("	var pos = url.indexOf(\"?msg=\");\r\n");
      out.write("	var msg = url.substr(pos+5); //메시지만 추출\r\n");
      out.write("	var msg_a = document.getElementById(\"msg_a\"); //해당 msg_a 아이디 요소 선택\r\n");
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
      out.write("		<h2>여기는 콘텐츠 영역</h2>\r\n");
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
