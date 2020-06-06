package tn.isetjb.serlvet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ForwardServlet
 */
@WebServlet("/Forward")
public class ForwardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ForwardServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	      response.setContentType("text/html");
	      PrintWriter out=response.getWriter();	
	      out.println("<!DOCTYPE html>");
	      out.println("<html>");
	      out.println("<head>");
	      out.println("<meta charset=\"utf-8\" />");
	      out.println("<title>foward</title>");
	      out.println("</head>");
	      out.println("<body>");
	      out.println("<p> Bienvenu dans Forward! </p>");
	      
	      out.println("</body>");
	      out.println("</html>");
	      		
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
