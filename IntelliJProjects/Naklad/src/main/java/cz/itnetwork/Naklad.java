package cz.itnetwork;

public class Naklad {
    public static void main(String[] args) {

        NakladniAuto tatra = new NakladniAuto();
        tatra.hlaska = "Nelze uskutecnit";
        tatra.nalozit(10000);
        tatra.nalozit(500);
        tatra.vylozit(300);
        tatra.vylozit(1000);
        System.out.println("V nákladním autě je naloženo " + tatra.zatimniNosnost + " kg");

    }
}
