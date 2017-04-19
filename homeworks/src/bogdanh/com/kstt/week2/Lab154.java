package bogdanh.com.kstt.week2;

public class Lab154 {
    public static void main(String[] args) {

        int counter = 0;

        for (int i = 1; i <= 300; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                counter++;
                if (counter > 10) break;

                System.out.println(i);
            }
        }

//        IntStream.iterate(1, i -> i + 1).filter(i -> i % 3 == 0 || i % 4 == 0)
//                .limit(10).forEach(System.out::println);
    }
}
