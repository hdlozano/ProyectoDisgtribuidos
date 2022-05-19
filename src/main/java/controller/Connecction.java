package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Pasaporte;

public class Connecction {

	static PreparedStatement sentencia;
	static ResultSet resultado;

	static final String URL = "jdbc:mysql://localhost:3306/parques?useSSL=false";

	/*
	 * Metodo que permite establecer la conexion a la base de datos
	 * 
	 */
	public static Connection getConexion() {
		Connection conexion = null;
		try {
			// Class.forName("com.mysql.cj.jdbc.Driver");
			conexion = DriverManager.getConnection(URL, "root", "toor");
			System.out.println("Conexion a la base de datos exitosa");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conexion;
	}

	public void GuardarVenta(Pasaporte pasaporte1) {
		Connection conexion = getConexion();

		try {

			sentencia = conexion.prepareStatement("INSERT INTO pasaporte(nombre,contrasena) VALUE(?,?)");
			sentencia.setString(1, nombre);
			sentencia.setString(2, contrasena);
			sentencia.executeUpdate();

			System.out.println("Registros guardados");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
