package zviratka;

import uvodskoleni.Clovek;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Zviratko zviratko = new Zviratko(2);
//
//        zviratko.setVaha(4);
//        zviratko.nakrm(9);
//        zviratko.letat();
//        zviratko.vypis();

       Kachna alzebeta = new Kachna(8,"zlutohneda", "velmi operena");
       Pes ronicek = new Pes(10, "cerny", "vlcak");

        ArrayList<Zviratko> zvirata = new ArrayList<>();

        zvirata.add(alzebeta);
        zvirata.add(ronicek);


        for (Zviratko zvire : zvirata) {
            System.out.println(zvire.vydejZvuk());
            System.out.println(zvire);
        }

        ronicek.presunSe();
    }

    public Typ typZbarveni;

    public Typ getTypZbarveni() {
        return typZbarveni;
    }
}
