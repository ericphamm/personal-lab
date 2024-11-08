package cz.itnetwork;

public class Mag extends Bojovnik{
    private int mana;
    private int maximalniMana;
    private int magickyUtok;

    public Mag(String jmeno, int zivot, int utok, int obrana, Kostka kostka, int mana, int magickyUtok) {
        super(jmeno, zivot, utok, obrana, kostka);
        this.mana = mana;
        this.maximalniMana = mana;
        this.magickyUtok = magickyUtok;
    }

    @Override
    public void utoc(Bojovnik souper) {
        int uder = 0;
        //Mana neni naplnena;
        if (mana < maximalniMana) {
            mana += 10;
            if (mana > maximalniMana) {
                mana = maximalniMana;
            }
            super.utoc(souper);
        } else {
            uder = magickyUtok + kostka.hod();
            nastavZpravu(String.format("%s pouzil magii za %s hp",jmeno,uder));
            mana = 0;
        }
        souper.branSe(uder);
    }

    public String grafickaMaza() {
        return grafickyUkazatel(mana, maximalniMana);
    }
}
