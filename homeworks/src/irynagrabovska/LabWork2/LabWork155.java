package irynagrabovska.LabWork2;

/**
 * Created by whisper on 14-Apr-17.
 */
public class LabWork155 {

    public static void main(String[] args) {
            int n = 100;
            int sum = 0;
            double average = 0;

       for(int i = 1; i <= n; i++) {
            sum = sum + i;
            average = (double) sum / i;
       }

       System.out.println("The Sum is "+ sum);
       System.out.println("The Avg is "+ average);
    }
}