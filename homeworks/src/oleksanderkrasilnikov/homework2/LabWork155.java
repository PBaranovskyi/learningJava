package oleksanderkrasilnikov.homework2;

public class LabWork155 {
    public static void main(String[] args) {
        int n = 14;
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        double avr = (double) sum / n;
        System.out.println("The Sum is: " + sum);
        System.out.println("The Avg is: " + avr);
    }
}
