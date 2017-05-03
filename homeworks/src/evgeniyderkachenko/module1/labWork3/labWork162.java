package evgeniyderkachenko.module1.labWork3;

/**
 * Created by Derkachenko on 02.05.2017.
 */
public class labWork162 {
    static int[] m = new int[]{10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14};


    public static void main(String[] args) {
        int a=0;
        for (int i = 0; i < m.length; i++) {
            if (m[i] > a) {
                a = m[i];
            }
        }
        System.out.println("Max= "+a);

        int b=10000;
        for (int i = 0; i < m.length; i++) {
            if (m[i] < b) {
                b = m[i];
            }
        }
        System.out.println("Min= "+b);

        double c=0;
        double d=0;
        for (int i = 0; i < m.length; i++) {
             {
                c = c+(double)m[i];
            }
            d=c/m.length;
        }
        System.out.println("Avg= "+d);
    }
}
