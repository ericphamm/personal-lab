package nakladak;

public class Main {
    public static void main(String[] args) {
        Nakladak nakladak = new Nakladak(3000);

        nakladak.naloz(100);

        try {
            nakladak.vyloz(200);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        nakladak.naloz(100);
        nakladak.vypis();

    }
}
