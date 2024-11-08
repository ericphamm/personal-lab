package DatumACas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;

public class DatumACas {
    public static void main(String[] args) {

        Integer[] pole = {0, 0, 0, 1, 1, 0, 0, 1, 1};
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(pole));
        System.out.println(list.lastIndexOf(1));


    }

}
