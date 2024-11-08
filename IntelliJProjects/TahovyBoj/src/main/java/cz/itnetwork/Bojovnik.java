package cz.itnetwork;

public class Bojovnik {
    protected String jmeno;

    protected int zivot;

    protected int maximalniZivot;

    protected int utok;

    protected int obrana;

    protected Kostka kostka;

    private String zprava;

    public Bojovnik(String jmeno, int zivot, int utok, int obrana, Kostka kostka) {
        this.jmeno = jmeno;
        this.zivot = zivot;
        this.maximalniZivot = zivot;
        this.utok = utok;
        this.obrana = obrana;
        this.kostka = kostka;
    }

    @Override
    public String toString() {
        return jmeno + " Zivot: " + zivot + " Utok: " + utok + " Obrana: " + obrana;
    }

    public boolean jeZivy() {
        if (zivot > 0) {
            return true;
        } else {
            return false;
        }
    }

    protected String grafickyUkazatel(int aktualni, int maximalni) {
        String grafickyZivot = "[";
        int celkem = 20;
        double pocetDilku = Math.round(((double) aktualni / maximalni) * celkem);
        if ((pocetDilku == 0) && (jeZivy())) {
            pocetDilku = 1;
        }
        for (int i = 0; i < pocetDilku; i++) {
            grafickyZivot += "█";
        }
        for (int i = 0; i < celkem - pocetDilku; i++) {
            grafickyZivot += " ";
        }
        grafickyZivot += "]";
        return grafickyZivot;
    }

    public String grafickyZivot() {
        return grafickyUkazatel(zivot, maximalniZivot);
    }

    public void branSe(int uder) {
        int zraneni = uder - (obrana + kostka.hod());
        if (zraneni > 0) {
            zivot -= zraneni;
            zprava = String.format("%s utrpěl poškození %s hp", jmeno, zraneni);
            if (zivot <= 0) {
                zivot = 0;
                zprava += " a zemřel";
            }
        } else {
            zprava = String.format("%s odrazil útok", jmeno);
        }
        nastavZpravu(zprava);
    }

    public void utoc(Bojovnik souper) {
        int uder = utok + kostka.hod();
        nastavZpravu(String.format("%s utoci s uderem za %s hp",jmeno, uder));
        souper.branSe(uder);
    }

    protected void nastavZpravu(String zprava) {
        this.zprava = zprava;
    }

    public String vratPosledniZpravu() {
        return zprava;
    }


}
