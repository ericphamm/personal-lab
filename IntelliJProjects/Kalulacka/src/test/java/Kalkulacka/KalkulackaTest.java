package Kalkulacka;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class KalkulackaTest {

    @Test
    public void scitani() {

        Kalkulacka k = new Kalkulacka();

        assertEquals(2, k.scitani(1,1));
        assertEquals(4, k.nasobeni(2,2));
        assertEquals(3,k.odecitani(4,1));
    }
}