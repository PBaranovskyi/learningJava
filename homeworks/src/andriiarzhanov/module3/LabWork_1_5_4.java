package andriiarzhanov.module3;

/**
 * Created by arzhanov on 11.04.17.
 */
public class LabWork_1_5_4 {
    public static void main(String[] args) {
        int counter = 0;
        for(int i = 1; i < 300; i++) {
            if(i%3 == 0 || i%4 == 0) {
                counter++;
                System.out.println(i);
                if(counter == 10) {
                    break;
                }
            }
        }
    }
}
