package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Pasaporte;
import model.User;

public class Connecction {

	static PreparedStatement sentencia;
	static ResultSet resultado;

	static final String URL = "jdbc:mysql://localhost:3306/proyecto?useSSL=false";

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

	public void GuardarVenta(Pasaporte pasaporte) {
		Connection conexion = getConexion();
		
		try {

			sentencia = conexion.prepareStatement("INSERT INTO pasaporte(id_pasport,name_pasport,game1,game2,game3,game4) VALUE(?,?,?;?;?;?)");
			sentencia.setLong(1, pasaporte.getId_Pasport());
			sentencia.setString(2, pasaporte.getNamePasport());
			sentencia.setString(3, pasaporte.getGames1());
			sentencia.setString(4, pasaporte.getGames2());
			sentencia.setString(5,pasaporte.getGames3());
			sentencia.setString(5,pasaporte.getGames4());
			sentencia.executeUpdate();

			System.out.println("Registros guardados");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void SaveUser(User user) {
		Connection conexion = getConexion();
		try {

			sentencia = conexion.prepareStatement("INSERT INTO user(id,name_user,email,password,birthday) VALUE(?,?,?;?;?)");
			sentencia.setLong(1, user.getId());
			sentencia.setString(2, user.getName());
			sentencia.setString(3, user.getEmail());
			sentencia.setString(4, user.getPassword());
			sentencia.setString(5, user.getBirtday());
			sentencia.executeUpdate();
			conexion.close();
			System.out.println("Registros guardados");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
