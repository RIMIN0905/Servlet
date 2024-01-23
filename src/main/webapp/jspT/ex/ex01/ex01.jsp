<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>일기장</title>
</head>
<body>


	<h2>일기장</h2>
	<%-- 날짜 시간 정보 --%>
	<%-- 정적방식 --%>
	<%@ include file="date.jsp" %>
	<%= // 정적방식은 변수를 쓸 수 있지만
	dateString %>
	
	
	<%-- 동적방식 --%>
	<% 
	// 동적방식은 변수를 쓸 수 없음
	// 그 안에 있는 자바 코드도 필요하다면 정적방식 사용
	// 일반적으로는 동적 방식으로 사용
	%>
	<jsp:include page="date.jsp"/> 
	<hr>


	<div>
		오늘 너무 추운 날이다. 너무 힘들었다. 그래도 오늘도 해냈다 고생했어!
	</div>

</body>
</html>