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
		/*if (p.getQuantidadeProduto() > 0) {*/
			
			listaJogos.add(p);
			/*this.geraCodigoJogo();*/
			System.out.println("Sucesso");

		/*} else {
			System.out.println("ERRO: 6848XC48458WES.1/ http://bit.ly/2uP5gdV /(ãƒŽà² ç›Šà² )ãƒŽå½¡â”»â”�â”»");// produto nao// adicionado(quantd// negativa)			
		}*/

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
	/*private void geraCodigoJogo() {
		for (Jogo p : listaJogos) {
			if (p.getCodigoJogo() == -1)
				p.setCodigoJogo(listaJogos.indexOf(p));
			else if (p.getCodigoJogo() != listaJogos.indexOf(p))
				p.setCodigoJogo(listaJogos.indexOf(p));
		}*/
	}

	/*public void vendeProduto(int codigo, int quantidadeProduto) {

		// for(int i = 0;i<=estoqueProdutos.size();i++) {
		for (Produto p : estoqueProdutos) {
			// System.out.println(estoqueProdutos.size());
			// System.out.println(estoqueProdutos.indexOf(p));
			if (p.getCodigoProduto() == codigo) {
				if (quantidadeProduto <= p.getQuantidadeProduto()) {
					// estoqueProdutos.get(1).setQuantidadeProduto(estoqueProdutos.get(i).getQuantidadeProduto()-quantidadeProduto);
					p.setQuantidadeProduto(p.getQuantidadeProduto() - quantidadeProduto);
					break;

				} else if (quantidadeProduto > p.getQuantidadeProduto()) {

					System.out.println("ERRO codigo: 6848XC48458WES.69  ï´¾Í¡à¹�Ì¯Í¡à¹�ï´¿ O'RLY?");// venda maior que estoque
					System.exit(0);
					break;
				}
			} else if (estoqueProdutos.size() == estoqueProdutos.indexOf(p) + 1) {

				System.out.println("ERRO codigo: 6848XC48458WES.404  áƒš,á”‘â€¢ïºªÍŸÍ â€¢á”�.áƒš");// produto nao encontrado
				break;

			}

		}

	}*/
	
/*}*/
