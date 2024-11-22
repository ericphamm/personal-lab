public class Planeta {

    private String nazev;
    private int prumer;
    private int pocetMesicu;
    private boolean jeKamenna;
    private int teplota;


    public Planeta(String nazev, int prumer, int pocetMesicu, boolean jeKamenna, int teplota) {
        this.jeKamenna = jeKamenna;
        this.nazev = nazev;
        this.pocetMesicu = pocetMesicu;
        this.teplota = teplota;
        this.prumer = prumer;
    }


    public String getNazev() { return this.nazev; }
    public int getPrumer() { return this.prumer; }
    public int getPocetMesicu() { return this.pocetMesicu; }
    public boolean jeKamenna() { return this.jeKamenna; }
    public int getTeplota() { return this.teplota; }

    @Override
    public String toString() {
        return nazev;
    }
}