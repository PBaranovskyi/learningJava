package ltretykhlib.module1.example;

import java.util.Scanner;

/**
 * Created by Tretykhlib on 16.04.2017.
 */
public class Person {
    public int age;

    public Person(int initialAge) {
        // Add some more code to run some checks on initialAge
        this.age = initialAge;
        if (initialAge < 0) {
            initialAge = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
    }


    public void amIOld() {
        String result;
        if (age < 13) {
            result = "You are young.";
        } else if (age >= 13 && age < 18) {
            result = "You are a teenager.";
        } else {
            result = "You are old.";
        }
        System.out.println(result);
    }

    public void yearPasses() {
        age++;
        // Increment this person's age.
    }

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

