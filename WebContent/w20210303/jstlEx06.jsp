<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstlEx06.jsp</title>
</head>
<body>
	<%
		int num1 = 100, num2 = 0;
	%>
	
	<!-- exception 처리 -->
	<c:catch var="e">	<!-- catch로 잡고 잡혔을때 조건문으로 처리 -->
	<%
		int result = num1/num2;   /* 0으로 나눠서 오류남 */
	%>
	<h2>나눗셈의 결과는 <%=result %></h2>
	</c:catch>
	
	<c:if test="${e != null }">
		<!-- 에러가 발생하면 - 대체 페이지로 이동 -->
		<h2>에러 메세지: ${e.message }</h2>
		<h2>에러 메세지: <c:out value="${e.message }"></c:out></h2>
	</c:if>
	
	<!-- 페이지 이동 -->
	<%-- 
	<c:redirect url="https://search.naver.com/search.naver">	
		<!-- 네이버 검색을 위해서는 뒤에 query= 를 채워서 줘야 함 -->
		<c:param name="query" value="3월 제철 음식"></c:param>
		
	</c:redirect>
	--%>
	 
	
	
	
	
	
</body>
</html>