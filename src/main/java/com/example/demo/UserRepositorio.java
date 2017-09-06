package com.example.demo;

import java.util.List;

public interface UserRepositorio {
	
	void inserir(NUser p);
	NUser consultarPorId(int id);
	List<NUser> consultarTodos();
	
}