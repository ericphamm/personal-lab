package Statika;

class Uzivatel {
    private String jmeno;
    private String heslo;
    private boolean prihlaseny;

    private int id;
    private static int minimalniDelkaHesla = 6;
    private static int dalsiId = 1;


    public boolean prihlasSe(String zadaneHeslo) {
        if (zadaneHeslo.equals(heslo)) { // kontrola hesla
            prihlaseny = true;
            return true;
        }
        return false; // hesla nesouhlasí
    }

    public Uzivatel(String jmeno, String heslo) {
        this.jmeno = jmeno;
        this.heslo = heslo;
        prihlaseny = false;
        id = dalsiId;
        dalsiId++;
    }

    public static boolean zvalidujHeslo(String heslo) {
        // podrobnou logiku validace hesla vynecháme
        return heslo.length() >= minimalniDelkaHesla;
    }

    public static int vratMinimalniDelkuHesla() {
        return minimalniDelkaHesla;
    }

    public int vratId() {
        return id;
    }

}

