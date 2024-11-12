package cz.itnetwork;

public class Boty implements IPolozka{
    private String Nazev;
    private int Velikost;

    public Boty(String Nazev, int Velikost) {
        this.Nazev = Nazev;
        this.Velikost = Velikost;
    }

    public String ziskejNazev() {
        return Nazev;
    }

    public int ziskejVelikost() {
        return Velikost;
    }
}
