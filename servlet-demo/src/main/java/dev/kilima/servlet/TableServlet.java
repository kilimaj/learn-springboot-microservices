package dev.kilima.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/table")
public class TableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String input = request.getParameter("num");
		
		if(input==null) {
			response.sendRedirect("table.html");
			return;
		}	

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		RequestDispatcher rd = request.getRequestDispatcher("table.html");
		rd.include(request, response);
		
		try {
			int num = Integer.parseInt(input);
			out.println("<h3>Table for " + num + ": </h3>");
			for (int i = 1; i <= 10; i++) {
				out.printf("%d X %d = %d <br>", num, i, num * i);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			out.println("<h3>Invalid input. Only intergers allowed!</h3>");
			e.printStackTrace();
		}
		out.close();
	}

}
