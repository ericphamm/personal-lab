package cz.itnetwork;

import java.util.Scanner;

public class Prochazeni {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Hra hra = new Hra();
        String prikaz = "";

        while (!prikaz.equalsIgnoreCase("konec")) {
            System.out.println(hra.vratAktualnilokaci());
            System.out.println("Zadej prikaz: ");
            prikaz = scanner.nextLine();
            hra.vykonatRozkaz(prikaz);
        }

    }
}