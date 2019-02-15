package com.second;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SecondController")
public class SecondController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			String b = request.getParameter("B");
			out.println("second=============="+b+"<br>");
			
			HttpSession sess = request.getSession(false);//used existing session
			sess.setAttribute("second", b);
			
			out.println("<form method='get' action='third'>");
			out.println("C :<input type='text' name = 'C'>");
			out.println("<input type='submit' value='Third'>");
			out.println("</form>");
	}
}
