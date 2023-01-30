package org.lessons.java.shop;

public class Cuffie extends Prodotto {

	private String colore;
	private String connettività;

	public Cuffie(String nome, String marca, double prezzo, double iva, String colore, String connettività) {
		super(nome, marca, prezzo, iva);
		this.colore = colore;
		this.connettività = connettività;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public String getConnettività() {
		return connettività;
	}

	public void setConnettività(String connettività) {
		this.connettività = connettività;
	}

	@Override
	public String toString() {
		return "Codice magazzino: " + getCodice() + "\n" + "Marca: " + getMarca() + "\n" + "Modello: " + getNome()
				+ "\n" + "Colore: " + getColore() + "\n" + "Connettivita: " + getConnettività() + "\n" + "Prezzo base: "
				+ prezzoBase() + "Prezzo con iva: " + prezzoIva();
	}

}
