package br.com.designpatternprodutos.dao;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import br.com.designpatternprodutos.dao.ICrud;
import br.com.designpatternprodutos.pojo.Livro;
import br.com.designpatternprodutos.pojo.Escritorio;


public class DAOLivro extends Conexao implements ICrud<Livro> {

	@Override
	public boolean cadastro(Livro obj) {
		boolean retorno =true;
		try {
		conectar();
		String sqlProd="insert into Produto(nome, Preco) values(?,?)";
			PreparedStatement pstProd= con.prepareStatement(sqlProd,Statement.RETURN_GENERATED_KEYS);
			pstProd.setString(1, obj.getNome());
			pstProd.setDouble(2, obj.getPreco());
		
		//para pegar o id gerado no cadastro do endereco, iremos
		//usar o comando Statment.ReturnGeneredId
			int idProd=pstProd.executeUpdate();
			
			obj.setIdProduto(idProd);
		
		String sqlLvr ="insert into Livro(autor,genero,ano,editora,idProduto) values(?,?,?,?,?)";
		pst =con.prepareStatement(sqlLvr);
		pst.setString(1, obj.getAutor());
		pst.setString(2, obj.getGenero());
		pst.setInt(3, obj.getAno());
		pst.setString(4, obj.getEditora());
		pst.setInt(5, obj.getIdProduto());
		
		int x = pst.executeUpdate();
		if(x < 1)
			retorno = false;
		}
		
	
	
	catch(Exception ex) {
		ex.printStackTrace();
		retorno =false;
	}
	
	finally {
		try {con.close();}
		catch(Exception e) {e.printStackTrace();}
	}
	return retorno;
	}

	@Override
	public List<Livro> buscar() {
		List<Livro> lst = new ArrayList<Livro>();
		try {
			conectar();
			String sqlStr ="Select * from Livro order by id desc";
			pst = con.prepareStatement(sqlStr);
			rs = pst.executeQuery();
			while(rs.next()) {
				Livro cli = new Livro();
				cli.setId(rs.getInt(1));
				cli.setAutor(rs.getString(2));
				cli.setGenero(rs.getString(3));
				cli.setAno(rs.getInt(4));
				cli.setEditora(rs.getString(5));
				cli.setIdProduto(rs.getInt(6));

				lst.add(cli);
				
				
			}//while
		}//try
		catch(Exception ex){
			ex.printStackTrace();
			
		}//catch
		finally {
			try {con.close();}catch(Exception e) {e.printStackTrace();}
		}//finally
		
		return lst;
	}

	@Override
	public Livro buscar(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
	
