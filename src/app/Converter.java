package app;

public class Converter {

    private static final double CONV_K = 2.20462;

    public static void main(String[] args) {
        System.out.println("Converter App.");

        double kgs = 5;
        double pounds = convKgsToPounds(kgs);
        double kilos = convPoundsToKgs(pounds);
        System.out.println("Result is " + pounds + " pounds and "
            + kilos + " kgs.)");
    }

    private static double convKgsToPounds(double kgs) {
        return kgs * CONV_K;
    }

    private static double convPoundsToKgs(double pnds) {
        return pnds / CONV_K;
    }
}
