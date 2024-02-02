package de.sirmelonchen;

import java.util.Scanner;

public class Fahrsimulator {
    public static void main(String[] args) {
        System.out.println("Starte Fahrsimulator");
        double v = 0;
        double dv;
        Scanner ms = new Scanner(System.in);
        System.out.println("Die höchstgeschwindigkeit beträgt 130km/h und die niedrigste 0km/h");

        while(true){
            System.out.println("Wir haben gerade eine geschwindigkeit von: " + v);
            System.out.print("Erhöhe oder Verringere die Geschwindigkeit mit Zahleingaben: ");
            dv = ms.nextInt();
            v = beschleunige(v, dv);
        }
    }
    public static double beschleunige(double v, double dv){
        double nv;
        nv = v + dv;
        if (nv > 130){
            nv = 130;
            System.out.println("Die höchstgeschwindigkeit beträgt 130km/h");
        } else if (nv < 0) {
            nv = 0;
            System.out.println("Die tiefstgeschwindigkeit beträgt 0km/h");
        }
        return nv;
    }
}
