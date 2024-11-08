package cz.itnetwork;

public class Pes {
    /**
     * Jméno psa
     */
    private String jmeno;

    /**
     * Věk psa
     */
    private int vek = 1; // Výchozí hodnota věku psa je nastavena na 1

    /**
     * Konstruktor třídy Pes
     * @param jmeno Jméno psa
     */
    public Pes(String jmeno) {
        // Nastavení jména psa
        this.jmeno = jmeno;
    }

    /**
     * Metoda, která nechá psa zestárnout o jeden rok
     */
    public void zestarni() {
        // Zvětší aktuální věk psa o 1
        vek += 1;
    }

    /**
     * Metoda pro získání aktuálního věku psa
     * @return Věk psa
     */
    public int ziskatVek() {
        // Vrací aktuální věk psa
        return vek;
    }

    /**
     * Přepsaná metoda toString pro vrácení textové reprezentace psa
     * @return Textová reprezentace psa obsahující jméno a věk
     */
    @Override
    public String toString() {
        // Vrací řetězec obsahující jméno psa a jeho věk ve formátu "jméno (věk let)"
        return jmeno + " (" + vek + " let)";
    }
}
