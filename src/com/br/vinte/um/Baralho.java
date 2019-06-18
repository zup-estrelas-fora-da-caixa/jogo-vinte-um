package com.br.vinte.um;

import java.util.ArrayList;
import java.util.List;

public class Baralho {
	
	private List<Carta> cartas;

	public Baralho() {
		this.cartas = criarCartas();		
	}
	
	private List<Carta> criarCartas(){
		List<Carta> cartas = new ArrayList<Carta>();		
		List<String> naipes = new ArrayList<String>();
		naipes.add("Paus");
		naipes.add("Copas");
		naipes.add("Ouros");
		naipes.add("Espadas");
		
		
		for (String naipe : naipes) {
			for(int i = 1; i <= 10; i++) {
				cartas.add(new Carta(naipe, i));
			}
		}
		
		
		return cartas;
	}
	
	public List<Carta> getCartas() {
		return cartas;
	}
	
	@Override
	public String toString() {
		StringBuilder modelo = new StringBuilder();
		
		for (Carta carta : cartas) {
			modelo.append("\n"+carta);
		}
		
		return modelo.toString();
	}
}
