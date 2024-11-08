package cz.itnetwork;

import java.util.Scanner;

public class OopKalkulacka {
    public static void main(String[] args) {
        // Vytvoření instance
        Kalkulacka kalkulacka = new Kalkulacka();
        // Načtení atributů
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadej 1. číslo: ");
        kalkulacka.a = Double.parseDouble(scanner.nextLine());
        System.out.println("Zadej 2. číslo: ");
        kalkulacka.b = Double.parseDouble(scanner.nextLine());
        System.out.println("Součet: " + kalkulacka.secti());
        System.out.println("Rozdíl: " + kalkulacka.odecti());
        System.out.println("Součin: " + kalkulacka.vynasob());
        System.out.println("Podíl: " + kalkulacka.vydel());
    }
}
