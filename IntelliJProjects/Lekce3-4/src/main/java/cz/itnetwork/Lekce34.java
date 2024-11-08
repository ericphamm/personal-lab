package cz.itnetwork;

import java.util.Scanner;

public class Lekce34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ahoj, jak se jmenuješ?");
//        String jmeno = scanner.nextLine();
//        System.out.println("Jaký jsi?");
//        String vlastnost = scanner.nextLine();
//        System.out.println(jmeno + " je " + vlastnost);

//        System.out.println("Zadej cislo k umocneni:");
//        int cislo = Integer.parseInt(scanner.nextLine());
//        System.out.println("Vysledek: " + cislo * cislo);

        System.out.println("Zadej poloměr kruhu (cm): ");
        double polomer = Double.parseDouble(scanner.nextLine());
        System.out.println("Obvod zadaného kruhu je: " + 2 * 3.1415 * polomer + " cm");
        System.out.println("Jeho obsah je: " + 3.1415 * polomer *polomer + " cm^2");
    }
}
