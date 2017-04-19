package vkochergin.module1.example.Homework2;

/**
 * Created by Volodymyr Kochergin on 11.04.2017.
 */
public class LabWork153 {
    public static void main(String[] args) {
        System.out.println("*| 1  2  3  4  5  6  7  8  9");
        System.out.println("-----------------------------------");
        for (int a = 1; a <= 9; ++a) {
            System.out.print(a + "| ");
            for (int b = 1; b <= 9; ++b)
            {
                System.out.print(a * b + "  ");
            }
            System.out.println();
        }
    }
}
