package uvodskoleni;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Clovek karel = new Clovek();
        Clovek honza = new Clovek();

        honza.getJmeno();
        honza.setJmeno("Honza");
        Programator lojzik = new Programator();

        Clovek hynek = new Programator();
        Object nicol =new Clovek();
        Object nicol2 = new Programator();

        honza.pracuj();
        lojzik.pracuj();

        ArrayList<Clovek> lide = new ArrayList<>();
        lide.add(karel);
        lide.add(lojzik);

        System.out.println(karel);
        System.out.println(karel.toString());
    }
}
