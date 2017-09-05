package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="Biblioteca")
public class Biblioteca {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	/*@ManyToMany
	Jogo jogo;*/
	private int jogo;	
	/*private String nome;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}*/
	public int getId() {
		return id;
	}
	public int getJogo() {
		return jogo;
	}
	public void setJogo(int jogo) {
		this.jogo = jogo;
	}
	
}
