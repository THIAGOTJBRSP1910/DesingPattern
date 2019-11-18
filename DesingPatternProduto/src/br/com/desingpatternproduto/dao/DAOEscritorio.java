package br.com.desingpatternproduto.dao;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.desingpatternproduto.pojo.Escritorio;
import br.com.desingpatternproduto.pojo.Livro;

public class DAOEscritorio extends Conexao implements ICrud<Escritorio>{

	@Override
	public boolean cadastro(Escritorio obj) {
		// TODO Auto-generated method stub
		boolean retorno = true;
		
		try {
			conectar();
			
			String sqlPro = "insert into Produto(nome,preco)values(?,?)";
			PreparedStatement pstPro = con.prepareStatement(sqlPro,Statement.RETURN_GENERATED_KEYS);
			
			pstPro.setString(1, obj.getNome());
			pstPro.setDouble(2, obj.getPreco());
			
			int idPro = pstPro.executeUpdate();
			
			String sqlEsc = "insert into escritorio(categoria,id)values(?,?)";
			PreparedStatement pstEsc = con.prepareStatement(sqlEsc,Statement.RETURN_GENERATED_KEYS);
			
			pstEsc.setString(1, obj.getCategoria());
			pstEsc.setInt(2, obj.getId());
			
			int idEsc = pstEsc.executeUpdate();
			if (idEsc < 1)
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
	public List<Escritorio> buscar() {
		List<Escritorio> esc = new ArrayList<Escritorio>();
		try {
			conectar();
			String sqlStr = "Select * from escritorio order by id desc";
			pst = con.prepareStatement(sqlStr);
			rs = pst.executeQuery();
			while(rs.next()) {
				Escritorio esc1 = new Escritorio();
				esc1.setId(rs.getInt(1));
				esc1.setNome(rs.getString(2));
				esc1.setPreco(rs.getDouble(3));
				esc1.setCategoria(rs.getString(4));
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		finally {
			try {con.close();}catch(Exception e) {e.printStackTrace();}
		}
		return esc;
	}

	@Override
	public Escritorio buscar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean atualizar(Escritorio obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean apagar(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
