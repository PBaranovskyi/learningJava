package ltretykhlib.module1.example;

/**
 * Created by Tretykhlib on 11.04.2017.
 */
public class Sum {

    public static void main(String[] args) {
        double sum = 0;
        double avg=0;
        int n=4;
        int counter=0;
        for (int i = 1; i <= n; i++) {
            sum += i;
            counter++;
            avg =sum/counter;
        }
        System.out.println(sum);
        System.out.println(avg);
    }

}
