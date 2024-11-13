import java.util.Scanner;
import java.time.LocalDate;
import java.util.LinkedList;

public class Denik {

    private LinkedList<Zaznam> zaznamy = new LinkedList<>() ;

    Scanner scanner = new Scanner(System.in);

    public void Program() {
        String volba = "";

        while (!volba.equals("zavri")) {
            VytiskniMenu();

            System.out.println("------------------------------------------");
            System.out.println("Počet záznamů: " + zaznamy.size());
            System.out.println("------------------------------------------");

            //Zkontroluje jestli mame nejake zaznamy a pak zobrazit posledni zaznam
            if (!zaznamy.isEmpty()) {
                System.out.println("------------------------------------------");
                System.out.println("Poslední záznam:");
                System.out.println(zaznamy.getLast()); // Display the most recent entry (formatted by toString)
                System.out.println("------------------------------------------");
            }

            System.out.println("Zadejte příkaz: ");

            volba = scanner.nextLine();

            //Prikaz novy
            if (volba.equals("novy")) {
                System.out.println("Zadejte text k záznamu:");
                String text = scanner.nextLine();
                Zaznam zaznam = new Zaznam(text);
                zaznamy.add(zaznam);
                System.out.println("Záznam byl vytvořen");
            }

            // Prikaz zaznamy
            if (volba.equals("zaznamy")) {
                if (zaznamy.isEmpty()) {
                    System.out.println("Nejsou zaznamy");
                } else {
                    System.out.println("------------------------------------------");
                    System.out.println("Počet záznamů: " + zaznamy.size());
                    System.out.println("------------------------------------------");

                    for (int i = 0; i < zaznamy.size(); i ++) {
                        Zaznam z = zaznamy.get(i);
                        System.out.println("Záznam [" + i + "] vytvořen " + z.getDatum() + ":");
                        System.out.println(z.getText());
                        System.out.println("------------------------------------------");
                    }
                }
            }

            //Prikaz smaz
            if (volba.equals("smaz")) {
                System.out.println("------------------------------------------");
                System.out.println("Počet záznamů: " + zaznamy.size());
                System.out.println("------------------------------------------");
                System.out.println("------------------------------------------");

                for (int i = 0; i < zaznamy.size(); i++) {
                    Zaznam z = zaznamy.get(i);
                    System.out.println("Záznam [" + i + "] vytvořen " + z.getDatum() + ":");
                    System.out.println(z.getText());
                    System.out.println();
                    System.out.println("------------------------------------------");
                }

                Integer index = null;
                while (index == null) {
                    System.out.println("Jaký záznam si přejete vymazat?");
                    System.out.println("- pro vymazání záznamu zadejte index záznamu, například => 1");
                    System.out.println("Záznam k vymazání: ");

                    try {
                        index = Integer.parseInt(scanner.nextLine());
                        if (index >= 0 && index < zaznamy.size()) {
                            zaznamy.remove((int)index);
                        } else {
                            index = null;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Zadaná hodnota neodpovídá indexu žádného ze záznámů");
                        index = null;
                    }
                }

            }


            if (volba.equals("hledat")) {
                System.out.println("Napis zaznam");
                String hledanyText = scanner.nextLine();
                for (int i = 0; i < zaznamy.size(); i++) {
                    Zaznam z = zaznamy.get(i);
                    if (z.getText().contains(hledanyText)) {
                        System.out.println("Zaznam ulozeno na indexu" + i);
                        System.out.println(z);
                    }
                }
            }


        }
    }

    void VytiskniMenu() {
        System.out.println("----------------   MENU   ----------------");
        System.out.println("Deník se ovládá následujícími příkazy:");
        System.out.println("- novy: Vytvoření nového záznamu");
        System.out.println("- zaznamy: Zobrazí všechny záznamy");
        System.out.println("- smaz: Odstranění záznamu");
        System.out.println("- hledat: Hledat zaznamu");
        System.out.println("- zavri: Zavření deníku a ukončení programu");
        System.out.println("----------------   MENU   ----------------");

    }
}

