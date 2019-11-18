package br.com.designpatternprodutos.pojo;

public class Escritorio extends Produtos {
	 private int id;
	 private String marcaProduto;
	 private int idProduto;
	public Escritorio() {
	}
	public Escritorio(int id, String marcaProduto) {
		this.id = id;
		this.marcaProduto = marcaProduto;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	public String getMarcaProduto() {
		return marcaProduto;
	}
	public void setMarcaProduto(String marcaProduto) {
		this.marcaProduto = marcaProduto;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
		
	public void setPreco(double preco) {
		this.preco = preco;
	}
		
	public double getPreco() {
		return this.preco;
	
}
}
