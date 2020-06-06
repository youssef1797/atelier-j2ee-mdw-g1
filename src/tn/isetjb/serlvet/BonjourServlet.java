package tn.isetjb.serlvet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BonjourServlet
 */
@WebServlet("/BonjourServlet")
public class BonjourServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BonjourServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    int compteur=0;
	protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"utf-8\" />");
        out.println("<title>Bonjour Iset</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<p>Bonjour Iset Djerba!</p>");
        out.println("<p>Cette Servlet a été accédée " + compteur + " fois </p>");
        out.println("</body>");
        out.println("</html>");
        compteur++;
        
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
