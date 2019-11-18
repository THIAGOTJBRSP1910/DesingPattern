package br.com.desingpatternproduto.pojo;

public class Livro extends Produto {
	
	private String autor;
	private String resumo;
	private String sumario;
	private String isbn;
	
	public Livro() {
		
	}

	public Livro(String autor, String resumo, String sumario, String isbn) {
		
		this.autor = autor;
		this.resumo = resumo;
		this.sumario = sumario;
		this.isbn = isbn;
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

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public String getSumario() {
		return sumario;
	}

	public void setSumario(String sumario) {
		this.sumario = sumario;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	
	

}
