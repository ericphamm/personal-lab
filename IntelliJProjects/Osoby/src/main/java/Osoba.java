import java.util.ArrayList;
import java.util.List;

public class Osoba {
    private String jmeno;
    private List<String> jazyky;

    public Osoba(String jmeno, List<String> jazyky) {
        this.jmeno = jmeno;
        this.jazyky = new ArrayList<>(jazyky);
    }

    public String getJmeno() { return this.jmeno; }
    public List<String> getJazyky() { return this.jazyky; }

    @Override
    public String toString() {
        return jmeno + ", ";
    }
}
