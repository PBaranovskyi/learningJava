package bogdanh.com.kstt.week2;

public class Lab157 {

    public static void main(String[] args) {

        int max = 100;

        for (int i = 1; i <= max; i++) {

            int sum = 0;
            for (int j = 1; j < i; j++) {
                if ((i % j) == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                System.out.println(sum);
            }
        }
    }
}
