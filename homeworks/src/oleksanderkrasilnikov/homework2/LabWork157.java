package oleksanderkrasilnikov.homework2;

public class LabWork157 {
    public static void main(String[] args) {
        int n = 10000;
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (i == sum || i == 1) {
                System.out.println(i);
            }
        }
    }
}
