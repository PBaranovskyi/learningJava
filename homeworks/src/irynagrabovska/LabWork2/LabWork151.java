package irynagrabovska.LabWork2;

/**
 * Created by whisper on 11-Apr-17.
 */
public class LabWork151 {
    public static void main(String[] args) {
        int number = 0;
        String newString = "";
        for (int i = 0; i < 8; i++) {
            number = i + 1;
            newString = (" " + number + newString + " ");
            System.out.println(newString);
        }
    }
}
