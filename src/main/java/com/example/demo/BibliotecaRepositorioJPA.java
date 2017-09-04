package com.example.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class BibliotecaRepositorioJPA implements BibliotecaRepositorio{

		@PersistenceContext
		private EntityManager em;
		

@Override
public void inserir(Biblioteca p) {
	// TODO Auto-generated method stub
	
}

@Override
public Biblioteca consultarPorId(int id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<Biblioteca> consultarTodos() {
	// TODO Auto-generated method stub
	return null;
}

}
