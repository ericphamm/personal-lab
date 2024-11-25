import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] kategorie = { "ovoce a zelenina", "luštěniny", "pečivo", "mléčné výrobky", "maso", "sladkosti", "nápoje", "ostatní" };

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < kategorie.length; i++) {
            System.out.println("[" + i + "]: " + kategorie[i]);
        }

        List<Polozka> polozkaList = new ArrayList<>();

        System.out.println("-------------------------------------");
        boolean pokracovat = true;
        while (pokracovat)
        {
            System.out.print("Položka: ");
            String polozka = scanner.nextLine();

            boolean jeSpravne = false;
            while (!jeSpravne) {
                try {
                    System.out.print("Kategorie: ");
                    int kategorieInput = Integer.parseInt(scanner.nextLine());
                    if (kategorieInput >= kategorie.length || kategorieInput < 0) {
                        throw new Exception();
                    }
                    polozkaList.add(new Polozka(polozka, kategorie[kategorieInput]));
                    jeSpravne = true;
                } catch (Exception e) {
                    System.out.println("zadej znovu");
                }
            }

            System.out.print("Přidat další položku [ano/ne]: ");
            String volba = scanner.nextLine();

            if (!volba.equalsIgnoreCase("ano")) {
                pokracovat =false;
            }
        }
        System.out.println("-------------------------------------");


        for (String kazdaKategorie : kategorie) {
            //prozatimni list na polozky v kazde jednotlive kategorie
            List<String> itemsInCategory = new ArrayList<>();

            for (Polozka item : polozkaList) {
                if (item.getKategorie().equals(kazdaKategorie)) {
                    itemsInCategory.add(item.getNazev());
                }
            }

            System.out.print(kazdaKategorie.toUpperCase() + ": ");

            if (itemsInCategory.isEmpty()) {
                System.out.println("-");
            } else {
                System.out.println(String.join(", ", itemsInCategory));
            }
        }

    }
}
