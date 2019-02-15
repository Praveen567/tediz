package com.third;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ThirdController")
public class ThirdController extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String c = request.getParameter("C");
		out.println("third=============="+c+"<br>");
		
		HttpSession sess = request.getSession(false);//used existing session
		String a = (String)sess.getAttribute("first");
		
		String b = (String)sess.getAttribute("second");
		out.println("second=============="+b+"<br>");
		out.println("first=============="+a+"<br>");
		
		int a1 = Integer.parseInt(a);
		int b1 = Integer.parseInt(b);
		int c1 = Integer.parseInt(c);
		int d = a1+b1+c1;
		out.println("Added======="+d);
	}
}
