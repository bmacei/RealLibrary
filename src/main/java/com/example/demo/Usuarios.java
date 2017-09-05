package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.sun.istack.internal.NotNull;

@Entity
@Table
public class Usuarios {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
		/*private int n;*/
		@NotNull
		private String nome;
		/*@OneToMany
		Jogo j = new Jogo();*/
		/*@JoinColumn
		List<Jogo> jogos = new ArrayList<Jogo>();*/
		/*private int[] lib = new int[n];*/
		
		/*public int getN() {
			return n;
		}
		public void setN(int n) {
			this.n = n;
		}*/
		/*public int[] getLib() {
			return lib;
		}
		public void setLib(int[] lib) {
			this.lib = lib;
		}*/
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		/*public List<Jogo> getJogos() {
			return jogos;
		}
		public void setJogos(List<Jogo> jogos) {
			this.jogos = jogos;
		}*/
		public int getId() {
			return id;
		}
}
