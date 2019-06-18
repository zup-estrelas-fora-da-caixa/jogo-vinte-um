package com.br.vinte.um;

import java.util.Random;

public class Sistema {

	public static Carta puxarCarta(Baralho baralho) {
		
		Random numeroAleatorio = new Random();
		
		int posicao = numeroAleatorio.nextInt(baralho.getCartas().size());
		
		Carta carta = baralho.getCartas().get(posicao);
		
		baralho.getCartas().remove(carta);
		
		return carta;
	}
	
	public static void pedirCarta(Jogador jogador, Baralho baralho) {
		jogador.getCartas().add(puxarCarta(baralho));
		
	}
	
	public static void contarPontuacao(Jogador jogador) {
		
		int totalDePontos = 0;
		
		for (Carta carta : jogador.getCartas()) {
			totalDePontos += carta.getNumero();
		}
		
		jogador.setPontuacao(totalDePontos);
		
	}
}
