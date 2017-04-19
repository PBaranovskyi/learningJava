package alexandermelnychuk.homework2;

/*Task:
        The program must print the first 10 numbers that is divisible evenly by 3 or 4, but for
        loop iterates from 1 to 300 (so break statement must be used after 10 printed result).
        The output shall look:
        3
        4
        …
        20*/

public class LabWork154 {
    public static void main(String[] args) {
        int loopCounter = 0;
        for (int i = 1; i <= 300 ^ loopCounter == 10; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                System.out.println(i);
                loopCounter++;
            }
        }
    }
}
