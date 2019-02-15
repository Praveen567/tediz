package com.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/FirstController")
public class FirstController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			String a = request.getParameter("A");
			out.println("first============="+a+"<br>");
			
			HttpSession sess = request.getSession();//session object created.
			sess.setAttribute("first", a);
			
			out.println("<form method='get' action='second'>");
			out.println("B :<input type='text' name = 'B'>");
			out.println("<input type='submit' value='Second'>");
			out.println("</form>");
	}

}
