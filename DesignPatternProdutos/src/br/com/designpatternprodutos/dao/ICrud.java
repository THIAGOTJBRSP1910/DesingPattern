package br.com.designpatternprodutos.dao;

import java.util.List;

public interface ICrud<T> {
	boolean cadastro(T obj);
	List<T> buscar();
	T buscar(int id);

}
