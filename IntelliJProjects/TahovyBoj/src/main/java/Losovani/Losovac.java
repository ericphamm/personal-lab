package Losovani;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class Losovac {
        private ArrayList<Integer> cisla;

        private Random random;

        public Losovac() {
            random = new Random();
            cisla = new ArrayList<Integer>();
        }

        public int losuj() {
            Integer cislo = random.nextInt(100) + 1;
            cisla.add(cislo);
            return cislo;
        }

        public String vypis() {
            String vypis = "";
            Collections.sort(cisla);
            for (int cislo: cisla) {
                vypis += cislo + " ";
            }
            return vypis;
        }

}
