package zviratka;

public class Pes extends Zviratko implements Ovladaci{

    public String rasa;


    private Zbarveni zbarveniPejska = Zbarveni.BILA;

    public Pes(int vaha, String barva, String rasa) {
        super(vaha, barva);
        this.rasa = rasa;
    }


    @Override
    public String toString() {
        return "Zviratko Pes " +
                "vaha:" + super.getVaha() +
                ", barva: " + super.getBarva() + " " + rasa;
    }

    public String vydejZvuk() {
        return "HAF HAF HAF";
    }


    @Override
    public void presunSe() {
        System.out.println("beham...");
    }
}
