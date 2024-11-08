package ptakAngryPtak;

public class AngryPtak extends Ptak{

    protected int vztek = 50;

    protected int provokace;

    public void provokovat(int provokace) {
        if (hlad > 0) {
            vztek += (provokace * 2);
        } else {
            vztek += provokace;
        }
    }

    @Override
    public String toString() {
        return "AngryPtak{" +
                "vaha=" + vaha +
                ", hlad=" + hlad +
                ", vztek=" + vztek +
                '}';
    }
}
