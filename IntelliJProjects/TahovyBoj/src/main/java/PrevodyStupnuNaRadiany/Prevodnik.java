package PrevodyStupnuNaRadiany;

public class Prevodnik {
    private static double radian;
    private static double stupne;

    public static double radianNaStupne(double radian) {
        return radian = (radian / (Math.PI)) * 180;
    }

    public static double stupneNaRadian(double stupne) {
        return stupne = stupne *(Math.PI / 180);
    }
}
