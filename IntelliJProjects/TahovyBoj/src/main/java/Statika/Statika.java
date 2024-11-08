package Statika;

public class Statika {
    public static void main(String[] args) {
        Uzivatel tomas = new Uzivatel("Tomáš Marný", "heslojeveslo");
        System.out.printf("ID prvního uživatele: %s%n", tomas.vratId());
        Uzivatel oli = new Uzivatel("Olí Znusinudle", "csfd1fg");
        System.out.printf("ID druhého uživatele: %s%n", oli.vratId());
        System.out.printf("Minimální délka hesla uživatele je: %s%n", Uzivatel.vratMinimalniDelkuHesla());
        System.out.printf("Validnost hesla \"heslo\" je: %s", Uzivatel.zvalidujHeslo("heslo"));
    }
}
