package cz.itnetwork;

public class Osoba {
    /**
     * Celé jméno osoby
     */
    public String jmeno;

    /**
     * Pes, který patří této osobě
     */
    public Pes pes; // Přidali jsme zde atribut pro psa

    /**
     * Konstruktor třídy Osoba
     * @param jmeno Jméno osoby
     * @param pes Odkaz na objekt typu Pes
     */
    public Osoba(String jmeno, Pes pes) {
        // Nastavení jména osoby
        this.jmeno = jmeno;
        // Nastavení psa, který patří této osobě
        this.pes = pes;
    }
}
