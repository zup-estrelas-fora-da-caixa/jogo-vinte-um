package com.br.vinte.um;

public class Carta {

	private String naipe;
	private int numero;

	public Carta(String naipe, int numero) {
		this.naipe = naipe;
		this.numero = numero;
	}

	public String getNaipe() {
		return naipe;
	}

	public int getNumero() {
		return numero;
	}
	
	@Override
	public String toString() {
		StringBuilder modelo = new StringBuilder();
		modelo.append("Naipe: "+this.naipe);
		modelo.append("\nNumero: "+this.numero);
		
		return modelo.toString();
	}
}
