package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.cj.jdbc.Driver;

public class Conexion2 {

	private Connection jdbcConection;
	private String jdbcURL;
	private String jdbcUser;
	private String jdbcPassword;
	
	public Conexion2(String jdbcURL, String jdbcUser, String jdbcPassword) {
		this.jdbcURL = jdbcURL;
		this.jdbcUser = jdbcUser;
		this.jdbcPassword = jdbcPassword;
	}
	
	public void conectar() throws SQLException {
		if (jdbcConection==null || jdbcConection.isClosed()) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		jdbcConection = DriverManager.getConnection(jdbcURL,jdbcUser,jdbcPassword);
	}
	
	public void desconectar() throws SQLException {
		if(jdbcConection!=null && !jdbcConection.isClosed()) {
			jdbcConection.close();
		}
	}
	
	public Connection getConexion2() {
		return jdbcConection;
	}
}
