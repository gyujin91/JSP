<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%  /*
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
%>
<%-- <%=표현식(expression) %> --%>
<a class="logo" href="index.jsp"><img src="976a64bd51fc52a73f056cf2a40bab97.png" alt="로고"></a>
<nav id="gnb">
<ul>
<%
	for(int i=0;i<dp1.length;i++) {
%>
	<li>
		<span class="dp1"><%=dp1[i] %></span>
		<ul class="sub">
<%
		for(int j=0;j<dp2[i].length;j++) {
%>
			<li><a class="dp2" href="<%=lnk[i][j] %>"><%=dp2[i][j] %></a></li>
<%
		}
%>
		</ul>
	</li>
<%
	}
%>
</ul>
</nav>
<p id="tnb">
	<%  
		String sid = (String) session.getAttribute("uid");
		String sname = (String) session.getAttribute("name");
		if(sid==null) {
	%>
	<a href="login.jsp">로그인</a>
	<a href="agree.jsp">회원가입</a>
	<%
		} else {
	%>
	<a href="logout.jsp">로그아웃</a>
	<a href="mypage.jsp"><%=sname %></a>
	<a href="">회원탈퇴</a>
	<%
		}
	%>
	<a href="">상단2</a>
	<a href="memberList.jsp">회원목록</a>
	<a href="">상단3</a>
	<span id="msg_a"></span>
</p>
<script>
	//주소 입력줄로 받은 msg를 받아 출력하는 부분임
	var url = location.href;  //url입력줄의 메시지를 포함한 주소를 저장
	var pos = url.indexOf("?msg=");
	var msg = url.substr(pos+5); //메시지만 추출
	var msg_a = document.getElementById("msg_a"); //해당 msg_a 아이디 요소 선택
	msg_a.innerHTML = msg;
	//msg_a.innerHTML = decodeURI(msg);
	if(pos>0) {
		if(msg!=""){
			alert(msg);
		}
	}
</script>
