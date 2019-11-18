package br.com.desingpatternproduto.dao;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import br.com.desingpatternproduto.pojo.Livro;

public class DAOLivro extends Conexao implements ICrud<Livro>{

	@Override
	public boolean cadastro(Livro obj) {
		// TODO Auto-generated method stub
		
		boolean retorno = true;
		
		try {
			conectar();
		String sqlPro = "insert into Produto(nome,preco)values(?,?)";
		PreparedStatement pstPro = con.prepareStatement(sqlPro,Statement.RETURN_GENERATED_KEYS);
		
		pstPro.setString(1, obj.getNome());
		pstPro.setDouble(2, obj.getPreco());
		
		int idPro = pstPro.executeUpdate();
			
			
		String sqlLiv = "insert into livro(autor, resumo, sumario, isbn,id)values(?,?,?,?,?)";
		PreparedStatement pstLiv = con.prepareStatement(sqlLiv,Statement.RETURN_GENERATED_KEYS);
		
		pstLiv.setString(1, obj.getAutor());
		pstLiv.setString(2, obj.getResumo());
		pstLiv.setString(3, obj.getSumario());
		pstLiv.setString(4, obj.getIsbn());
		pstLiv.setInt(5, obj.getId());
		
		int idLiv = pstLiv.executeUpdate();
		if (idLiv < 1)
			retorno = false;
		} catch (Exception ex) {
			ex.printStackTrace();
			retorno = false;
		} finally {
			try {
				con.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return retorno;
	}

	@Override
	public List<Livro> buscar() {
		List<Livro> lst = new ArrayList<Livro>();
		try {
			conectar();
			String sqlStr = "Select * from livro order by id desc";
			pst = con.prepareStatement(sqlStr);
			rs = pst.executeQuery();
			while(rs.next()) {
				Livro liv = new Livro();
				liv.setId(rs.getInt(1));
				liv.setNome(rs.getString(2));
				liv.setPreco(rs.getDouble(3));
				liv.setAutor(rs.getString(4));
				liv.setResumo(rs.getString(5));
				liv.setSumario(rs.getString(6));
				liv.setIsbn(rs.getString(7));
				
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		finally {
			try {con.close();}catch(Exception e) {e.printStackTrace();}
		}
		return lst;
	}

	@Override
	public Livro buscar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean atualizar(Livro obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean apagar(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
