<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="UTF-8">
<title>jstlEx04.jsp</title>
</head>
<body>
	<!-- 반목문 -->
	<h1>
		<c:forEach begin="1" end="10" step="1">하이</c:forEach>
	</h1>
	
	<h1>
		<c:forEach var="i" begin="1" end="10" step="2">${i }</c:forEach>
	</h1>
	
	<hr />
	
	<!-- 구구단 3단 출력해보세요 - 개행 -->
	<h1>
		<c:forEach var="i" begin="1" end="9" step="1">
			3 * ${i } = ${3*i } <br />
		</c:forEach>
	</h1>
	
	<hr />
	
	<!-- 반복문 중첩 가능 (table 형태로 row를 개행하여 출력해보기) -->
	<table>
		<c:forEach var="i" begin="1" end="9" step="1">
			<tr>
				<c:forEach var="j" begin="2" end="9" step="1">
					<td>${j} * ${i } = ${j*i } </td>
				</c:forEach>
			</tr>
		</c:forEach>
	</table>
	
	
</body>
</html>