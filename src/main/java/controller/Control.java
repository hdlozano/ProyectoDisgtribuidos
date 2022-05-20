package controller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Compra;
import model.User;
public class Control {
	final String URL = "jdbc:mysql://Localhost:3306/proyecto?useSSL=false&useTimezone=true&serverTimezone=UTC";
	PreparedStatement sentencia;
	ResultSet resultado;
	Compra compra = new Compra();
	Conexion conexion;
	Connection con;
	public Control() {
		
	}

	public void calculateItem1(int quantityInem1) {
		while (quantityInem1!=0) {
			compra.compraPas1();
			quantityInem1--;

		}
			
		
		
	}

	public void records(int id, String name, String email, String password, String birtday) {
		// TODO Auto-generated method stub
		User user = new User(id, name, email, password, birtday);
		conexion = new Conexion(URL, "root", "toor");
		try {
			conexion.conectar();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		con = conexion.getConexion();
		System.out.println(conexion.getConexion());
		SaveUser(user);
	}
	
	public void SaveUser(User user) {
		try {

			sentencia = con.prepareStatement("INSERT INTO usuario(id,name_user,email,password,birthday) VALUE(?,?,?,?,?)");
			sentencia.setLong(1, user.getId());
			sentencia.setString(2, user.getName());
			sentencia.setString(3, user.getEmail());
			sentencia.setString(4, user.getPassword());
			sentencia.setString(5, user.getBirtday());
			sentencia.executeUpdate();
			conexion.desconectar();
			System.out.println("Registros guardados");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
