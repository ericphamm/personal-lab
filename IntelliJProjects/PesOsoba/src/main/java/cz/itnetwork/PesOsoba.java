package cz.itnetwork;

public class PesOsoba {
    public static void main(String[] args) {

        // Vytvoření nového psa se jménem "Azor"
        Pes azor = new Pes("Azor");

        // Vytvoření dvou osob, které sdílejí stejného psa
        Osoba karel = new Osoba("Karel", azor); // Karel vlastní Azora
        Osoba lenka = new Osoba("Lenka", azor); // Lenka také vlastní Azora

        // Necháme psa zestárnout o jeden rok prostřednictvím osoby Karel
        karel.pes.zestarni(); // Zestárnutí Azora o 1 rok
        // Vypíšeme aktuální stav psa (jméno a věk)
        System.out.println(azor);

        // Necháme psa zestárnout o další jeden rok prostřednictvím osoby Lenka
        lenka.pes.zestarni(); // Další zestárnutí Azora o 1 rok
        // Vypíšeme aktuální stav psa (jméno a věk)
        System.out.println(azor);
        // Nyní by měl být Azor o 2 roky starší než na začátku
    }
}
