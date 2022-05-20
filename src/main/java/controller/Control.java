package controller;
import model.Compra;
import model.User;
public class Control {
	Compra compra = new Compra();
	Connecction conexion = new Connecction();
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
		conexion.SaveUser(user);
	}
	
	
}
