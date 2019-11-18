package br.com.desingpattern.pojo;

public class Cliente extends Fisica {
	
	
	private String cartaoCredito;
	private String status;
	public Cliente() {
	}
	public Cliente(String cartaoCredito, String status) {
		this.cartaoCredito = cartaoCredito;
		this.status = status;
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
		
		public void setCPF(String cpf) {
			this.cpf = cpf;
		}
		public String getCpf() {
			return this.cpf;
			
		
	}
		
		
		public void setRg(String rg) {
			this.rg = rg;
		}
		public String getRg() {
			return this.rg;
			
		
	}
		
	public String getCartaoCredito() {
		return cartaoCredito;
	}
	public void setCartaoCredito(String cartaoCredito) {
		this.cartaoCredito = cartaoCredito;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
