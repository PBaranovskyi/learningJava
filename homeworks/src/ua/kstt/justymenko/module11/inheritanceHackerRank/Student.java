package ua.kstt.justymenko.module11.inheritanceHackerRank;

/**
 * Created by n1kropol on 6/22/17.
 */
public class Student extends Person {
    private int[] testScores;

    public Student(String firstName, String lastName, int id, int[] testScores) {
        super(firstName, lastName, id);
        this.testScores = testScores;
    }

    public String calculate() {
        double sum = 0.0;
        for (int i = 0; i < testScores.length; i++) {
            sum += testScores[i];
        }

        double grade = sum / testScores.length;
        System.out.println(grade);
        if (grade >= 40 && grade < 55)
            return "D";
        else if (grade >= 55 && grade < 70)
            return "P";
        else if (grade >= 70 && grade < 80)
            return "A";
        else if (grade >= 80 && grade < 90)
            return "E";
        else if (grade >= 40 && grade < 55)
            return "D";
        else if (grade >= 90 && grade <= 100)
            return "O";
        else
            return "T";
    }

}
