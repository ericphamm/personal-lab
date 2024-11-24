package input;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String[] mesice = { "leden", "únor", "březen", "duben", "květen", "červen", "červenec", "srpen", "září", "říjen", "listopad", "prosinec" };

        Scanner scanner = new Scanner(System.in);

//        List<MesicniVydelek> mesicniVydelekList = Arrays.stream(mesice)
//                .map(mesic -> {
//                    while (true) {
//                        try {
//                            System.out.print(mesic + ": ");
//                            int vydelek = Integer.parseInt(scanner.nextLine());
//                            return new MesicniVydelek(mesic, vydelek);
//                        } catch (Exception e) {
//                            System.out.println("Zadej znovu");
//                        }
//                    }
//                })
//                .collect(Collectors.toList());

        List<MesicniVydelek> mesicniVydelekList = new ArrayList<>();

        for (String mesic :mesice) {
            int vydelek;
            boolean jeSpravne = false;
            while (!jeSpravne) {
                try {
                    System.out.print(mesic + ": ");
                    vydelek = Integer.parseInt(scanner.nextLine());
                    mesicniVydelekList.add(new MesicniVydelek(mesic,vydelek));
                    jeSpravne = true;
                } catch (Exception e) {
                    System.out.println("zadej znovu");
                }
            }
        }

        int celkovyVydelek = mesicniVydelekList.stream()
                .mapToInt(MesicniVydelek::getVydelek)
                .sum();
        System.out.println("Celkový výdělek: " + celkovyVydelek + " Kč");

        OptionalDouble prumernyVydelek = mesicniVydelekList.stream()
                .mapToDouble(v -> v.getVydelek())
                .average();
        System.out.println("Průměrný výdělek: " + prumernyVydelek.getAsDouble() + " Kč" );

        double nejmensiVydelek = mesicniVydelekList.stream()
                .mapToDouble(MesicniVydelek::getVydelek)
                .min()
                .orElse(Double.MIN_VALUE);
        System.out.println("Nejmenší výdělek: " + (int) nejmensiVydelek + " Kč");

        double nejvetsiVydelek = mesicniVydelekList.stream()
                .mapToDouble(MesicniVydelek::getVydelek)
                .max()
                .orElse(Double.MIN_VALUE);
        System.out.println("Největší výdělek: " + (int) nejvetsiVydelek + " Kč");

        long pocetVydelecnychMesicu = mesicniVydelekList.stream()
                .filter(v -> v.getVydelek() > 0)
                .count();
        System.out.println("Počet výdělečných měsíců: " + pocetVydelecnychMesicu);

        long pocetprodelecnychMesicu = mesicniVydelekList.stream()
                .filter(v -> v.getVydelek() < 0)
                .count();
        System.out.println("Počet prodělečných měsíců: " + pocetprodelecnychMesicu);

        String prvniVydelecnyMesic = mesicniVydelekList.stream()
                .filter(v -> v.getVydelek() > 0)
                .findFirst()
                .map(MesicniVydelek::getMesic)
                .orElse("Zadny prvni vydelecny mesic");
        System.out.println("První výdělečný měsíc: " + prvniVydelecnyMesic);

        String posledniVydelecnyMesic = mesicniVydelekList.stream()
                .filter(v -> v.getVydelek()  > 0)
                .reduce((first, second) -> second)
                .map(MesicniVydelek::getMesic)
                .orElse("Zadny posledni vydelecny mesic");
        System.out.println("Poslední výdělečný měsíc: " + posledniVydelecnyMesic);
    }
}
