package com.br.vinte.um;

public class App {
	public static void main(String[] args) {
		Jogador jogador = new Jogador();
		Baralho baralho = new Baralho();
		
		System.out.println("\n\nPrimeira jogada" + jogador);
		
		Sistema.pedirCarta(jogador, baralho);
		Sistema.pedirCarta(jogador, baralho);
		Sistema.pedirCarta(jogador, baralho);

		
		Sistema.contarPontuacao(jogador);
		System.out.println("\n\n Segunda jogada" + jogador);
	}
}
