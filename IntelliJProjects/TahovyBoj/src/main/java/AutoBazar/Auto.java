package AutoBazar;

public class Auto {

    public String spz;

    public String znacka;

    protected int cena;

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public Auto(String spz, String znacka, int cena) {
        this.spz = spz;
        this.znacka = znacka;
        this.cena = cena;
    }
}
