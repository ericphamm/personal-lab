import java.time.LocalDate;

public class Zaznam {

    private final LocalDate datumCas;
    private final String text;

    public Zaznam(String text) {
        this.datumCas = LocalDate.now();
        this.text = text;
    }

    public LocalDate getDatum() {
        return datumCas;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return text + "\nVytvořen: " + datumCas;
    }
}

