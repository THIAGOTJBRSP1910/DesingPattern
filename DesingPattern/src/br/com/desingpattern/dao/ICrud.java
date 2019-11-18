package br.com.desingpattern.dao;

import java.util.List;

public interface ICrud<T> {
	boolean cadastro (T obj);
	List<T> buscar();
	T buscar(int id);
	boolean atualixar (T obj);
	boolean apagar(int id);

}
