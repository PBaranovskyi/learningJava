package ua.kstt.justymenko.module07;

/**
 * Created by n1kropol on 5/21/17.
 */
public class GravityCalculator {
    private final static double acceleration = 9.81;
    public static double calcDist(double time){
        double vi = 0.0;
        double xi = 0.0;
        double distance = 0.5 * acceleration * Math.pow(time, 2) + vi * time + xi;
        return distance;
    }

    public static void main(String[] args) {
        System.out.println(calcDist(10.0));
    }
}
