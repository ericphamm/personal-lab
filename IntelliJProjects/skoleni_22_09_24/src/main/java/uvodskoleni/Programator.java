package uvodskoleni;

public class Programator extends Clovek {

    private String jazyk;

    @Override
    public void pracuj() {
        System.out.println("Pilne programuji");
    }

    public void nespi() {
        System.out.println("Nespim");
    }

}
