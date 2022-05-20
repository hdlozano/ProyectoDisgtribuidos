package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;

/**
 * Servlet implementation class RegistroClass
 */
public class RegistroClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Control control = new Control();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistroClass() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		int id = Integer.parseInt(request.getParameter("id"));
	    String email = request.getParameter("email");
	    String birthday = request.getParameter("birthday");
	    String password = request.getParameter("password");
		
		System.out.println(id+" " +name + " "+email+" "+password+" "+birthday);
		
		control.records(id,name,email,password,birthday);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String name = request.getParameter("name");
		int id = Integer.parseInt(request.getParameter("id"));
	    String email = request.getParameter("email");
	    String birtday = request.getParameter("birtday");
	    String password = request.getParameter("password");
		
		
		
		control.records(id,name,email,password,birtday);
		response.setContentType("text/html");
		ServletOutputStream out = response.getOutputStream();
		out.print("registro exitoso");
	}

}
