package vkochergin.module1.example.homework7.hackerrankday12;

/**
 * Created by Volodymyr Kochergin on 28.04.2017.
 */
public class Student extends Person {
    private int[] testScores;

    /*
    *   Class Constructor
    *
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    public Student(String firstName, String lastName, int identification, int[] testScores) {
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }

    /*
   *   Method Name: calculate
   *   @return A character denoting the grade.
   */
    // Write your method here
    public char calculate() {
        int avg = 0;
        int sum = 0;
        for (int i = 0; i < testScores.length; i++) {
            sum += testScores[i];
        }
        avg = sum / testScores.length;

        char resultOfCalculation = '\0';

        for (int i = 0; i < testScores.length; i++) {

            if (avg < 40) {
                resultOfCalculation = 'T';
            } else if (avg >= 40 && avg < 55) {
                resultOfCalculation = 'D';
            } else if (avg >= 55 && avg < 70) {
                resultOfCalculation = 'P';
            } else if (avg >= 70 && avg < 80) {
                resultOfCalculation = 'A';
            } else if (avg >= 80 && avg < 90) {
                resultOfCalculation = 'E';
            } else if (avg >= 90 && avg <= 100) {
                resultOfCalculation = 'O';
            }
        }
        return resultOfCalculation;
    }

}
