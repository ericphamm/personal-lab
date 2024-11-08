package Genericita;

public class Trida<T extends Comparable> {
    private T promenna;

    public Trida(T promenna) {
        this.promenna = promenna;
    }

    public <T2> boolean porovnej(T2 a) {
        return promenna.equals(a);
    }
}
