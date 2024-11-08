package cz.itnetwork;


public class NahodneVety {
    public static void main(String[] args) {

        GeneratorVet generator = new GeneratorVet();
        for (int i = 0; i < 10; i++) {
            System.out.println(generator.generuj());
        }

    }
}
