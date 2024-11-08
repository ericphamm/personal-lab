package cz.itnetwork;

public class Arena {
    private Bojovnik bojovnikA;
    private Bojovnik bojovnikB;
    private Kostka kostka;

    public Arena(Bojovnik bojovnikA, Bojovnik bojovnikB, Kostka kostka) {
        this.bojovnikA = bojovnikA;
        this.bojovnikB = bojovnikB;
        this.kostka = kostka;
    }

    private void vykresli() {
        System.out.println("-------------- Aréna -------------- \n");
        System.out.println("Zdraví bojovníků: \n");
        vypisBojovnika(bojovnikA);
        System.out.println();
        vypisBojovnika(bojovnikB);
        System.out.println();
    }

    private void vypisZpravu(String zprava) {
        System.out.println(zprava);
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            System.err.println("Chyba, nepodařilo se uspat vlákno!");
        }
    }


    public void zapas() {
        // původní pořadí
        Bojovnik bojovnikA = this.bojovnikA;
        Bojovnik bojovnikB = this.bojovnikB;
        System.out.println("Vítejte v aréně!");
        System.out.printf("Dnes se utkají %s s %s! %n%n", bojovnikA, bojovnikB);
        // prohození bojovníků
        boolean zacinaBojovnikB = (kostka.hod() <= kostka.vratPocetSten() / 2);
        if (zacinaBojovnikB) {
            bojovnikA = this.bojovnikB;
            bojovnikB = this.bojovnikA;
        }
        System.out.printf("Začínat bude bojovník %s! %nZápas může začít...%n", bojovnikA);

        // cyklus s bojem
        while (bojovnikA.jeZivy() && bojovnikB.jeZivy()) {
            bojovnikA.utoc(bojovnikB);
            vykresli();
            vypisZpravu(bojovnikA.vratPosledniZpravu()); // zpráva o útoku
            vypisZpravu(bojovnikB.vratPosledniZpravu()); // zpráva o obraně
            if (bojovnikB.jeZivy()) {
                bojovnikB.utoc(bojovnikA);
                vykresli();
                vypisZpravu(bojovnikB.vratPosledniZpravu()); // zpráva o útoku
                vypisZpravu(bojovnikA.vratPosledniZpravu()); // zpráva o obraně
            }
            System.out.println();
        }
    }

    private void vypisBojovnika(Bojovnik bojovnik) {
        System.out.println(bojovnik);
        System.out.println("Zivot: ");
        System.out.println(bojovnik.grafickyZivot());
        if (bojovnik instanceof Mag) {
            System.out.println("Mana: ");
            System.out.println(((Mag) bojovnik).grafickaMaza());
        }
    }




}
