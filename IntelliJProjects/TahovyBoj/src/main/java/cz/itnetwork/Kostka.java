package cz.itnetwork;

import java.util.Random;

public class Kostka {
    /**
     * Generator nahodnycch cisel
     * Random : Datovy typ
     * random : atribut
     */
    private Random random;

    /**
     * Počet stěn kostky
     */
    private int pocetSten;

    /**
     * Vytvoří novou instanci hrací kostky.
     * V konstruktoru Kostka() nastavíme počet stěn na pevnou hodnotu a
     * vytvoříme instanci třídy Random
     */
    public Kostka(int PocetSten) {
        this.pocetSten = PocetSten;
        random = new Random();
    }
    public Kostka() {
        pocetSten = 10;
        random = new Random();
    }
    /**
     * Vrátí počet stěn hrací kostky
     * @return Počet stěn hrací kostky
     */
    public int vratPocetSten() {
        return pocetSten;
    }
    /**
     * Vykoná hod kostkou
     * @return Číslo od 1 do počtu stěn, to je od 1 do pocetSten=6
     */
    public int hod() {
        return random.nextInt(pocetSten) + 1;
    }
    /**
     * Vrací textovou reprezentaci kostky
     * @return Textová reprezentace kostky
     */
    @Override
    public String toString() {
        return String.format("Kostka s %s stenami", pocetSten);
    }
}
