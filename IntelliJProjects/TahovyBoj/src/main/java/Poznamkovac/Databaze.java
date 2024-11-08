package Poznamkovac;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Databaze {

    private ArrayList<Zaznam> zaznamy;

    public Databaze() {
        zaznamy = new ArrayList<>();
    }

    public void pridejZaznam(LocalDateTime datumCas, String text) {
        zaznamy.add(new Zaznam(datumCas, text));
    }

    public ArrayList<Zaznam> najdiZaznamy(LocalDateTime datumCas, boolean dleCasu) {
        ArrayList<Zaznam> nalezene = new ArrayList<>();
        for (Zaznam zaznam : zaznamy) {
            if((dleCasu && zaznam.getDatumCas().equals(datumCas)) || (!dleCasu && zaznam.getDatumCas().toLocalDate().equals(datumCas.toLocalDate()))) {
                nalezene.add(zaznam);
            }
        }
        return nalezene;
    }

    public void vymazZaznamy(LocalDateTime datum) {
        ArrayList<Zaznam> nalezeno = najdiZaznamy(datum, true);
        for (Zaznam zaznam : nalezeno) {
            zaznamy.remove(zaznam);
        }
    }
}
