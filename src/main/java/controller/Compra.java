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
		int quantityInem1= Integer.parseInt(request.getParameter("item1"));
		int quantityInem2 = Integer.parseInt(request.getParameter("item2"));
		int quantityInem3= Integer.parseInt(request.getParameter("item3"));
		
		if (quantityInem1>0) {
			control.calculateItem1(quantityInem1);
		}
		if (quantityInem2>0) {
			control.calculateItem2(quantityInem2);
		}
		if (quantityInem3>0) {
			control.calculateItem3(quantityInem3);
		}
		
		response.setContentType("text/html");

		ServletOutputStream out = response.getOutputStream();
		out.print("compra exitosa");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
				//ServletOutputStream out = response.getOutputStream();
		
		
		
	}

}
