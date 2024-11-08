package cz.itnetwork;

import java.util.Scanner;

public class papousek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Napis prvni cislo");
        double cislo = Double.parseDouble(scanner.nextLine());
        System.out.println("Napis druhe cislo");
        double cislo2 = Double.parseDouble(scanner.nextLine());
        double soucet = cislo + cislo2;
        double rozdil = cislo - cislo2;
        double nasobek = cislo * cislo2;
        double podil = cislo / cislo2;
        System.out.println("soucet: " + soucet);
        System.out.println("rozdil: " + rozdil);
        System.out.println("nasobek: " + nasobek);
        System.out.println("podil: " + podil);
    }
}
