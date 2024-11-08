package zviratka;

public class Kachna extends Zviratko{

    private String operenost;

    public Kachna(int vaha, String barva, String operenost) {
        super(vaha, barva);
        this.operenost = operenost;
    }

    @Override
    public String vydejZvuk() {
        return "wak wak wak";
    }
}
