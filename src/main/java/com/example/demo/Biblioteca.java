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
	int id;
	/*@ManyToMany
	Jogo jogo;*/
	int jogo;

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
