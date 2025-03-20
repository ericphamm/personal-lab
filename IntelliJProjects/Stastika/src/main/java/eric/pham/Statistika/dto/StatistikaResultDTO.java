package eric.pham.Statistika.dto;

public class StatistikaResultDTO {
    private int soucet;
    private int nejmensi;
    private int nejvetsi;
    private float prumer;

    public StatistikaResultDTO(int soucet, int nejmensi, int nejvetsi, float prumer) {
        this.soucet = soucet;
        this.nejmensi = nejmensi;
        this.nejvetsi = nejvetsi;
        this.prumer = prumer;
    }

    public int getSoucet() {
        return soucet;
    }

    public int getNejmensi() {
        return nejmensi;
    }

    public int getNejvetsi() {
        return nejvetsi;
    }

    public float getPrumer() {
        return prumer;
    }
}
