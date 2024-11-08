package nakladak;

public class Nakladak {
    private int zatimniNosnost = 0;

    private int nosnost = 1000;

    public void naloz(int vaha) {
        if ((vaha + zatimniNosnost) <= nosnost) {
            zatimniNosnost += vaha;
        }
        else {
            System.out.println("nejde");
        }
    }

//    public void vyloz(int vaha) {
//        if (zatimniNosnost >= vaha) {
//            zatimniNosnost -= vaha;
//        }
//        else {
//            System.out.println("nejde");
//        }
//
//    }


    public

    public void vypis() {
        System.out.println(zatimniNosnost);
    }

    public Nakladak(int nastavovovanaNosnost) {
        nosnost = nastavovovanaNosnost;
    }
}
