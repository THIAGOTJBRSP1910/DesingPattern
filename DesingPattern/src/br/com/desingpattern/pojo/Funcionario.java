package br.com.desingpattern.pojo;

import java.sql.Date;

public class Funcionario extends Fisica {
	
	private String cargo;
	private Date dataAdmissao;
	public Funcionario() {
	}
	public Funcionario(String cargo, Date dataAdmissao) {
		this.cargo = cargo;
		this.dataAdmissao = dataAdmissao;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Date getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
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
	

}
