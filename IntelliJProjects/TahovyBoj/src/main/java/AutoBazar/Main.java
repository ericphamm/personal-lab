package AutoBazar;

public class Main {
    public static void main(String[] args) {


        Autobazar bazar = new Autobazar("Šikmá 10", 5000000);

        // Vytvoření testovacích dat
        Auto skoda120 = new Auto("123ABC", "Škoda 120", 10000);
        Auto skodaFabia = new Auto("456DEF", "Škoda Fabia", 100000);
        Auto ferrari = new Auto("789GHI", "Ferrari FF", 3000000);
        NakladniAuto tatra = new NakladniAuto("534NGS", "Tatra 811", 50000, 20000);
        NakladniAuto renault = new NakladniAuto("489GSR", "Renault Midliner", 100000, 30000);


        bazar.pridani(skoda120);
        bazar.pridani(skodaFabia);
        bazar.pridani(ferrari);
        bazar.pridani(tatra);
        bazar.pridani(renault);

        System.out.println(bazar.zjisteni());


    }
}
