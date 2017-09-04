package com.example.demo;

import java.util.List;

public interface BibliotecaRepositorio {
	
	void inserir(Biblioteca p);
	Biblioteca consultarPorId(int id);
	List<Biblioteca> consultarTodos();
	
}