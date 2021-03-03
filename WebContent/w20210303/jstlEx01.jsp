<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstlEx01.jsp</title>
</head>
<body>
<!-- 
	+ JSTL(JSP Standard Tag Library)
	: jsp action tag는 커스텀이 가능 => 잘만들어진 tag를 모아놓은 tag libarary

	cf) jQuery: javascript 잘 되어있는 것을 모아놓은 library

	: 사용방법 – jQuery 호출하는 것처럼 jstl도 추가해서 사용하면 됨
-->
	
	<!-- c:set - 변수를 선언하고 그 변수에 초기값을 대입하는 기능의 action 
	
			   - scope로 객체 범위를 지정할 수 있음
			     (page, request, session, application)
	-->
	<c:set var="num1" value="200" scope="request"></c:set>
	<c:set var="num2" value="100" scope="request"></c:set>
	<jsp:forward page="jstlEx01Sub.jsp"></jsp:forward>
	
	
	
</body>
</html>