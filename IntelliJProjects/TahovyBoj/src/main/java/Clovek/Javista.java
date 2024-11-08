package Clovek;

public class Javista extends Clovek{


    /**
     * Únava
     *
     * @param jmeno
     * @param vek
     */

    private String ide;

    public Javista(String jmeno, int vek, String ide) {
        super(jmeno, vek);
        this.ide = ide;
    }

    public void programuj(int pocetRadku) {
        if (pocetRadku < 10) {
            pocetRadku = 10;
        }
        if (unava + pocetRadku / 10 <= 20) {
            unava += pocetRadku / 10;
        }
        else {
            System.out.println("Jsem příliš unavený, abych programoval");
        }
    }

}
