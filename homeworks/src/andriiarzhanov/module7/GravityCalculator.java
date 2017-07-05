package andriiarzhanov.module7;

import java.util.Scanner;

/**
 * Created by arzhanov on 23.05.17.
 */
public class GravityCalculator {
    final static double acceleration = -9.81;
    private static double velocity;
    private static double position;

    public static double getVelocity() {
        return velocity;
    }

    public static void setVelocity(double velocity) {
        GravityCalculator.velocity = velocity;
    }

    public static double getPosition() {
        return position;
    }

    public static void setPosition(double position) {
        GravityCalculator.position = position;
    }

    static double calcDist(double time) {
        return (0.5 * acceleration * Math.pow(time, 2)) + (velocity * time) + position;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double time = 0;

        System.out.println("Please enter time");
        time = scan.nextDouble();
        System.out.println("Position: " + calcDist(time));
    }
}
