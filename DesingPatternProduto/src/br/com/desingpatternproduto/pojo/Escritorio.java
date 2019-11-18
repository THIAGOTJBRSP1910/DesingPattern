package br.com.desingpatternproduto.pojo;

public class Escritorio extends Produto {
	
	private String categoria;
	
	public Escritorio() {
	}

	public Escritorio(String categoria) {
		
		this.categoria = categoria;
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
		
		public void setPreco(Double preco) {
			this.preco = preco;
		}
		 public Double getPreco() {
			 return this.preco;
		 }

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	

}
