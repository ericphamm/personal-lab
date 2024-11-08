package cz.itnetwork;

import java.util.Random;

public class GeneratorVet {
    /**
     * Slovní zásoba přívlastků
     */
    private String[] privlastky = {"modrý", "velký", "hubený", "nejlepší", "automatizovaný"};

    /**
     * Slovní zásoba předmětů
     */
    private String[] podnety = {"jednorožec", "programátor", "manažer", "hroch", "T-rex"};

    /**
     * Slovní zásoba příslovcí
     */
    private String[] prislovce = {"rychle", "s oblibou", "hodně", "málo", "se zpožděním"};

    /**
     * Slovní zásoba sloves
     */
    private String[] slovesa = {"spal", "ležel", "vařil", "uklízel", "derivoval"};

    /**
     * Slovní zásoba příslovečných určení místa
     */
    private String[] mista = {"pod stolem", "v lese", "u babičky", "v práci", "na stole"};

    // Zde dokonči úlohu svým kódem...


    private Random random;

    public String generuj(){
        random = new Random();

        String privlastek = privlastky[random.nextInt(privlastky.length)];
        String podnet = podnety[random.nextInt(podnety.length)];
        String prislovec = prislovce[random.nextInt(prislovce.length)];
        String sloveso = slovesa[random.nextInt(slovesa.length)];
        String misto = mista[random.nextInt(mista.length)];
        return String.format("%s %s %s %s %s", privlastek, podnet, prislovec, sloveso, misto);
    }

}