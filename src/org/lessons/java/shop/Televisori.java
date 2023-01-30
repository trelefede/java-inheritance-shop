package org.lessons.java.shop;

public class Televisori extends Prodotto {

	private int pollici;
	private boolean smartTv;

	public Televisori(String nome, String marca, double prezzo, double iva, int pollici, boolean smartTv) {
		super(nome, marca, prezzo, iva);
		this.pollici = pollici;
		this.smartTv = smartTv;
	}

	public int getPollici() {
		return pollici;
	}

	public void setPollici(int pollici) {
		this.pollici = pollici;
	}

	public boolean isSmartTv() {
		return smartTv;
	}

	public void setSmartTv(boolean smartTv) {
		this.smartTv = smartTv;
	}

	@Override
	public String toString() {
		return "Codice magazzino: " + getCodice() + "\n" + "Marca: " + getMarca() + "\n" + "Modello: " + getNome()
				+ "\n" + "Pollici: " + getPollici() + "\n" + "E' smart? " + isSmartTv() + "\n" + "Prezzo base: "
				+ prezzoBase() + "Prezzo con iva: " + prezzoIva();
	}

}
