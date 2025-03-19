package eric.pham.Statistika.dto;

import java.util.ArrayList;
import java.util.List;

public class StatistikaDTO {
    private String input;
    private int soucet;
    private int nejmensi;
    private int nejvetsi;
    private float prumer;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public int getSoucet() {
        return soucet;
    }

    public void setSoucet(int soucet) {
        this.soucet = soucet;
    }

    public int getNejmensi() {
        return nejmensi;
    }

    public void setNejmensi(int nejmensi) {
        this.nejmensi = nejmensi;
    }

    public int getNejvetsi() {
        return nejvetsi;
    }

    public void setNejvetsi(int nejvetsi) {
        this.nejvetsi = nejvetsi;
    }

    public float getPrumer() {
        return prumer;
    }

    public void setPrumer(float prumer) {
        this.prumer = prumer;
    }
}
