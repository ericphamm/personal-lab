import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> jmena = Arrays.asList("David", "Martin", "Dan", "Petr", "Vratislav", "Eliska");

        jmena.stream()
                .filter(jmeno -> jmeno.length() > 5)
                .collect(Collectors.toList())
                .forEach(System.out::println);

// Výsledek


    }
}
