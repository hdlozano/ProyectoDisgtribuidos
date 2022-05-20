package model;

import java.sql.Date;

public class User {
    private int id;
    private String name;
    private String email;
    private String birtday;
    private String password;

    public User(){

    }

	public User(int id, String name, String email, String password, String birtday ) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.birtday = birtday;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirtday() {
		return birtday;
	}

	public void setBirtday(String birtday) {
		this.birtday = birtday;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
    
	public void registroBD() {
		
	}
    
}
