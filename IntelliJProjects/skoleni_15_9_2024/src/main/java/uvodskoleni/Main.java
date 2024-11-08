package uvodskoleni;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String vstup = " C++ je %d KRAT lepsi! ";
//
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Napis 1. cislo");
//        double cislo1 = Double.parseDouble(scanner.nextLine());
//        System.out.println("Napis 2. cislo");
//        double cislo2 = Double.parseDouble(scanner.nextLine());
//
//        if (cislo1 > cislo2) {
//            System.out.printf("Cislo %,.3f je vetsi nez cislo %,.3f",cislo1, cislo2);
//        } else if (cislo1 < cislo2) {
//            System.out.printf("Cislo %,.3f je mensi nez cislo %,.3f",cislo1, cislo2);
//        } else {
//            System.out.println("Jsou si rovna");
//        }

//        String vstup = scanner.nextLine();
//        if (vstup.matches("[A-Z]+")) {
//            System.out.println("Retezec je napsany velkymi pismeny");
//        } else {
//            System.out.println("Rezetec neni napsany velkymi pismeny");
//        }


//        String vstup = scanner.nextLine();
//        if (vstup.equals(vstup.toUpperCase())) {
//            System.out.println("Retezec je napsany velkymi pismeny");
//        } else {
//            System.out.println("Rezetec neni napsany velkymi pismeny");
//        }


//        for (int i = 0; i < 3; i++) {
//            System.out.println("hello svete");
//        }
//        for (int i = 1; i <= 10; i++) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//
//        for (int i = 10; i > 0; i--) {
//            System.out.print(i + " ");
//        }
//        System.out.println();

//        String pokracovat;
//        do {
//            System.out.println("Napis prvni cislo:");
//            double prvniCislo = Double.parseDouble(scanner.nextLine());
//            System.out.println("Napis druhe cislo:");
//            double druheCislo = Double.parseDouble(scanner.nextLine());
//
//            double soucet = prvniCislo + druheCislo;
//            double rozdil = prvniCislo - druheCislo;
//            double soucin = prvniCislo * druheCislo;
//            double podil = prvniCislo / druheCislo;
//
//            System.out.println("Soucet: " + soucet);
//            System.out.printf("Rozdil: %,.3f %n", rozdil);
//            System.out.println("Soucin:" + soucin);
//            System.out.printf("Podil: %,.3f %n", podil);
//
//            System.out.println("Chces pokracovat? [ano/ne]");
//            pokracovat = scanner.nextLine().toLowerCase();
//
//        } while (pokracovat.equals("ano"));


//        for (int i = 0; i < 8; i++) {
//            for (int j = 0; j < 8; j++) {
//                if ((i +j) % 2 == 0) {
//                    System.out.print("##");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }



//        String[] dny = {" ", "Pondeli", "Utery", "Streda", "Ctvrtek", "Patek", "Sobota", "Nedele"};
//        System.out.println("zadej cislo od 1 do 7");
//        int vyber = Integer.parseInt(scanner.nextLine());
//        System.out.println(dny[vyber]);

//        System.out.println("Napis neco");
//        String vstup = scanner.nextLine();
//        char[] poleVstup = vstup.toCharArray();
//        for (int i = poleVstup.length-1; i > 0 ; i--) {
//            System.out.print(poleVstup[i]);
//        }

        System.out.println("Napis platy oddelene carkou:");
        String vstup = scanner.nextLine();
        String[] poleVstupu = vstup.split(",");
        int soucet = 0;
        for (String a : poleVstupu) {
            soucet += Integer.parseInt(a);
        }
        System.out.println(soucet/ poleVstupu.length);


    }
}
