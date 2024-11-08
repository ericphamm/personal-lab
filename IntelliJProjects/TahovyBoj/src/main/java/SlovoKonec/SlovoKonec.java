package SlovoKonec;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SlovoKonec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> slova = new ArrayList<>();
        String slovo = "";
        while (!slovo.equals("konec")) {
            System.out.print("Zadej slovo: ");
            slovo = scanner.nextLine().toLowerCase().trim();

            if (!slovo.equals("konec") && !slova.contains(slovo)) {
                slova.add(slovo);
            }
        }


        System.out.println("Zadal jsi tato slova: " + String.join(", ", slova));

    }
}
