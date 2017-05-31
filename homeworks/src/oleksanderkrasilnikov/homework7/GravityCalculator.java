package oleksanderkrasilnikov.homework7;


public class GravityCalculator {

    private final static double a = 9.81;

    public static double calcDist(double time) {
        return 0.5 * a * Math.pow(time, 2);
    }

    public static void main(String[] args) {
        System.out.println(calcDist(10.0));
    }
}
