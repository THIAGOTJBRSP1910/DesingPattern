package br.com.designpatternprodutos.pojo;

public class Livro extends Produtos {
	 private int id;
	 private String autor;
	 private String titulo;
	 private String genero;
	 private int ano;
	 private String editora;
	 private double precoLivro;
	 private int idProduto;
	public Livro() {
	}
	public Livro(int id, String autor, String titulo, String genero, int ano, String editora, double precoLivro) {
		this.id = id;
		this.autor = autor;
		this.titulo = titulo;
		this.genero = genero;
		this.ano = ano;
		this.editora = editora;
		this.precoLivro = precoLivro;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public int getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
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
