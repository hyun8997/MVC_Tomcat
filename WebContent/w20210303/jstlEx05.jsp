<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstlEx05.jsp</title>
</head>
<body>
	<!-- 배열값 출력 -->
	<h1>
		<c:set var="arr" value="<%=new int[]{1,2,3,4,5} %>"></c:set>
		<c:forEach var="k" items="${arr}">
			${k }
		</c:forEach>
	</h1>
	
	<%-- 
	JCF 사용
	앞으로 많이 볼 코드
	<c:forEach var="vo" items="list">${vo.name }</c:forEach>
	--%>
	
	<!-- JCF : Map -->
	<%
		HashMap hm = new HashMap();		/* key:value로 묶여있는 데이터 */
		hm.put("실", "바늘");
		hm.put("오성", "한음");
	%>
	<h1>
		<c:set var="m" value="<%=hm %>"></c:set>
		<c:forEach var="m1" items="${m }">
			${m1.key } : ${m1.value } <br />
		</c:forEach>
	</h1>
	
	<!-- 문자열 출력 -->
	<h1>
		<c:forTokens var="m2" items="13, 2, 3, 4, 5" delims="," varStatus="num">	
			<!-- delims로 문자열 자름, 필요한 데이터 추출 -->
			${num.count } - 데이터 : ${m2 } <br />
			
		</c:forTokens>
	</h1>
	
	
	
	
</body>
</html>