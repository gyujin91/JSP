<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<!-- 테마 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<!-- 자바스크립트 -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
</head>
<body>
<div class="wrap">
<header id="hd" class="panel-heading">
	<div class="hd_wrap">
		<%@ include file="nav.jsp" %>
	</div>
</header>
<div class="content" class="panel-body">
	<h2>회원목록</h2>
	<table class="table">
		<tr>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이름</th>
			<th>연락처</th>
			<th>주소</th>
		</tr>
		
		<!--  드라이버 로딩, 연결, ON, SQL명령, SQL실행 -->
		
<%
	Connection conn = null; // 연결자
	PreparedStatement pstmt = null; // ON,OFF 스위치
	ResultSet rs = null; // DB결과를 저장할 곳
	
	try {
		Class.forName("org.mariadb.jdbc.Driver"); // 드라이버 로딩
		conn = DriverManager.getConnection("jdbc:mariadb://localhost:3308/company", "root", "1234");//연결
		pstmt = conn.prepareStatement("select * from member");	// ON
		//String으로 저장한 명령을 실행 - select문
		// SQL 구문이 update, delete, insert일때는 executeupdate를 쓴다.
		// executeupdate 일때는 rs에 저장하는게 아니기 때문에 try catch구문에서 close하지 않는다.
		rs = pstmt.executeQuery(); // SQL실행 - executeQuery란 select문을 의미
		while(rs.next()) {	// 지정된 rs(레코드셋=리썰트셋)를 한 레코드씩 출력
%>
		<tr>
			<td><%=rs.getString("id") %></td>
			<td><%=rs.getString("pw") %></td>
			<td><%=rs.getString("name") %></td>
			<td><%=rs.getString("phone") %></td>
			<td><%=rs.getString("address") %></td>
		</tr>
<% 
		}
	} catch(Exception e) {
		System.out.println("SQL구문이 올바르게 처리되지 못했습니다.");
		e.printStackTrace();
	} finally {
		try {
			
		} catch(Exception e) {
			// 닫는건 거꾸로
			rs.close();
			pstmt.close();
			conn.close();
		} finally {
			
		}
	}
%>
		
		
</table>
</div>
<footer id="ft" class="panel-footer">
	<%@ include file="ft.jsp" %>
</footer>
</div>
</body>
</html>