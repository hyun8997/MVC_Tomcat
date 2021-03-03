<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstlEx01Sub.jsp</title>
</head>
<body>
	<h2>jstlEx01Sub.jsp</h2>
	
	jstlEx01.jsp에서 넘어온 데이터(변수)값을 받아서 연산하여(사칙연산) 출력해보세요
	
	<h2>두 값의 합 : ${requestScope.num1 + requestScope.num2 }</h2>
	<h2>두 값의 차 : ${requestScope.num1 - requestScope.num2 }</h2>
	<h2>두 값의 곱 : ${requestScope.num1 * requestScope.num2 }</h2>
	<h2>두 값의 몫 : ${requestScope.num1 / requestScope.num2 }</h2>
	
	
</body>
</html>