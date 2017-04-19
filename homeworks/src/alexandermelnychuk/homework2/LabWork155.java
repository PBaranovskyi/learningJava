package alexandermelnychuk.homework2;

/*Task:
        Write a program to produce the sum of 1, 2, 3, ..., to an upper bound - n.
        Also compute and display the average.
        The output shall look like:
        The Sum is: 100
        The Sum is: 100 The Avg is: 10*/

public class LabWork155 {
    public static void main(String[] args) {
        int n = 1986, sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        double avg = (double) sum / n;

        System.out.println("The Sum is: " + sum);
        System.out.println("The Avg is: " + avg);
    }
}