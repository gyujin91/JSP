<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>

<%
	request.setCharacterEncoding("UTF-8");
	String uid = request.getParameter("id");
	String upw = request.getParameter("pw");
	String name = request.getParameter("name");
	String phone = request.getParameter("phone");
	String address = request.getParameter("address");
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	try {
		Class.forName("org.mariadb.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mariadb://localhost:3308/company","root","1234");
		String sql = "insert into member values(name=?, id=?, pw=?, phone=?, address=?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(0, name);
		pstmt.setString(1, uid);
		pstmt.setString(2, upw);
		pstmt.setString(3, phone);
		pstmt.setString(4, address);
		rs = pstmt.executeQuery();
		
	} catch(Exception e) {
		e.printStackTrace();
	} finally {
		try {
			rs.close();
			pstmt.close();
			conn.close();
			} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
%>

