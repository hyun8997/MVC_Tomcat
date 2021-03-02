<%@page import="bean.Goott_MemberBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>el2.jsp</title>
</head>
<body>
<%-- 	<%
		Object obj = session.getAttribute("gmb");
	
		if(obj!=null){
			Goott_MemberBean gmb = (Goott_MemberBean)obj;
			out.println(gmb.getId());
		}
	%>  --%>
	
	<!-- 위 스크립틀릿과 같은 결과를 얻어낼 EL방식 -->
	<h2>ID : ${vo.id }</h2>
	<h2>PW : ${vo.pw }</h2>
	
<!-- 	
	scope를 찾아오는 순서가 있다. ==> 없이 보내면 순서대로 가져온다는 것
	: page, request, session, application 순
 -->	
 	<!-- 빨리 정확하게 찾아오고 싶을 때는 : ~~Scope  -->
 	<h2>ID : ${sessionScope.vo.id }</h2>
	<h2>PW : ${sessionScope.vo.pw }</h2>
	
</body>
</html>