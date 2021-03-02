<%@page import="bean.Goott_MemberBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sendObject.jsp</title>
</head>
<body>
<%-- 	<%
		Goott_MemberBean gmb = new Goott_MemberBean();
		gmb.setId("hong");
		gmb.setPw("1234");
		
		session.setAttribute("gmb", gmb);
		
		response.sendRedirect("el2.jsp");
	%> --%>
	
	<!-- JSP action tag -->
	<jsp:useBean id="vo" class="bean.Goott_MemberBean" scope="session"></jsp:useBean>
	<jsp:setProperty property="id" name="vo" value="hong"/>
	<jsp:setProperty property="pw" name="vo" value="1234"/>
	<jsp:forward page="el2.jsp"></jsp:forward>
	
	
	
</body>
</html>