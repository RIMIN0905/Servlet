package com.rimin.servlet.servlet.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet ("/servlet/ex05")
public class Ex05Controller extends HttpServlet{

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//request.setCharacterEncoding("utf-8");
		//response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		// 이름과 생년월일 전달받고 이름과 나이를 html 로 response에 담는다.
		PrintWriter out = response.getWriter();
		
		// 이름과 생년월일 전달 받고
		// 이름과 나이를 보여주는 페이지
		String name = request.getParameter("name");
		String birthday = request.getParameter("birthday"); // 20040812
		
		String yearString = birthday.substring(0 , 4);
		int year = Integer.parseInt(yearString);
		
		//한국 나이로 계산
		int age = 2024 - year + 1;
		
		out.println("<html><head><title>이름 나이</title></head><body>");
		out.println("<h2>이름 :  " + name + "</h2>");
		out.println("<h2>나이 :  " + age + "</h2>");
		out.println("</body></html>");
		
		
		
	}
	
}
