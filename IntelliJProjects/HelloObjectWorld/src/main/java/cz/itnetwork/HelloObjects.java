package cz.itnetwork;

public class HelloObjects {
    public static void main(String[] args) {

        Zdarvic zdarvic = new Zdarvic();
        zdarvic.text = "Ahoj uzivateli";
        System.out.println(zdarvic.pozdrav("Petr"));
        System.out.println(zdarvic.pozdrav("Karel"));

        zdarvic.text = "Vitam te tu programatore";
        System.out.println(zdarvic.pozdrav("Richard"));

    }
}
