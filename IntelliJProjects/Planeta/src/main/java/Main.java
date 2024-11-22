import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Vytvoření jendotlivých planet
        Planeta Merkur = new Planeta("Merkur", 2440, 0, true, 440);
        Planeta Venuse = new Planeta("Venuše", 12104, 0, true, 737);
        Planeta Zeme = new Planeta("Země", 12756, 1, true, 287);
        Planeta Mars = new Planeta("Mars", 6792, 2, true, 210);
        Planeta Jupiter = new Planeta("Jupiter", 142984, 79, false, 152);
        Planeta Saturn = new Planeta("Saturn", 120536, 82, false, 93);
        Planeta Uran = new Planeta("Uran", 51118, 27, false, 68);
        Planeta Neptun = new Planeta("Neptun", 49528, 14, false, 53);

        //Vytvoření listu planet
        List<Planeta> planety = new ArrayList<>();
        planety.add(Merkur);
        planety.add(Venuse);
        planety.add(Zeme);
        planety.add(Mars);
        planety.add(Jupiter);
        planety.add(Saturn);
        planety.add(Uran);
        planety.add(Neptun);

    }
}
