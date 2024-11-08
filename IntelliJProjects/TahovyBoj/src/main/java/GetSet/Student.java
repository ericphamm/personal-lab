package GetSet;

public class Student {
    private String jmeno;
    private boolean muz;
    private int vek;
    private boolean plnolety;

    public Student(String jmeno, boolean muz, int vek) {
        this.jmeno = jmeno;
        this.muz = muz;
        setVek(vek);
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public int getVek() {
        return vek;
    }

    public void setVek(int vek) {
        this.vek = vek;
        //prehodnoceni plnoletosti
        plnolety = vek >= 18;
    }

    public boolean isPlnolety() {
        return plnolety;
    }

    @Override
    public String toString() {
        String jsemPlnolety = "jsem";
        if (!plnolety) {
            jsemPlnolety = "nejsem";
        }
        String pohlavi = "muž";
        if (!muz) {
            pohlavi = "žena";
        }
        return String.format("Jsem %s, %s. Je mi %d let a %s plnoletý.", jmeno, pohlavi, vek, jsemPlnolety);
    }
}
