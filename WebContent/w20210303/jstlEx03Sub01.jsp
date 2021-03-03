<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstlEx03Sub01.jsp</title>
</head>
<body>
	
	<h1>
		<c:if test="${sessionScope.visitor == 0 }">처음 뵙겠습니다</c:if>
		<c:if test="${sessionScope.visitor == 1 }">어서 오세요</c:if>
		<c:if test="${sessionScope.visitor >= 2 }">자주 뵙네요</c:if>
	</h1>
	
</body>
</html>