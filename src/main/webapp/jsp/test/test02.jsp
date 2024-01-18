<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BMI 계산</title>
</head>
<body>

	<%
		int height = Integer.parseInt(request.getParameter("height"));	
		int weight = Integer.parseInt(request.getParameter("weight"));	
	
		double BMI = weight/((height/100.0)*(height/100.0));
		
		String bmiResult = null;
		
		if(BMI < 18.5){
			bmiResult = "저체중";
		}
		else if(BMI < 25){
			bmiResult = "정상";
		}
		else if(BMI < 30){
			bmiResult = "과체중";
		}
		else{
			bmiResult = "비만";
		}
		
		
	%>
	
	
	<h2>BMI 측정 결과</h2>
	<h1>당신은 <%= bmiResult %>입니다.</h1>
	<h5>BMI 수치 : <%= BMI %></h5>
	




</body>
</html>