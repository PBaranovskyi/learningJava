package alexandermelnychuk.homework2;

/*
Task: Write a program to produce on console the following
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1
6 5 4 3 2 1
7 6 5 4 3 2 1
8 7 6 5 4 3 2 1
*/

public class LabWork151 {
    public static void main(String[] args) {
        for (int i = 1; i < 9; i++) {
            for (int r = i; r > 0; r--) {
                System.out.print(r + " ");
            }
            System.out.println("");
        }
    }
}