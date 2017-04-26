package vkochergin.module1.example.Homework2;

/**
 * Created by Volodymyr Kochergin on 11.04.2017.
 */
public class LabWork154 {
    public static void main(String[] args) {
        int counter = 0;

        for (int i = 1; i < 300; i++){
            if (counter == 10){
                break;
            }
            else if (i % 3 == 0 || i % 4 == 0){
                System.out.println(i);
                counter++;
            }
        }
    }
}
