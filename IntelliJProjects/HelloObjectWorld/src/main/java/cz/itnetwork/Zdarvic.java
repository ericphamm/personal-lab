package cz.itnetwork;
/**
 * Třída reprezentuje zdravič, který slouží ke zdravení uživatelů
 */
public class Zdarvic {

    /**
     * Text pozdravu
     */
    public String text;

    /**
     * Pozdraví uživatele textem pozdravu a jeho jménem
     * @param  jmeno Jméno uživatele
     * @return Text s pozdravem
     */
    public String pozdrav(String jmeno) {
        return String.format("%s %s%n",text, jmeno);
    }
}
