package org.lessons.java.shop;

import java.util.Scanner;

public class Catalogo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Inserimento nuovo prodotto a catalogo.\nInserisci il nome: ");
		String nome = sc.nextLine();

		System.out.println("Inserisci la marca: ");
		String marca = sc.nextLine();

		System.out.println("Prezzo: ");
		double prezzo = sc.nextDouble();

		System.out.println("Iva: ");
		double iva = sc.nextDouble();

		System.out.println(
				"A quale categoria appartiene? Premi 'S' per smartphone, 'T' per televisore e 'C' per cuffie:");
		sc.nextLine();

		// smartphone
		if (sc.nextLine().equalsIgnoreCase("S")) {

			System.out.println("Inserisci il codiceImei: ");
			String codiceImei = sc.nextLine();
			sc.nextLine();

			System.out.println("Inserisci la capacità memoria smartphone: ");
			int memoria = sc.nextInt();

			Smartphone smartPhone = new Smartphone(nome, marca, prezzo, iva, codiceImei, memoria);

			System.out.println(smartPhone);

			// televisore
		} else if (sc.nextLine().equalsIgnoreCase("T")) {

			System.out.println("Inserisci la dimensione in pollici: ");
			int dimensione = sc.nextInt();

			System.out.println("E' una smart TV? Inserisci 'true' o 'false'");
			boolean smartTv = sc.nextBoolean();

			Televisori tv = new Televisori(nome, marca, prezzo, iva, dimensione, smartTv);

			System.out.println(tv);

			// cuffia
		} else if (sc.nextLine().equalsIgnoreCase("C")) {

			System.out.println("Inserisci il colore delle cuffie: ");
			String colore = sc.nextLine();

			System.out.println("Sono wireless o cablate? ");
			String connettività = sc.nextLine();

			Cuffie cuffia = new Cuffie(nome, marca, prezzo, iva, colore, connettività);

			System.out.println(cuffia);
		}

		sc.close();
	}
}
