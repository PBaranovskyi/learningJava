package andriiarzhanov.com.hackerrank.Day4_Class_vs_Instance;

import java.util.Scanner;

/**
 * Created by arzhanov on 19.04.17.
 */
public class Day4_Class_vs_Instance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}

