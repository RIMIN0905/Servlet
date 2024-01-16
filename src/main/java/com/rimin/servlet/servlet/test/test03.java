package com.rimin.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test03")
public class test03 extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		Date now = new Date();
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/DD HH:mm:ss");
		
		String dateTimeString = formatter.format(now);
		
		out.println("<html><head><title>[단독] 고양이가 야옹해 </title></head>	<body>");
		out.println("<div>기사 입력 시간 : " + dateTimeString + "</div><hr><div>끝</div></body></html>");
		
		
	}

}
