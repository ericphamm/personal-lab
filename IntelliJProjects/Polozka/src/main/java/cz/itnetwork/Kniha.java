package cz.itnetwork;

public class Kniha implements IPolozka{
    private String Nazev;

    public Kniha(String Nazev) {
        this.Nazev = Nazev;
    }

    @Override
    public String ziskejNazev() {
        return Nazev;
    }
}
