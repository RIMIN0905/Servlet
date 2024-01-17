package com.rimin.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet ("/servlet/test10")
public class Test10Controller extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
	response.setContentType("text/html");
		
		PrintWriter out = response.getWriter(); 
		
		
		final Map<String, String> userMap =  new HashMap<String, String>() {
		    {
		        put("id", "hagulu");
		        put("password", "asdf");
		        put("name", "김인규");
		    }
		};
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		out.println("<html><head><title>사용자 정보 확인</title></head><body>");
		
		if(!(userMap.get("id").equals(id))) {
			out.println("<div>id가 일치하지 않습니다.</div>");
		}
		else if(!(userMap.get("password").equals(password))) {
			out.println("<div>password가 일치하지 않습니다.</div>");
		}
		else {
			out.println("<div>"+ userMap.get("name") + "님 환영 합니다.</div>");
		}
		
	}
	
}
