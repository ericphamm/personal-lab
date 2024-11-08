package uvodskoleni;

public class Clovek {

    public String jmeno;

    public int getVek() {
        return vek;
    }

    public void setVek(int novyVek) {
        if (novyVek > 0) {
            vek = novyVek;
        }
    }

    private int vek;


    public  String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno){
        this.jmeno = jmeno;
    }

    public void pracuj() {
        System.out.println("Pracuj!");
    }

    public int zmenVek(int vek) {
        this.vek = vek;
        return vek;
    }

    public void pracuj(String jakMoc) {
        System.out.println("Pracuj " + jakMoc);
    }

    public void pracuj(String jakMoc, int cislo) {
        System.out.println(cislo + jakMoc);
    }

    @Override
    public String toString() {
        return jmeno + "," + vek;
    }
}
