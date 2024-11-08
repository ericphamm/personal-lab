package Clovek;

public class Lide {
    public static void main(String[] args) {

        Clovek karel = new Clovek("Eric Nový", 25);
        System.out.println(karel);
        karel.behej(10);
        karel.behej(10);
        karel.behej(30);


        Javista javista = new Javista("David", 25, "Visual Code Studio");
        System.out.println(javista);
        javista.behej(10);
        javista.behej(10);

        javista.programuj(5);
        javista.behej(10);
        javista.spi(8);
        javista.programuj(100);
    }
}
