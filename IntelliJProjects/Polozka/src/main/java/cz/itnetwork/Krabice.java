package cz.itnetwork;

public class Krabice<T extends IPolozka> {

    public T Polozka;

    public Krabice(T polozka) {
        this.Polozka = polozka;
    }

    //getter for T Polozka
    public T getPolozka() {
        return Polozka;
    }
}
