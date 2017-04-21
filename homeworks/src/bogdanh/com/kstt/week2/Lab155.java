package bogdanh.com.kstt.week2;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Lab155 {

    public static void main(String[] args) {
        int num = 10;
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("sum " + sum);
        double avg = (double) sum / num;
        System.out.println("avg " + avg);

        IntSummaryStatistics summaryStatistics = IntStream
                .iterate(1, i -> i + 1)
                .limit(num)
                .summaryStatistics();

        System.out.println(summaryStatistics);

    }
}
