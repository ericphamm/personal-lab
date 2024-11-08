package Genericita;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> seznam = new LinkedList<>();
        seznam.addLast(1);
        seznam.addLast(2);
        seznam.addLast(3);
        seznam.addLast(4);
        seznam.addLast(5);

// přidávání a mazání v prostředku seznamu
        seznam.add(3, 32);
        seznam.add(3, 31);
        seznam.remove(2);

// výpis seznamu
        for (Integer i : seznam) {
            System.out.print(i + ", ");
        }
    }
}
