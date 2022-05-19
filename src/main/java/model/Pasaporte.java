package model;

import java.util.ArrayList;

public class Pasaporte {
	private String namePasport;
	private int id_Pasport;
	private String games1;
	private String games2;
	private String games3;
	private String games4;
	
	public Pasaporte() {
		
	}

	public Pasaporte(String namePasport, int id_Pasport, String games1, String games2, String games3, String games4) {
		this.namePasport = namePasport;
		this.id_Pasport = id_Pasport;
		this.games1 = games1;
		this.games2 = games2;
		this.games3 = games3;
		this.games4 = games4;
	}

	public String getNamePasport() {
		return namePasport;
	}

	public void setNamePasport(String namePasport) {
		this.namePasport = namePasport;
	}

	public int getId_Pasport() {
		return id_Pasport;
	}

	public void setId_Pasport(int id_Pasport) {
		this.id_Pasport = id_Pasport;
	}

	public String getGames1() {
		return games1;
	}

	public void setGames1(String games1) {
		this.games1 = games1;
	}

	public String getGames2() {
		return games2;
	}

	public void setGames2(String games2) {
		this.games2 = games2;
	}

	public String getGames3() {
		return games3;
	}

	public void setGames3(String games3) {
		this.games3 = games3;
	}

	public String getGames4() {
		return games4;
	}

	public void setGames4(String games4) {
		this.games4 = games4;
	}
	
	
	
}
