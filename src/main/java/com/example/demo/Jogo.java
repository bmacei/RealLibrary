package com.example.demo;

import java.util.Scanner;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.internal.NotNull;

@Entity
@Table(name="Jogos")
public class Jogo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@NotNull
	private int codigoJogo;
	@NotNull
	private String nome;
	public void setPreco(double preco) {
		this.preco = preco;
	}
	@NotNull
	private double preco;
	/*int quantidadeProduto;*/
	static ListaJogos listajogos = new ListaJogos();
	
	public Jogo() {
		
	}
	
	public Jogo( String nomeJogo, double precoJogo/*, int quantidadeProduto*/) {
		/*this.codigoJogo = -1;*/
		this.nome = nomeJogo;
		this.preco = precoJogo;
		/*this.quantidadeProduto = quantidadeProduto;*/
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static Jogo addJogo(){
		
		double tempPre;
		/*int tempCod;*/
		/*int tempQntd;*/
		String tempNome;
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		/*System.out.println("Informe o codigo do produto para cadastro.");	
		
		tempCod = teclado.nextInt();
		Produto.validaCodigo(tempCod);*/
		
		/**/
		//this.codigoProduto = Integer.parseInt(tempCod);
		
		System.out.println("Informe o nome do produto para cadastro.");
		
		tempNome = teclado.next();	
		
		System.out.println("Informe o valor do produto para cadastro.");
		
		tempPre = teclado.nextDouble();
		//this.valorProduto = Double.parseDouble(tempVal);
		//teclado.close();
			
		/*System.out.println("Informe a quantidade em estoque.");*/
		
		/*tempQntd = teclado.nextInt();*/
		//this.quantidadeProduto = Integer.parseInt(tempQntd);
		
		Jogo p = new Jogo(tempNome,tempPre/*,tempQntd*/);
		
		
		return p;
		
		
	}
	/*public static void validaCodigo(int tempCod) {
		int x=0;
		while(x==1) {
			

			for(Produto p : estoque.estoqueProdutos) {
			
				if(tempCod == p.getCodigoProduto()) {
				
					System.out.println("VAI SE FODER SEU ANIMAL BURRO DA PORRA!");
					tempCod = tempCod + 1;
					
				}
			
			}
				
			
		}*/
		
		/*int n = tempCod;
		int lenght=(int)(Math.log10(n)+1);
		n = 6 - lenght;
		if(n<0) {
			
			System.out.printf("ERRO codigo: 6848XC48458WES.666  ̿ ̿ ̿'̿'\\̵͇̿̿\\з=(•_•)=ε/̵͇̿̿/'̿'̿ ̿");//codigo inválido
			
		} else {
			
			for (int i = n ; i < 6 ; i ++ ) {
			
				System.out.print("0");
			
			}
			
			System.out.println(tempCod);
		
		}*/
		
	//}
	
	
	
	
	public int getCodigoJogo() {
		return codigoJogo;
	}
	/*public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;*/
	/*}*/
	public String getNome() {
		return nome;
	}
	public double getPreco() {
		return preco;
	}
	/*public int getQuantidadeProduto() {
		return quantidadeProduto;
	}*/
	
	
	
	
	
	/*public void setCodigoJogo(int codigoJogo) {
		this.codigoJogo = codigoJogo;*/
	/*}*/

	public void checkJogo(int cod) {
		
		System.out.println("Nome:"+ nome);
		System.out.println("Valor:"+ preco);
		/*System.out.println("Quantidade em estoque:"+ quantidadeProduto);*/
	}
}
