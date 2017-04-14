package vkochergin.module1.example.Homework3;

/**
 * Created by Volodymyr Kochergin on 14.04.2017.
 */
public class HackerRankDay4 {
    public class Person {
        private int age;

        public Person(int initialAge) {
            // Add some more code to run some checks on initialAge
            if (initialAge > 0) {
                this.age = initialAge;
            } else {
                System.out.println("Age is not valid, setting age to 0.");
                this.age = 0;
            }
        }

        public void amIOld() {
            // Write code determining if this person's age is old and print the correct statement:
            if (age < 13) {
                System.out.println("You are young.");
            } else if (age >= 13 && age < 18) {
                System.out.println("You are a teenager.");
            } else {
                System.out.println("You are old.");
            }

        }

        public void yearPasses() {
            age++;
        }

    }
}
