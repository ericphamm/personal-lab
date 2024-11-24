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


        OptionalDouble prumernyVydelek = mesice.stream()
                .mapToDouble(MesicniVydelek::getVydelek)
                        .average();
        System.out.println("Průměrný výdělek: " + prumernyVydelek.getAsDouble() + " Kč" );

        OptionalInt nejvetsiVydelek = mesice.stream()
                .mapToInt(MesicniVydelek::getVydelek)
                .max();
        System.out.println("Největší výdělek: " + nejvetsiVydelek.getAsInt() + " Kč");

        OptionalInt nejmensiVydelek = mesice.stream()
                .mapToInt(MesicniVydelek::getVydelek)
                .min();
        System.out.println("Největší výdělek: " + nejmensiVydelek.getAsInt() + " Kč");




    }
}
