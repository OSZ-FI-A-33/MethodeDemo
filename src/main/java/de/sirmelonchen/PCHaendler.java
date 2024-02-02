package de.sirmelonchen;

import java.util.Scanner;

public class PCHaendler {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		// Benutzereingaben lesen
		String artikel = liesString("was möchten Sie bestellen?", myScanner);

		int anzahl = liesint("Geben Sie die Anzahl ein:", myScanner);

		double preis = liesdouble("Geben Sie den Nettopreis ein:", myScanner);

		double mwst = liesdouble("Geben Sie den Mehrwertsteuersatz in Prozent ein:", myScanner);

		// Verarbeiten
		double nettogesamtpreis = berechneGesamtnettopreis(anzahl, preis);
		double bruttogesamtpreis = berechneGesamtbruttopreis(nettogesamtpreis, mwst);

		// Ausgeben

		rechungausgeben(artikel, anzahl, nettogesamtpreis, bruttogesamtpreis, mwst);
	}
	public static String liesString(String text, Scanner myScanner){
		System.out.println(text);
		String artikel = myScanner.next();
		return artikel;
	}
	public static int liesint(String text, Scanner myScanner){
		System.out.println(text);
		int anzahl = myScanner.nextInt();
		return anzahl;
	}
	public static double liesdouble(String text, Scanner myScanner){
		System.out.println(text);
		double preis = myScanner.nextDouble();
		return preis;
	}
	public static double berechneGesamtnettopreis(int anzahl, double nettopreis){
		double nettogesamtpreis = anzahl * nettopreis;
		return nettogesamtpreis;
	}
	public static double berechneGesamtbruttopreis(double nettogesamtpreis, double mwst){
		double bruttogesamtpreis = nettogesamtpreis * (1 + mwst / 100);
		return bruttogesamtpreis;
	}
	public static void rechungausgeben(String artikel, int anzahl, double nettogesamtpreis, double bruttogesamtpreis, double mwst){
		System.out.println("\tRechnung");
		System.out.printf("\t\t Netto:  %-20s %6d %10.2f %n", artikel, anzahl, nettogesamtpreis);
		System.out.printf("\t\t Brutto: %-20s %6d %10.2f (%.1f%s)%n", artikel, anzahl, bruttogesamtpreis, mwst, "%");
	}

}
