package AutoBazar;

import java.util.ArrayList;

public class Autobazar {

    private String adresa;

    private int pokladna;

    private ArrayList<Auto> auta = new ArrayList<>();

    public Autobazar(String adresa, int pokladna) {
        this.adresa = adresa;
        this.pokladna = pokladna;
    }

    public void pridani(Auto auto) {
        if (pokladna >= auto.getCena()){
            pokladna -=  auto.getCena();
            auta.add(auto);
        }
        else {
            System.out.println("Nemame dost penez!");
        }
    }

    public void prodani(Auto auto) {
        if (auta.contains(auto)) {
            pokladna += auto.getCena();
            auta.remove(auto);
        }
        else {
            System.out.println("Auto neni v bazaru");
        }
    }

    public String zjisteni() {
        int celkovaCena = 0;
        for (Auto auto : auta) {
            celkovaCena += auto.getCena();
        }
        return "V bazaru je " + auta.size() + " automobilů \n" +
                "Na pokladně je " + pokladna + " Kč \n" +
                "Celková cena automobilů je " + celkovaCena + " Kč";
    }


}
