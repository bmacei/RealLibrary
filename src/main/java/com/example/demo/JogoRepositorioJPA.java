package com.example.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class JogoRepositorioJPA implements JogoRepositorio{
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void inserir(Jogo p) {
		em.persist(p);
		
	}

	@Override
	public Jogo consultarPorId(int id) {
		return em.find(Jogo.class, id);
	}

	@Override
	public List<Jogo> consultarTodos() {
		return em.createQuery("select p from jogo p",Jogo.class).getResultList();
	}
	
}