package hardcoded;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        int trzba = Integer.parseInt(scanner.nextLine());

        MesicniVydelek leden = new MesicniVydelek("leden", -25680);
        MesicniVydelek unor = new MesicniVydelek("únor", -12352);
        MesicniVydelek brezen = new MesicniVydelek("březen", 1240);
        MesicniVydelek duben = new MesicniVydelek("duben", 13570);
        MesicniVydelek kveten = new MesicniVydelek("květen", 36879);
        MesicniVydelek cerven = new MesicniVydelek("červen", 40010);
        MesicniVydelek cervenec = new MesicniVydelek("červenec", 62323);
        MesicniVydelek srpen = new MesicniVydelek("srpen", 59861);
        MesicniVydelek zari = new MesicniVydelek("září", 12547);
        MesicniVydelek rijen = new MesicniVydelek("říjen", 1506);
        MesicniVydelek listopad = new MesicniVydelek("listopad", 26);
        MesicniVydelek prosinec = new MesicniVydelek("prosinec", -5892);

        Collection<MesicniVydelek> mesice = Arrays.asList(leden, unor, brezen, duben, kveten, cerven, cervenec, srpen, zari, rijen, listopad, prosinec);

        String[] mesice1 = { "leden", "únor", "březen", "duben", "květen", "červen", "červenec", "srpen", "září", "říjen", "listopad", "prosinec" };

        int celkovyVydelek = mesice.stream()
                        .mapToInt(MesicniVydelek::getVydelek)
                                .sum();
        System.out.println("Celkový výdělek: " + celkovyVydelek + " Kč" );


        double prumernyVydelek = mesice.stream()
                .mapToDouble(MesicniVydelek::getVydelek)
                        .average()
                                .orElse(0.0);
        System.out.println("Průměrný výdělek: " + (int) prumernyVydelek + " Kč" );

        double nejmensiVydelek = mesice.stream()
                .mapToDouble(MesicniVydelek::getVydelek)
                .min()
                .orElse(Double.MIN_VALUE);
        System.out.println("Nejmenší výdělek: " + (int) nejmensiVydelek + " Kč");

        double nejvetsiVydelek = mesice.stream()
                .mapToDouble(MesicniVydelek::getVydelek)
                .max()
                .orElse(Double.MIN_VALUE);
        System.out.println("Největší výdělek: " + (int) nejvetsiVydelek + " Kč");

        long pocetVydelecnychMesicu = mesice.stream()
                .filter(v -> v.getVydelek() > 0)
                .count();
        System.out.println("Počet výdělečných měsíců: " + pocetVydelecnychMesicu);

        long pocetprodelecnychMesicu = mesice.stream()
                .filter(v -> v.getVydelek() < 0)
                .count();
        System.out.println("Počet prodělečných měsíců: " + pocetprodelecnychMesicu);

        String prvniVydelecnyMesic = mesice.stream()
                .filter(v -> v.getVydelek() > 0)
                .findFirst()
                .map(MesicniVydelek::getMesic)
                .orElse("Zadny prvni vydelecny mesic");
        System.out.println("První výdělečný měsíc: " + prvniVydelecnyMesic);

        String posledniVydelecnyMesic = mesice.stream()
                .filter(v -> v.getVydelek()  > 0)
                .reduce((first, second) -> second)
                .map(MesicniVydelek::getMesic)
                .orElse("Zadny posledni vydelecny mesic");
        System.out.println("Poslední výdělečný měsíc: " + posledniVydelecnyMesic);


    }
}
