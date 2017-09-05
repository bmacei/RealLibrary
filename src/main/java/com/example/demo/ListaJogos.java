package com.example.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaJogos {

	private ArrayList<Jogo> listaJogos;

	public ListaJogos() {
		super();
		this.listaJogos = new ArrayList<>();
	}

	public void guardaJogo(Jogo p) {			
			listaJogos.add(p);
			System.out.println("Sucesso");

	}
	
	

	public ArrayList<Jogo> getListaJogos() {
		return listaJogos;
	}

	public void setListaJogos(ArrayList<Jogo> listaJogos) {
		this.listaJogos = listaJogos;
	}

	public void removeJogo() {
		Scanner teclado = new Scanner(System.in);
		int tempCod;

		System.out.println("Informe o codigo do jogo a ser removido:");
		tempCod = teclado.nextInt();

		for (Jogo p : listaJogos) {

			if (p.getCodigoJogo() == tempCod) {

				listaJogos.remove(p);

			}

		}

	}
	public Jogo getJogoByCode(Integer id) {
		
		for(Jogo p: this.getListaJogos()) {
			if( p.getCodigoJogo() == id) {
				return p;
			}
		}
		return null;
		
	}
	public Boolean contains(Jogo p) {
		if(this.listaJogos.contains(p))
			return true;
		return false;
	}

}

