package Kalkulacka;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class KalkulackaTest {


    @Test
    public void scitani() {

        Kalkulacka k = new Kalkulacka();

        assertEquals(2, k.scitani(1,1));
    }

    @Test
    public void testNasobeni() {
        Kalkulacka k = new Kalkulacka();

        assertEquals(4,k.nasobeni(2,2));
    }

    @Test
    public void testOdecitani() {

        Kalkulacka k = new Kalkulacka();

        assertEquals(6,k.odecitani(10,4));
    }



}