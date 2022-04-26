<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%@ 디렉티브 %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 폼</title>
<link rel="stylesheet" href="reset.css">
<link rel="stylesheet" href="common.css">
</head>
<body>
<div class="wrap">
<header id="hd" class="panel-heading">
	<div class="hd_wrap">
		<%@ include file="nav.jsp" %>
	</div>
</header>
<div class="content" class="panel-body">
	<h2>회원가입</h2>
	<form action="joinPro.jsp" method="post">
		<div>
			<label for="id">아이디</label>
			<span>
				<input type="text" id="id" maxlength="20">
			</span>
		</div>
		<div>
			<lable for="pw">비밀번호</lable>
			<span>
				<input type="password" id="pw" maxlength="20">
			</span>
		</div>
		<div>
			<label for="pw">비밀번화 확인</label>
			<span>
				<input type="password" id="pw" maxlength="20">
			</span>
		</div>
		<div>
			<label for="name">이름</label>
			<span>
				<input type="text" id="name">
			</span>
		</div>
		<div>
			<label for="phone">전화번호</label>
			<span>
				<input type="tel" id="phone">
			</span>
		</div>
		<div>
			<label>생년월일</label>
			<div class="bir_yy">
				<span>
					<input type="text" id="yy" maxlength="4" placeholder="년(4자)">
				</span>
			</div>
			<div class="bir_mm">
				<span>
					<select id="mm">
						<option>월</option>
						<option value="01">1</option>
						<option value="02">2</option>
						<option value="03">3</option>
						<option value="04">4</option>
						<option value="05">5</option>
						<option value="06">6</option>
						<option value="07">7</option>
						<option value="08">8</option>
						<option value="09">9</option>
						<option value="10">10</option>
						<option value="11">11</option>
						<option value="12">12</option>
					</select>
				</span>
			</div>
			<div id="bit_dd">
				<span>
					<input type="text" id="dd" maxlength="2" placeholder="일">
				</span>
			</div>
		</div>
		<div>
			<label for="address">주소</label>
			<span>
				<input type="text" id="address">
			</span>
		</div>
		<div>
			<button type="button">
				<span>가입하기</span>
			</button>
		</div>
		<div>
			<button type="button">
				<span>취소</span>
			</button>
		</div>
		
	</form>
</div>
<footer id="ft" class="panel-footer">
	<%@ include file="ft.jsp" %>
</footer>
</div>
</body>
</html>