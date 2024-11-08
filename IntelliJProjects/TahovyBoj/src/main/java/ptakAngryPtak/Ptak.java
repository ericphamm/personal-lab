package ptakAngryPtak;

public class Ptak {

    protected int hlad = 100;

    protected int vaha = 50;

    public int potravina;

    public void jezeni(int potravina) {
        vaha += potravina;
        hlad -= potravina;
    }

    @Override
    public String toString() {
        return "Ptak{" +
                "vaha=" + vaha +
                ", hlad=" + hlad +
                '}';
    }
}
