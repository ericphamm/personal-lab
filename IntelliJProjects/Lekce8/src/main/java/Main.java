import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        List<String> jmena = Arrays.asList("David", "Martin", "Dan", "Petr", "Vratislav", "Eliska");
//
//        jmena.stream()
//                .filter(jmeno -> jmeno.length() > 5)
//                .collect(Collectors.toList())
//                .forEach(System.out::println);

//
//        String[] pole = new String[] {"pepa", "karel", "michal"};
//        Stream<String> stream = Stream.of(pole);
//        stream.forEach(System.out::println);


//        DoubleStream.generate(Math::random).limit(5).forEach(System.out::println);

//        DoubleStream.iterate(10, operand -> operand / 2).limit(10).forEach(System.out::println);


//        Random random = new Random();
//        random.ints(10, 0, 20).forEach(System.out::println);


        int[] cisla = new int[] {1, 5, 9, 7, 5, 2, 3, 6};
        OptionalInt optionalMin = Arrays.stream(cisla).min();
        OptionalInt optionalMax = Arrays.stream(cisla).max();
        optionalMin.ifPresent(System.out::println);
        optionalMax.ifPresent(System.out::println);

    }
}
