package ilyarogachov.homework5.home57;

/**
 * Created by rogachev on 24.05.17.
 */
public class GravityCalculation {


    private static final double a = 9.81;
    private static double t;
    private static double v=100.0;
    private static double x=200;

    public static double calcDist(double time) {
         double result = 0.5*a* Math.pow(time,2)+v*time+x;
        return result;
    }
}
