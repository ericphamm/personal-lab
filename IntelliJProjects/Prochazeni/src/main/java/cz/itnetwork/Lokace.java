package cz.itnetwork;

public class Lokace {
    /**
     * Lokace na severu
     */
    public Lokace sever;

    /**
     * Lokace na jihu
     */
    public Lokace jih;

    public Lokace zapad;

    public Lokace vychod;

    public String nazev;

    public String popis;

    public Lokace (String nazev, String popis) {
        this.nazev = nazev;
        this.popis = popis;
    }

    public String toString() {
        String vystup = nazev + "\n";
        vystup += popis + "\n";
        String smer = "";
        vystup += "Muzes jit na: ";
        if (sever != null) {
            smer += "sever";
        }
        if (jih != null) {
            smer += "jih";
        }
        if (vychod != null) {
            smer += "vychod";
        }
        if (zapad != null) {
            smer += "zapad";
        }
        if (!vystup.equals("")) {
            vystup += "muzes jit na " + smer + "\n";
        }
        return vystup;
    }



}