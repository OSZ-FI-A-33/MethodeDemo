package de.sirmelonchen;

import java.util.Scanner;

public class Quadrat {
    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in);
        int zahl, quadrat;
        // Eingabe
        System.out.print("Geben Sie eine Zahl ein um das Quadrat zu Bilden: ");
        zahl = tastatur.nextInt();
        // Verarbeitung
        quadrat = quadratBerechnen(zahl);
        // Ausgabe
        System.out.println("Das Quadrat ist: " + quadrat);
    }

    public static int quadratBerechnen(int zahl){
        int quadrat;
        quadrat = zahl*zahl;
        return quadrat;
    }
}
