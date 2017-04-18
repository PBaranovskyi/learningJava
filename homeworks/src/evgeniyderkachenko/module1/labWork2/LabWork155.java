package evgeniyderkachenko.module1.labWork2;

/**
 * Created by Derkachenko on 12.04.2017.
 */
public class LabWork155 {

    public static void main(String[] args) {
        float n = 150; // Задаваемое число
        float b;
        float a = 0;
        float s = 0;
        for (b = 1; b <= n; b++) {
            s = s + b;
        }
        for (b = 1; b <= n; b++) {
            a = a + b / n;
        }
        System.out.println("Сумма " + s);
        System.out.println("Среднее " + a);
    }
}
