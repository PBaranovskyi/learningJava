package andriiarzhanov.module3;

/**
 * Created by arzhanov on 11.04.17.
 */
public class LabWork_1_5_5 {
    public static void main(String[] args) {
        int n = 6;
        int sum = 0, roundAvg = 0;
        double avg = 0;


        for(int i = 1; i <= n; i++) {
            sum = sum + i;
            avg = (double) sum / i;
        }
        System.out.println("Sum: "+sum);
        System.out.println("AVG: "+avg);
    }
}
