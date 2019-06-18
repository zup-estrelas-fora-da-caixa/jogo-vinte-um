package com.br.vinte.um;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
	
	private int pontuacao;
	private List<Carta> cartas = new ArrayList<Carta>();
	
	public Jogador() {
		
	}
	
	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}
	public List<Carta> getCartas() {
		return cartas;
	}
	public int getPontuacao() {
		return pontuacao;
	}
	@Override
	public String toString() {
		StringBuilder modelo = new StringBuilder();
		
		modelo.append("\nPontuação:"+this.pontuacao);
		modelo.append("\nCartas do jogador: ");
		
		for (Carta carta : cartas) {
			modelo.append("\n"+carta);
		}
		
		return modelo.toString();
	}
	
}
