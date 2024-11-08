package kalkulacka;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Napis prvni cislo:");
        double prvniCislo = Double.parseDouble(scanner.nextLine());
        System.out.println("Napis druhe cislo:");
        double druheCislo = Double.parseDouble(scanner.nextLine());

        double soucet = prvniCislo + druheCislo;
        double rozdil = prvniCislo - druheCislo;
        double soucin = prvniCislo * druheCislo;
        double podil = prvniCislo / druheCislo;

        System.out.println("Soucet: " + soucet);
        System.out.printf("Rozdil: %,.3f %n", rozdil);
        System.out.println("Soucin:" + soucin);
        System.out.printf("Podil: %,.3f", podil);
    }
}
