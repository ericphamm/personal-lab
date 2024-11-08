package DatumACas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;
import java.util.Scanner;

public class Patek13 {
    public static void main(String[] args) {
        DateTimeFormatter formatData = DateTimeFormatter.ofPattern("d.M.yyyy");

        // Zadání dat
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pro zadaný interval datumů vypíše všechny pátky 13.:");
        System.out.println("Zadejte 1. datum: ");
        String prvniInput = scanner.nextLine();
        LocalDate prvniDatum = LocalDate.parse(prvniInput, formatData);
        System.out.println("Zadejte 2. datum: ");
        String druheInput= scanner.nextLine();
        LocalDate druheDatum = LocalDate.parse(druheInput, formatData);


        LocalDate den = prvniDatum;
        while (!den.isAfter(druheDatum)) {
            if (den.getDayOfMonth() == 13 && den.getDayOfWeek()== DayOfWeek.FRIDAY) {
                System.out.print(den.format(formatData) + ", ");
            }
            den = den.plusDays(1);
        }
    }
}
