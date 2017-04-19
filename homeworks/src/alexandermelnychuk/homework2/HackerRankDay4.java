package alexandermelnychuk.homework2;

/*Task
        Write a Person class with an instance variable, age , and a constructor that takes an integer, initialAge, as a
        parameter. The constructor must assign initialAge to after after confirming the argument passed as initialAge
        is not negative; if a negative argument is passed as initialAge, the constructor should set age to 0 and print
        Age is not valid, setting age to 0.. In addition, you must write the following instance methods:
        1.yearPasses() should increase the age instance variable by 1.
        2.amIOld() should perform the following conditional actions:
            If age < 13, print You are young..
            If age ≥ 13 and age < 18, print You are a teenager..
            Otherwise, print You are old..

        To help you learn by example and complete this challenge, much of the code is provided for you, but you'll be
        writing everything in the future. The code that creates each instance of your Person class is in the main method.
        Don't worry if you don't understand it all quite yet!*/


import java.util.Scanner;


public class HackerRankDay4 {

    private int age;

    public HackerRankDay4(int initialAge) {
        // Add some more code to run some checks on initialAge
        if (initialAge < 0) {
            age = 0;
            System.out.println("Age is not valid, setting age to 0.");

        } else {
            age = initialAge;
        }
    }

    public void amIOld() {
        // Write code determining if this person's age is old and print the correct statement:
        String statement;

        if (age < 13) {
            statement = "You are young.";
        } else if (age >= 13 && age < 18) {
            statement = "You are a teenager.";
        } else {
            statement = "You are old.";
        }
        System.out.println(statement);
    }

    public void yearPasses() {
        // Increment this person's age.
        age++;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            HackerRankDay4 p = new HackerRankDay4(age);
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