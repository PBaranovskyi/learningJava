package bogdanh.com.kstt.week2;

/*If  is odd, print Weird
  If  is even and in the inclusive range of  to , print Not Weird
  If  is even and in the inclusive range of  to , print Weird
  If  is even and greater than , print Not Weird*/


import java.util.Scanner;

public class HackerRankDay3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = Lab152.readANumber(scanner);

        System.out.println(
                (number % 2 == 1 || (6 <= number && number <= 20) ? "Weird"
                        : "Not Weird"));

    }

}
