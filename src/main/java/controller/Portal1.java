package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Portal1
 */
public class Portal1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Control control = new Control();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Portal1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String game = request.getParameter("Atracciones");
		int idpasaporte = Integer.parseInt(request.getParameter("idpasaporte"));
		int altura = Integer.parseInt(request.getParameter("altura"));
		int edad = Integer.parseInt(request.getParameter("edad"));
	
		response.setContentType("text/html");

		ServletOutputStream out = response.getOutputStream();
				
		if(game.equals("M")&&control.cosultarPasadas(idpasaporte, "passesG1")>=0) {
			if(altura >=150 && edad >=12 ) {
				control.actualizarPasaporte(game, idpasaporte);
			} else {
				out.print("No cumple con las condiciones para el ingreso");
			}	
		}else {
			out.print("No cumple con las condiciones para el ingreso");
		}
		
		if(game.equals("C")&&control.cosultarPasadas(idpasaporte, "passesG2")>=0) {
			if(altura >=0  && edad >= 7  ) {
				control.actualizarPasaporte(game, idpasaporte );
			} else {
				out.print("No cumple con las condiciones para el ingreso");
			}	
		}else {
			out.print("No cumple con las condiciones para el ingreso");
		}
		
		if(game.equals("T")&&control.cosultarPasadas(idpasaporte, "passesG3")>=0) {
			if(altura >=0  && edad >= 16  ) {
				control.actualizarPasaporte(game, idpasaporte );
			} else {
				out.print("No cumple con las condiciones para el ingreso");
			}	
		}else {
			out.print("No cumple con las condiciones para el ingreso");
		}
		
		if(game.equals("CT")&&control.cosultarPasadas(idpasaporte, "passesG4")>=0) {
			if(altura >=150  && edad >= 15  ) {
			} else {
				out.print("No cumple con las condiciones para el ingreso");
			}	
		}else {
			out.print("No cumple con las condiciones para el ingreso");
		}
		
			
		
		
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
