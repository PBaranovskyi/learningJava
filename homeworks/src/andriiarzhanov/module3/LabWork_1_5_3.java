package andriiarzhanov.module3;

/**
 * Created by arzhanov on 11.04.17.
 */
public class LabWork_1_5_3 {
    public static void main(String[] args) {
        String headerString = " * |", tableString = "";
        for(int x = 1; x < 10; x++) {
            headerString = headerString.concat("  " + x);
        }
        System.out.println(headerString);
        System.out.println("-------------------------------");
        for(int x = 1; x < 10; x++) {
            tableString = " " + x + " |";
            for(int y = 1; y < 10; y++) {
                String space = "";
                int multi = x * y;
                if(multi < 10) {
                    space = " ";
                }
                tableString = tableString.concat(" " + space + multi);
            }
            System.out.println(tableString);
        }
    }
}
