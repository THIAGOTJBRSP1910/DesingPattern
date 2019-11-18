package br.com.desingpattern.pojo;

public class Contato {
	
	private int id;
	private String celular;
	private String email;
	public Contato() {
	}
	public Contato(int id, String celular, String email) {
		this.id = id;
		this.celular = celular;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


}
