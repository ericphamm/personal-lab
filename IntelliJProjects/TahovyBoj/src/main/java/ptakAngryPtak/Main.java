package ptakAngryPtak;

public class Main {
    public static void main(String[] args) {
        Ptak ptak = new Ptak();

        System.out.println(ptak);

        ptak.jezeni(20);
        System.out.println(ptak);

        AngryPtak angryPtak = new AngryPtak();
        System.out.println(angryPtak);
        angryPtak.provokovat(5);
        System.out.println(angryPtak);
        angryPtak.jezeni(100);
        angryPtak.provokovat(5);
        System.out.println(angryPtak);

    }
}
