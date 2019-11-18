package br.com.desingpatternproduto.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public abstract class Conexao {
	
	protected Connection con=null;
	protected PreparedStatement pst = null;
	protected ResultSet rs = null;
	
	protected void conectar() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbDPro?serverTimezone=UTC","root","");
		}
		catch (Exception ex) {
			
			ex.printStackTrace();
			
		}
	}

}
