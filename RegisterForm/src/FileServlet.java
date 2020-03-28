

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FileServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String name=request.getParameter("uname");
		String age=request.getParameter("age");
		String gender =request.getParameter("gender");
		String[] language=request.getParameterValues("lang");
		out.println("Name="+name);
		out.println("Age="+age);
		out.println("Gender="+gender);
		for(String lang:language) {
			out.println("lamguage="+lang);
		}
		
	}

		
		
		
	}



