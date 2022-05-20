package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Compra
 */
public class Compra extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private Control control = new Control();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Compra() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		int quantityInem1= Integer.parseInt(request.getParameter("item1"));
		int quantityInem2 = Integer.parseInt(request.getParameter("item2"));
		int quantityInem3= Integer.parseInt(request.getParameter("item3"));
		
		if (quantityInem1>0) {
			control.calculateItem1(quantityInem1);
		}
		
		response.setContentType("text/html");
		ServletOutputStream out = response.getOutputStream();
		
		
		
	}

}
