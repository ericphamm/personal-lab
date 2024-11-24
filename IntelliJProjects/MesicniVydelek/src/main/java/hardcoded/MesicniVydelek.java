package hardcoded;

public class MesicniVydelek {

    private String mesic;
    private int vydelek;

    public MesicniVydelek(String mesic, int vydelek) {
        this.mesic = mesic;
        this.vydelek = vydelek;
    }

    public String getMesic() {
        return mesic;
    }

    public int getVydelek() {
        return vydelek;
    }

    @Override
    public String toString() {
        return "MesicniVydelek{" +
                "mesic='" + mesic + '\'' +
                ", vydelek=" + vydelek +
                '}';
    }
}

