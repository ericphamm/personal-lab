import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Programator> programatori = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            System.out.println("Zadejte " + i + ". programátora");
            String jmeno = scanner.nextLine();

            System.out.println("Programovací jazyky (oddělujte čárkou a mezerou):");
            String jazykVstup = scanner.nextLine();
            String[] jazyky = jazykVstup.split(",\\s*");


            Programator programator = new Programator(jmeno, jazyky);
            programatori.add(programator);
        }

        HashSet<String> sjednoceni = new HashSet<>();
        for (Programator i : programatori) {
            sjednoceni.addAll(i.getProgramovaciJazyky());
        }
        System.out.println(sjednoceni);

        HashSet<String> prunik = new HashSet<>(programatori.get(1).getProgramovaciJazyky());
        for (int i = 1; i < programatori.size(); i++) {
            prunik.retainAll(programatori.get(i).getProgramovaciJazyky());
        }
        System.out.println("Společné jazyky: " + prunik);
        for (String i : prunik) {
            System.out.println(i);
        }




    }
}
