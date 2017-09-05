package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import com.sun.istack.internal.NotNull;

@Entity
@Table(name = "Jogos")
public class Jogo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int codigoJogo;
	@NotNull
	@Size(min = 2, max = 100)
	private String nome;
	@NotNull
	@Min(0)
	private double preco;

	public Jogo() {

	}

	public Jogo(String nomeJogo, double precoJogo) {
		this.nome = nomeJogo;
		this.preco = precoJogo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getCodigoJogo() {
		return codigoJogo;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

}
