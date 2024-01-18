<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>날짜 시간 정보</title>
</head>
<body>
	

	<%
		Date now = new Date();
		
		SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy년 M월 d일");
		SimpleDateFormat timeFormatter = new SimpleDateFormat("HH시 mm분 ss초");
		
		String dateString = "오늘 날짜  " + dateFormatter.format(now);
		String timeString = "현재 시간  " + timeFormatter.format(now);
	
		// what이라는 parameter로 입력받아서
		// "date" 라면 날짜 보여주기
		// "time" 라면 시간 보여주기
		String what = request.getParameter("what");
	
		String resultString = null;
		
		
		
		if(what.equals("date")){
			resultString = dateString;
		}
		else if(what.equals("time")){
			resultString = timeString;
		}
	%>
	
	
	<div>
	<h1><%= resultString %></h1>
	
	</div>



	

</body>
</html>