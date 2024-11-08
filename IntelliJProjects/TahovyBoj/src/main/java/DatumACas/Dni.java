package DatumACas;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Dni {
    public static void main(String[] args) {

        System.out.println("Vypisuji součty cifer v datu pro následujících 7 dní");
        DateTimeFormatter formatData = DateTimeFormatter.ofPattern("d.M.yyyy");

        LocalDate dnes = LocalDate.now();
        for (int i = 0; i < 7; i++) {
            LocalDate dny = dnes.plusDays(i);
            String formatDny = dny.format(formatData);
            System.out.println(formatDny + " - " + (dny.getYear() + dny.getMonthValue() + dny.getDayOfMonth()));

        }
    }
}

