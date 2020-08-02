package com.sr.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/reg")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("img/jpeg");
		PrintWriter out = response.getWriter();
		
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String uemail = request.getParameter("uemail");
		String umobile = request.getParameter("umobile");
		
		out.println("<html><body>");
		out.println("<h2 style=\"color: red;\" align=\"center\">Durga Software Solution</h2>\n" + 
				"<h3 style=\"color: blue;\" align=\"center\">Registration Success</h3>\n" + 
				"");
		out.println("<table border='1' align='center'>");
		out.println("<tr><td>Firstname</td><td>" + fname + "</td></tr>");
		out.println("<tr><td>Lastname</td><td>" + lname + "</td></tr>");
		out.println("<tr><td>Email</td><td>" + uemail + "</td></tr>");
		out.println("<tr><td>Mobile</td><td>" + umobile + "</td></tr>");
		out.println("</table>");
		out.println("<h3 align='center'><a href='registrationform.html'>create new account</a></h3>");
		out.println("</body></html>");
	}

}
