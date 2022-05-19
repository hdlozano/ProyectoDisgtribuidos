package model;

import controller.Connecction;
import model.Pasaporte;

public class Compra {
	Connecction conexion;
	Pasaporte pasaporte1;
	Pasaporte pasaporte2;
	Pasaporte pasaporte3;
	
	public Compra() {
		
	}
	
	public void compraPas1() {
		int cons = 0;//realizar consulta a la bd para ver el consecutivo
		pasaporte1 = new Pasaporte("nino", cons, "montaña", "electronico", "chocones", "barco");
		conexion.GuardarVenta(pasaporte1);
	}
	
	public void compraPas2() {
		int cons = 0;//realizar consulta a la bd para ver el consecutivo
		pasaporte1 = new Pasaporte("joven", cons, "montaña", "karts", "chocones", "martillo");
	}
	
	public void compraPas3() {
		int cons = 0;//realizar consulta a la bd para ver el consecutivo
		pasaporte1 = new Pasaporte("familia", cons, "montaña", "troncos", "chocones", "pendulo");
	}
}
