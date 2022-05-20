package controller;

import jakarta.servlet.RequestDispatcher;
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
		
		//request.setAttribute("name", request.getParameter("name"));
		request.setAttribute("id", request.getParameter("id"));
		
		request.getSession().setAttribute("id_session", request.getParameter("id"));
		
		RequestDispatcher rd;
		rd = request.getRequestDispatcher("./Comprar.jsp");
		rd.forward(request, response);
		
		/*response.setContentType("text/html");
		ServletOutputStream out = response.getOutputStream();
		out.print("registro exitoso");*/

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
