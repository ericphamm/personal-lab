import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Osoba Jiri = new Osoba("Jiří", Arrays.asList("česky", "anglicky", "rusky"));
        Osoba Hynek = new Osoba("Hynek", Arrays.asList("česky", "rusky"));
        Osoba Peter = new Osoba("Peter", Arrays.asList("slovensky", "anglicky"));
        Osoba Simona = new Osoba("Simona", Arrays.asList("česky", "anglicky"));
        Osoba Terezie = new Osoba("Terézia", Arrays.asList("slovensky", "německy", "rusky"));
        Osoba Viktor = new Osoba("Viktor", Arrays.asList("česky", "anglicky"));
        Osoba Roman = new Osoba("Roman", Arrays.asList("česky", "anglicky", "německy"));
        Osoba Julie = new Osoba("Julie", Arrays.asList("česky", "německy", "španělsky"));

        Collection<Osoba> osoby = Arrays.asList(Hynek, Jiri, Julie, Peter, Roman, Simona, Terezie, Viktor);

//        System.out.println("Osoby hovořící" );
//        osoby.stream()
//                .filter(osoba -> osoba.getJazyky().contains("česky") && osoba.getJazyky().contains("německy"))
//                .collect(Collectors.toList())
////                .forEach(jmeno -> {
////                    System.out.print(jmeno);
////                })
//                .forEach(System.out::print);


        System.out.println("Osoby hovořící česky:\n " + groupPeopleByLanguage(osoby, "česky") + ",");
        System.out.println("Osoby hovořící německy:\n " + groupPeopleByLanguage(osoby, "německy") + ",");
        System.out.println("Osoby hovořící anglicky:\n " + groupPeopleByLanguage(osoby, "anglicky") + ",");
        System.out.println("Osoby hovořící rusky:\n " + groupPeopleByLanguage(osoby, "rusky") + ",");
        System.out.println("Osoby hovořící španělsky:\n " + groupPeopleByLanguage(osoby, "španělsky") + ",");




    }

    private static String groupPeopleByLanguage(Collection<Osoba> osoby, String language) {
        return osoby.stream()
                .filter(osoba -> osoba.getJazyky().contains(language))
                .map(Osoba::getJmeno) // ziskat jmeno
                .collect(Collectors.joining(", ")); // join osoby s carkami
    }
}
