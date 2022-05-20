package model;

import controller.Conexion;
import controller.Control;
import controller.GestionDB;
import model.Pasaporte;

public class ComprarM {
	GestionDB db;
	Pasaporte pasaporte1;
	Pasaporte pasaporte2;
	Pasaporte pasaporte3;
	
	public CompraM() {
		
	}
	
	public void compraPas1(User user) {
		int cons = db.busquedaIdBrazalete();//realizar consulta a la bd para ver el consecutivo
		pasaporte1 = new Pasaporte("nino", cons, "montaña", "electronico", "chocones", "barco");
		
	}
	
	public void compraPas2(User user) {
		int cons = db.busquedaIdBrazalete();//realizar consulta a la bd para ver el consecutivo
		pasaporte2 = new Pasaporte("joven", cons, "montaña", "karts", "chocones", "martillo");
		db.registroventa(pasaporte2,user);
	}
	
	public void compraPas3(User user) {
		int cons = db.busquedaIdBrazalete();//realizar consulta a la bd para ver el consecutivo
		pasaporte3 = new Pasaporte("familia", cons, "montaña", "troncos", "chocones", "pendulo");
		db.registroventa(pasaporte3,user);;
	}
}
