<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>el.jsp</title>
</head>
<body>
<!-- 	
	EL (Expression Language)
	: JSP에서 저장 객체를 출력할 때 스크립틀릿(기술)을 전혀 쓰지 않을 수 있도록 하는 언어
	: 라이브러리를 추가만 해놓으면 따로 설정할 것은 없음, 그냥 사용
-->
	
	<!-- id 파라미터 값을 가져와서 출력 -->
	<%
		String id = request.getParameter("id");
		out.println("<h2>"+id+"</h2>");
		
	%>
	
	<!-- 위와 같은 el 코드 -->
	<h2>${param.id }</h2>
	
	
	
</body>
</html>