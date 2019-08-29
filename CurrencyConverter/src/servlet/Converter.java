package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Converter
 */
@WebServlet("/Converter")
public class Converter extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Converter() {
        super();
    }
    
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
	}
	
	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
	}
	
	//TODO: Can I set the page title with the servlet somehow?
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter writer = response.getWriter();
		
		writer.append("<h1>Calculator for you!</h1>\n" + 
				"<form action=\"Converter\" method=\"post\">\n" + 
				"<input type=\"radio\" name=\"operation\" value=\"add\">Add <br />\n" + 
				"<input type=\"radio\" name=\"operation\" value=\"multiply\">Multiply <br />\n" + 
				"<input type=\"text\" name=\"first_number\">\n" + 
				"<input type=\"text\" name=\"second_number\">\n" + 
				"<input type=\"submit\" value=\"Calculate the numbers!!\">\n" + 
				"</form>");
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		double firstNumber = Double.parseDouble(request.getParameter("first_number"));
		double secondNumber = Double.parseDouble(request.getParameter("second_number"));
		String operation = request.getParameter("operation");
		
		if(operation.equals("add")) {
			double result = firstNumber + secondNumber;
			writer.append("<h1>Added: " + result + "</h1>");
		}
		else if (operation.equals("multiply")) {
			double result = firstNumber * secondNumber;
			writer.append("<h1>Multiplied: " + result + "</h1>");
		}
		else {
			writer.append("What happened?");
		}
	}
}
