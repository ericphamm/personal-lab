package cz.itnetwork;

public class Kalkulacka {

    /**
     * 1. číslo
     */
    public double a;
    /**
     * 2. číslo
     */
    public double b;

    /**
     * Vrací součet atributů
     * @return Součet
     */
    public double secti()
    {
        return a + b;
    }

    /**
     * Vrací rozdíl atributů
     * @return Rozdíl
     */
    public double odecti()
    {
        return a - b;
    }

    /**
     * Vrací součin atributů
     * @return Součin
     */
    public double vynasob()
    {
        return a * b;
    }

    /**
     * Vrací podíl atributů
     * @return Podíl
     */
    public double vydel()
    {
        return a / b;
    }
}
