package bogdanh.com.kstt.week2;

/*Write a program to produce on console the following :
         1
        2  1
        3 2  1
        4 3 2  1
        5 4 3 2  1
        6 5 4 3 2  1
        7 6 5 4 3 2  1
        8 7 6 5 4 3 2  1*/


public class Lab151 {

    public static void main(String[] args) {

        for (int i = 1; i < 9; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
