package Losovani;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Losovac losovac = new Losovac();
//        System.out.println("Vítejte v programu losování.");
//        String volba = "0";
//// hlavní cyklus
//        while (!volba.equals("3")) {
//            // výpis možností
//            System.out.println("1 - Losovat další číslo");
//            System.out.println("2 - Vypsat čísla");
//            System.out.println("3 - Konec");
//            volba = scanner.nextLine();
//            System.out.println();
//            // reakce na volbu
//            switch (volba) {
//                case "1":
//                    System.out.printf("Padlo číslo: %s%n", losovac.losuj());
//                    break;
//                case "2":
//                    System.out.printf("Padla čísla: %s%n", losovac.vypis());
//                    break;
//                case "3":
//                    System.out.println("Děkuji za použití programu");
//                    break;
//                default:
//                    System.out.println("Neplatná volba, zadejte prosím znovu.");
//                    break;
//            }
//        }


        String[] retezce = {"První", "Druhá", "Třetí"};
        ArrayList<String> polozky = new ArrayList<String>(Arrays.asList(retezce));
        System.out.println(polozky.get(2));


    }
}
