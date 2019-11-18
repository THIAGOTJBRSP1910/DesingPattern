package br.com.desingpattern.pojo;

public class Juridica extends Pessoa {
	
	private String cnpj;
	private String razaoSocial;
	public Juridica() {
	}
	public Juridica(String cnpj, String razaoSocial) {
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	
	public void setId(int id) {
		
		this.id = id;
	}
		public int getId() {
			return this.id;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getNome() {
			return this.nome;
		}
		
		public void setEndereco(Endereco endereco) {
			this.endereco = endereco;
		}
		public Endereco getEndereco() {
			return this.endereco;
			
		}
		public void setContato(Contato contato) {
			this.contato = contato;
		}
		public Contato getContato() {
			return this.contato;
			
		
	}

}
