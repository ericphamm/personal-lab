import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //Vytvoření jendotlivých planet
        Planeta Merkur = new Planeta("Merkur", 2440, 0, true, 440);
        Planeta Venuse = new Planeta("Venuše", 12104, 0, true, 737);
        Planeta Zeme = new Planeta("Země", 12756, 1, true, 287);
        Planeta Mars = new Planeta("Mars", 6792, 2, true, 210);
        Planeta Jupiter = new Planeta("Jupiter", 142984, 79, false, 152);
        Planeta Saturn = new Planeta("Saturn", 120536, 82, false, 93);
        Planeta Uran = new Planeta("Uran", 51118, 27, false, 68);
        Planeta Neptun = new Planeta("Neptun", 49528, 14, false, 53);

        //Vytvoření listu planet
        List<Planeta> planety = new ArrayList<>();
        planety.add(Merkur);
        planety.add(Venuse);
        planety.add(Zeme);
        planety.add(Mars);
        planety.add(Jupiter);
        planety.add(Saturn);
        planety.add(Uran);
        planety.add(Neptun);




        System.out.println("Plynné planety");
        planety.stream()
                .filter(planeta -> !planeta.jeKamenna())
                .collect(Collectors.toList())
                .forEach(planeta -> System.out.println(" " + planeta));
        System.out.println();


        List<Planeta> kamennePlanety = planety.stream() // Vytvoření Streamu
                .sorted(Comparator.comparing(Planeta::getPrumer) // Slouží k upsořádání listu pomocí dané podmínky, v tomto případě se seznam seřadí podle Velikosti
                        .reversed()) // Seřadí seznam pozpátku
                .filter(p -> p.jeKamenna() )  // Vyfiltrování jendotlivých planet podle toho jestli jsou kamenné nebo ne, zde se získají planety které jsou kamenné
                .collect(Collectors.toList());// Vyfiltrované planety seskládej do Kolekce List
        System.out.println("Kamenné planety");
        for (Planeta planeta : kamennePlanety) {  // Získání jednotlivých planet z listu
            System.out.println(" " + planeta.getNazev()); // Výpis planet
        }
        System.out.println();



        System.out.println("Planety s průměrnou teplotou vyšší než 0 °C (273,15 K):");
        planety.stream()
                .filter(planeta -> planeta.getTeplota() > 273.15)
                .collect(Collectors.toList())
                .forEach(planeta -> System.out.println(" " + planeta));
        System.out.println();


        System.out.println("Planety s měsíci:");
        planety.stream()
                .filter(planeta -> planeta.getPocetMesicu() >= 1)
                .collect(Collectors.toList())
                .forEach(planeta -> System.out.println(" " + planeta));
        System.out.println();


        System.out.println("Planety větší než Venuše:");
        planety.stream()
                .filter(planeta -> planeta.getPrumer() > Venuse.getPrumer())
                .collect(Collectors.toList())
                .forEach(planeta -> {
                    int index = planety.indexOf(planeta) + 1;
                    System.out.println(" " + index + ". planeta - " + planeta);
                });
        System.out.println();

    }
}
