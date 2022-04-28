<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>

<%
	String sid = (String) session.getAttribute("uid");

// 연결 객체, 상태 정보 객체 선언

// try~catch~ 안에 해당 드라이버 로딩, 연결 객체를 통한 연결, 상태 정보 활성화
// SQL 작성, SQL 실행, 상태 정보 객체 닫기, 연결 객체 닫기

	Connection conn = null;
	PreparedStatement pstmt = null;
	int cnt = 0;
		
	try {
		Class.forName("org.mariadb.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mariadb://localhost:3308/company","root","1234");
		String sql = "delete from member where id=?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, sid);
		cnt = pstmt.executeUpdate();
		if(cnt > 0) {
			// cnt가 0 이상이라면 회원탈퇴 성공
			// 세션에 있는 정보들을 싹 다 날려야함
			session.invalidate();
			response.sendRedirect("index.jsp");	
		} else {
			out.println("<p>회원탈퇴가 정상적으로 이루어지지 않았습니다.");
			response.sendRedirect("mypage.jsp");
		}
	} catch(Exception e) {
		e.printStackTrace();
	} finally {
		try {
			pstmt.close();
			conn.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
%>
