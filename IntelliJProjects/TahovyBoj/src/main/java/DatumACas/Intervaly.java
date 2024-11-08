package DatumACas;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;

public class Intervaly {
    public static void main(String[] args) {
        LocalTime cas = LocalTime.parse("10h:20m:30s", DateTimeFormatter.ofPattern("H'h':m'm':ss's'"));
        System.out.println(cas);

    }
}
