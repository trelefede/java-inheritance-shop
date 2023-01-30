package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

	Random r = new Random();

	private int codice;
	private String nome;
	private String marca;
	private double prezzo;
	private double iva;

	public Prodotto(String nome, String marca, double prezzo, double iva) {
		super();
		codice = r.nextInt(1000);
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
		this.iva = iva;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

	public int getCodice() {
		return codice;
	}

	public String prezzoBase() {
		String prezzoProdotto = prezzo + "€";
		return prezzoProdotto;
	}

	public String prezzoIva() {
		double prezzoIvato = ((prezzo * iva) / 100) + prezzo;
		String s = (prezzoIvato + "€");
		return s;
	}
}
