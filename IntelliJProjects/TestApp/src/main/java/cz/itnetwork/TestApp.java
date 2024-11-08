package cz.itnetwork;

import java.util.Scanner;


public class TestApp {
    public static void main(String[] args) {
//    String text = " Fullscreen shaDows autosave ";
//        System.out.println(text.startsWith("krok"));
//        System.out.println(text.endsWith("hroch"));
//        System.out.println(text.contains("nos"));
//        System.out.println(text.contains("roh"));
//        System.out.println(text.isEmpty());
//        System.out.println(text.toUpperCase());
//        System.out.println(text.trim());
//        System.out.println(text.replace("shaDows", "hightlight"));
//        System.out.println(text.length());
//
//        int a = 10;
//        int b = 20;
//        int soucet = a + b;
//        System.out.printf("Když sečteme %.2f a %S, dostaneme %d", 5.8, "easy", soucet);

//        Scanner sken = new Scanner(System.in);
//        String jmeno = sken.nextLine();
//        String prijmeni = sken.nextLine();
//        int vek = Integer.parseInt(sken.nextLine());
//        System.out.println("Tvoje fullname je: " + jmeno.toUpperCase() + " " + prijmeni.toUpperCase());
//        System.out.println("Za rok ti bude: " + ( vek + 1) );


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Zadejte delší slovo: ");
//        String delsiSlovo = scanner.nextLine();
//
//        System.out.println("Zadejte kratší slovo: ");
//        String kratsiSlovo = scanner.nextLine();
//
//        System.out.println("Slova se liší délkou o " + (delsiSlovo.length() - kratsiSlovo.length()) + " znaků");



///////////Řešené úlohy k 7.-8. lekci Javy

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Zadej své jméno: ");
//        String jmeno = scanner.nextLine();
//
//        if (jmeno.length() > 3 && jmeno.length() < 10) {
//            System.out.println("Normální jméno.");
//        } else {
//            System.out.println("Máš moc krátké nebo moc dlouhé jméno!");
//        }


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Zadej smajlíka: ");
//        String smajlik = scanner.nextLine();
//        switch (smajlik) {
//            case ":-)":
//            case ":)":
//                System.out.println("Tvůj smajlík je veselý");
//                break;
//            case ":-(":
//                System.out.println("TTvůj smajlík je smutný");
//                break;
//            case ":-*":
//                System.out.println("Tvůj smajlík je zamilovaný");
//                break;
//            default:
//                System.out.println("Tvůj smajlík je neznámý");
//                break;
//        }
//////////
        ///while cycle

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Vítejte v kalkulačce");
//
//        String pokracovat = "ano";
//        while (pokracovat.equals("ano")){
//            System.out.println("Zadejte první číslo:");
//            double a = Double.parseDouble(scanner.nextLine());
//            System.out.println("Zadejte druhé číslo:");
//            double b = Double.parseDouble(scanner.nextLine());
//            System.out.println("Zvolte si operaci:");
//            System.out.println("1 - sčítání");
//            System.out.println("2 - odčítání");
//            System.out.println("3 - násobení");
//            System.out.println("4 - dělení");
//            int volba = Integer.parseInt(scanner.nextLine());
//            double vysledek = 0;
//            switch (volba) {
//                case 1:
//                    vysledek = a + b;
//                    break;
//                case 2:
//                    vysledek = a - b;
//                    break;
//                case 3:
//                    vysledek = a * b;
//                    break;
//                case 4:
//                    vysledek = a / b;
//                    break;
//            }
//            if ((volba > 0) && (volba < 5)) {
//                System.out.println("Výsledek: " + vysledek);
//            } else {
//                System.out.println("Neplatná volba");
//            }
//            System.out.println("Prejete si zadat dalsi priklad? [ano/ne]");
//            pokracovat = scanner.nextLine();
//        }
//        System.out.println("Děkuji za použití kalkulačky.");


///////////Řešené úlohy k 9.-10. lekci Javy
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Kolik ryb si dáš k večeři?");
//        int pocet = Integer.parseInt(scanner.nextLine());
//        for (int i = 0; i < pocet; i++){
//            System.out.println("<° )))-<");
//        }

//        for (int i = 10; i > 0; i--) {
//            switch (i) {
//                case 4:
//                case 3:
//                case 2:
//                    System.out.println(i + " zelené láhve stojí na stole a jedna láhev spadne");
//                    break;
//                case 1:
//                    System.out.println(i + " zelená láhev stojí na stole a jedna láhev spadne");
//                    break;
//                default:
//                    System.out.println(i + " zelených láhví stojí na stole a jedna láhev spadne");
//                    break;
//            }
//        }

//    int i = 1;
//    while (i <= 6) {
//        int j = 1;
//        while(j < 6) {
//            System.out.println("(" + i + ", " + j + ")");
//            j++;
//        }
//        i++;
//    }



        //////////Pole
//        //deklarace
//        int[] cisla;
//        ///zalozeni
//
//
//        int[] cisla = new int[3];
//        cisla[0] = 1;

//        int[] cisla = new int[10];
//
//        for (int i = 0; i<10;i++) {
//            cisla[i] = i+1;
//        }
//        for (int i = 0; i<cisla.length;i++) {
//            System.out.print(cisla[i] + " ");
//        }
//        for(int cislo :cisla){
//            System.out.print(cislo);
//        }
////Naplnění pole ručně a sort

//        String[] simpsonovi = {"Homer", "Marge", "Bart", "Lisa", "Maggie", "Bart", "Antony"};
//        int[] numbers = {45,65,23,1,34,55};
//        Arrays.sort(simpsonovi);
//        Arrays.sort(numbers);
//        for (String simpson : simpsonovi) {
//            System.out.print(simpson + " ");
//        }
//        for (int number : numbers) {
//            System.out.println(number);
//        }
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Ahoj, spočítám ti průměr známek. Kolik známek zadáš?");
//        int pocetZnamek = Integer.parseInt(scanner.nextLine());



        ////Řešené úlohy k 11. lekci Javy

//        Scanner scanner = new Scanner(System.in);
//        String[] zelenina = {"zelí", "okurka", "rajče", "paprika", "ředkev", "mrkev", "brokolice"};
//        String[] ovoce = {"jablko", "hruška", "pomeranč", "jahoda", "banán", "kiwi", "malina"};
//
//        int pocetSlov = 0;
//        String volba = "ano";
//
//        while (volba.equals("ano")) {
//            System.out.println("Zadej název libovolného ovoce nebo zeleniny: ");
//            String vyber = scanner.nextLine().toLowerCase();
//
//            boolean nalezenaOvoce = false;
//            boolean nalezenaZelenina = false;
//
//            for (String item : ovoce) {
//                if (item.equals(vyber)) {
//                    System.out.println("Zadal jsi ovoce");
//                    nalezenaZelenina = true;
//                }
//            }
//
//            for (String item : zelenina) {
//                if(item.equals(vyber)) {
//                    System.out.println("Zadal jsi zeleninu");
//                    nalezenaZelenina = true;
//                }
//            }
//
//            if (!nalezenaOvoce && !nalezenaZelenina) {
//                System.out.println("Tvoje slovo nemám v seznamu");
//            }
//
//            pocetSlov++;
//
//            System.out.println("Přeješ si zadat další slovo? (ano/ne)");
//            volba = scanner.nextLine().trim().toLowerCase();
//
//        }
//
//        System.out.println("Zadal jsi " + pocetSlov + " slov");


//////// Textové řetězce v Javě podruhé - Práce s jednotlivými znaky

//        String jazyk = "Java";
//        System.out.println(jazyk);
//        System.out.println(jazyk.charAt(0)); ////index 0 = J
//        System.out.println(jazyk.indexOf("J")); ////jaky index ma J

////Analýza výskytu znaků ve větě
// řetězec, který chceme analyzovat
//        String hora = "Mount Everest";
//        System.out.println(hora);
//        hora = hora.toLowerCase();
//
//        int pocetSamohlasek = 0;
//        int pocetSouhlasek = 0;
//
//        String samohlasky = "aeiouyáéěíóúůý";
//        String souhlasky = "bcčdďfghjklmnpqrřsštťvwxzž";
//
//        for (char znak : hora.toCharArray()) {
//            if (samohlasky.contains(String.valueOf(znak))) {
//                pocetSamohlasek++;
//            } else if (souhlasky.contains(String.valueOf(znak))) {
//                pocetSouhlasek++;
//            }
//        }
//
//        System.out.printf("Samohlásek: %d%n", pocetSamohlasek);
//        System.out.printf("Souhlásek: %d%n", pocetSouhlasek);
//        System.out.printf("Nepísmenných znaků: %d%n", hora.length() - (pocetSamohlasek + pocetSouhlasek));

//////ASCII hodnota
//        char znak = 'a';
//        int hodnotaAscii;
//        hodnotaAscii = (int)znak;
//
//        System.out.printf("%c %d", znak, hodnotaAscii);
//
//        hodnotaAscii = 100;
//        znak = (char)hodnotaAscii;
//
//        System.out.printf("%c %d", znak, hodnotaAscii);


///////Caesarova šifra
//        String puvodniZprava = "zebra";
//        System.out.printf("Původní zpráva: %s%n", puvodniZprava);
//        String zasifrovanaZprava = "";
//        int posun = 1;
//
//// cyklus projíždějící jednotlivé znaky
//        for (char znak : puvodniZprava.toCharArray()) {
//
//
//            int hodnotaAscii = (int)znak;
//            hodnotaAscii += posun;
//            if (hodnotaAscii > (int)'z') {
//                hodnotaAscii -=26;
//            }
//            znak = (char)hodnotaAscii;
//            zasifrovanaZprava += znak;
//
//
////            ///druhy zpusob
////            int ascii = (int)znak;
////            ascii += posun;
////            // kontrola přetečení
////            if (ascii > (int)'z') {
////                ascii -= 26;
////            }
////            znak = (char)ascii;
////            zasifrovanaZprava += znak;
//
//        }
//
//// výpis
//        System.out.printf("Zašifrovaná zpráva: %s%n", zasifrovanaZprava);

////Řešené úlohy k 13. lekci Javy

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Zadej palindrom: ");
//        String slovo = scanner.nextLine().toLowerCase();
//
//        String slovoPozpatku = "";
//
//        for (int i = slovo.length()-1; i >= 0; i--) {
//            slovoPozpatku += slovo.charAt(i);
//        }
//        if (slovoPozpatku.equals(slovo)) {
//            System.out.println("Ano, toto je palindrom.");
//        } else {
//            System.out.println("Toto není palindrom.");
//        }
/////////

////Dekodér Morseovy abecedy
//Zdroj: https://www.itnetwork.cz/java/zaklady/java-tutorial-textove-retezce-do-tretice-split
//        String sifrovanaZprava = ".-.. . --- -. .- .-. -.. ---";
//        System.out.printf("Původní zpráva: %s%n", sifrovanaZprava);
//
//        String dekodovanaZprava = "";
//
//
//        // vzorová pole
//        String abeceda = "abcdefghijklmnopqrstuvwxyz";
//        String[] morseovyZnaky = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
//                "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-",
//                "...-", ".--", "-..-", "-.--", "--.."};
//
//// rozbití řetězce na znaky morseovky
//        String[] znaky = sifrovanaZprava.split(" ");
//
//// iterace znaky morseovky
//        for (String morseuvZnak : znaky) {
//            char abecedniZnak = '?';
//
//            int index = 1;
//            for (int i = 0; i < morseovyZnaky.length; i++) {
//                if (morseovyZnaky[i].equals(morseuvZnak)) {
//                    index = i;
//                }
//            }
//
//            if (index >= 0) { // znak nalezen
//                abecedniZnak = abeceda.charAt(index);
//            }
//            dekodovanaZprava += abecedniZnak;
//
//        }
//        System.out.printf("Dekódovaná zpráva: %s%n", dekodovanaZprava);

//////Retezec do Morseovky


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Zadejte zprávu k zakódování:");
//        String vstupniZprava = scanner.nextLine().toLowerCase().trim();
//
//        String zakodovanaZprava = "";
//
//        String abeceda = "abcdefghijklmnopqrstuvwxyz";
//        String[] morseovyZnaky = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
//                "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-",
//                "...-", ".--", "-..-", "-.--", "--.."};
//
//        for (int i = 0; i < vstupniZprava.length(); i++) {
//            char c = vstupniZprava.charAt(i); //zjisit jake pismeno je na indexu i ve vstupni zprave
//            int index = abeceda.indexOf(c); ///zjisit jaky index je pismeno c ve abecede
//
//            if (index != -1) {
//                zakodovanaZprava += morseovyZnaky[index] + " ";
//            }
//        }
//        System.out.println("Zakódovaná zpráva: " + zakodovanaZprava);

////////////Ternární operátor
//Zdroj: https://www.itnetwork.cz/java/zaklady/podminky-v-jave-podruhe-ternarni-vyraz-propadavaci-switch
//    boolean zena = false;
//    String pohlavi = (zena) ? "zena" : "muz";
//        System.out.println(pohlavi);
//
//String smajlik = ":(";
//String nalada = (smajlik.equals(":)")) ? "vesely" : (smajlik.equals(":(")) ? "smutny" : "neznamy";
//        System.out.println(nalada);

//
//        int mesic = 11;
//        switch (mesic) {
//            case 1, 2, 3 -> System.out.println("Je první čtvrtletí.");
//            case 4, 5, 6 -> System.out.println("Je druhé čtvrtletí.");
//            case 7, 8, 9 -> System.out.println("Je třetí čtvrtletí.");
//            case 10, 11, 12 -> System.out.println("Je čtvrté čtvrtletí.");


//////////STRING
//            String seznamOvoce = "Jablka,Hrušky,Švestky,Meruňky,Jahody,Třešně";
//            String []pole = seznamOvoce.split(",");
//            int hledanyIndex = -1;
//
//        for (int i = 0; i < pole.length; i++) {
//            if (pole[i].length() > 6) {
//                hledanyIndex = i;
//                break;
//            }
//        }
//        if (hledanyIndex >= 0) {
//            System.out.println("První slovo delší než 6 znaků: " + pole[hledanyIndex]);
//        }


////////////POLE
//        String[] seznamOvoce = {"Jablka", "Hrušky", "Švestky", "Meruňky", "Jahody", "Třešně"};
//        int hledanyIndex = -1;
//
//        for (int i = 0; i < seznamOvoce.length; i++) {
//            if (seznamOvoce[i].length() > 6) {
//                hledanyIndex = i;
//                break;
//            }
//        }
//        if (hledanyIndex >= 0) {
//            System.out.println("První slovo delší než 6 znaků: " + seznamOvoce[hledanyIndex]);
//        }
//    }
//}


//        int soucet = 10;
//        int pocet = 4;
//        double prumer = (double)soucet / pocet;
//        System.out.println(prumer);
//
//        ////////SORTING   - SELECTION SORT
//
//        int [] nahodnaCisla = {3,5,26,7,9,48};





////////////////Řešené úlohy k 17.-19. lekci Javy
/////////Sachovnice


        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("██");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


    }
}
