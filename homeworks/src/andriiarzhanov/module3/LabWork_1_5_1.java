package andriiarzhanov.module3;

/**
 * Created by arzhanov on 11.04.17.
 */
public class LabWork_1_5_1 {
    public static void main(String[] args) {
        int intVar = 0;
        String stringVar = "";
        for(int i = 0; i < 8; i++) {
            intVar = i + 1;
            stringVar = (" " + intVar).toString().concat(stringVar);
            System.out.println(stringVar);
        }
    }
}
