package controller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Compra;
import model.User;
public class Control {
	final String URL = "jdbc:mysql://Localhost:3306/proyecto?useSSL=false";
	PreparedStatement sentencia;
	ResultSet resultado;
	Compra compra = new Compra();
	//Conexion2 conexion;
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
		Conexion2 conexion = new Conexion2(URL, "root", "toor");
		try {
			conexion.conectar();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(conexion.getConexion2());
		
		//conexion.getConexion();
		
		//conexion.registrarDatos(name, password);
		//SaveUser(user);
	}
	/*
	public void SaveUser(User user) {
		conexion = new Connecction();
		conexion.Connecction();
		conexion.getConnecction();
		try {

			sentencia = conexion.prepareStatement("INSERT INTO user(id,name_user,email,password,birthday) VALUE(?,?,?;?;?)");
			sentencia.setLong(1, user.getId());
			sentencia.setString(2, user.getName());
			sentencia.setString(3, user.getEmail());
			sentencia.setString(4, user.getPassword());
			sentencia.setString(5, user.getBirtday());
			sentencia.executeUpdate();
			((Connection) conexion).close();
			System.out.println("Registros guardados");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}*/
}
