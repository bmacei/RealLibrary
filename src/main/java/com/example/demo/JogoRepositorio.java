package com.example.demo;

import java.util.List;

public interface JogoRepositorio {
	
	void inserir(Jogo p);
	Jogo consultarPorId(int id);
	List<Jogo> consultarTodos();
	
}