package cz.itnetwork;

public class Main {
    public static void main(String[] args) {
        Krabice<Boty> box1 = new Krabice<>(new Boty("tenisky", 39));
        Krabice<Kniha> box2 = new Krabice<>(new Kniha("Proměna"));
        Krabice<Lahev> box3 = new Krabice<>(new Lahev("termoska", 1.5));
        Krabice<Boty> box4 = new Krabice<>(new Boty("zimní boty", 42));

        System.out.println("V první krabici jsou " + box1.getPolozka().ziskejNazev() + " velikosti " + box1.getPolozka().ziskejVelikost());
        System.out.println("Ve druhé krabici je kniha s názvem " + box2.getPolozka().ziskejNazev());
        System.out.println("Ve třetí krabici je " + box3.getPolozka().ziskejNazev() + " o objemu " + box3.getPolozka().ziskejObjem() + " l");
        System.out.println("Ve čtvrté krabici jsou " + box4.getPolozka().ziskejNazev() + " velikosti " + box4.getPolozka().ziskejVelikost());

    }
}
