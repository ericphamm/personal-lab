package cz.itnetwork;

public class Clovek {
    /**
     * Celé jméno
     */
    private String jmeno;

    /**
     * Věk
     */
    private int vek;

    /**
     * Únava
     */
    public Clovek(String jmeno, int vek) {
        this.jmeno = jmeno;
        this.vek = vek;
    }
    private int unava = -10;

    public int behej(int vzdalenost) {
        if (unava + vzdalenost <= 20) {
            unava += vzdalenost;
            System.out.print("Ubehl jsem " + vzdalenost + " km. ");
            System.out.println("Unava level: " + unava);
            return unava;
        }
        else {
            System.out.println("Jsem příliš unavený");
            return unava;
        }
    }

    public int spi(int cas) {
        return unava -= (10 * cas);
    }
    @Override
    public String toString() {
        return String.format("%s (%d)",jmeno, vek);
    }
}
