package cz.itnetwork;

import java.util.ArrayList;

public class TahovyBoj {
    public static void main(String[] args) {

        // vytvoření kostek
        /**
         * Vytvoreni instatnce kostky
         * Kostka() je konstruktor
         */
//        Kostka sestistenna = new Kostka(6); // v tuto chvíli se zavolá konstruktor
//
//        Kostka desetistenna = new Kostka();
//
//        // hod šestistěnnou kostkou
//        System.out.println(sestistenna);
//        for (int i = 0; i < 10; i++) {
//            System.out.print(sestistenna.hod() + " ");
//        }
//        System.out.println();
//        System.out.println(desetistenna);
//        for (int i = 0; i < 10; i++) {
//            System.out.print(desetistenna.hod() + " ");
//        }
//        System.out.println();

        Kostka kostka = new Kostka();
        Bojovnik jackiChan = new Bojovnik("Jacki Chan", 100, 30, 20, kostka);
        Bojovnik gandalf = new Mag("Gandalf",100, 15, 10, kostka, 30,70);
        Arena arena = new Arena(jackiChan,gandalf,kostka);

        arena.zapas();

    }
}
