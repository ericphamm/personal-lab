package zviratka;

public abstract class Zviratko {

//    public int getVaha() {
//        return vaha;
//    }
//
//    public void setVaha(int novaVaha) {
//        vaha = novaVaha;
//    }
//
//    public String letat() {
//        if (vaha < 9) {
//            return "muze letat";
//        }
//        else {
//            return "nemuze letat";
//        }
//    }
//
//    private int vaha;
//
//    public Zviratko (int vaha) {
//        this.vaha = vaha;
//    }
//
//    public void nakrm(int kg) {
//        vaha += kg;
//    }
//
//    public void vypis() {
//        System.out.println("Toto zviratka ma: " + vaha + " kg, a " + letat());
//    }

    protected int vaha;
    protected String barva;


    protected Zbarveni zbarveniHlavy;


    public void nakrm(int kg) {
        vaha += kg;
    }

    public boolean leta() {
        return vaha < 9;
    }

    public void vypis() {
        System.out.println("Zviratko barvy" + barva + "o vaze" + vaha);
    }

    public int getVaha() {
        return vaha;
    }

    public String getBarva() {
        return barva;
    }

    public void setVaha(int vaha) {
        this.vaha = vaha;
    }

    public void setBarva(String barva) {
        this.barva = barva;
    }

    public Zviratko(int vaha, String barva) {
        this.vaha = vaha;
        this.barva = barva;
    }

    public String vydejZvuk() {
        return "";
    }

    @Override
    public String toString() {
        return "Kachna " +
                "vaha:" + vaha +
                ", barva: " + barva;
    }

}
