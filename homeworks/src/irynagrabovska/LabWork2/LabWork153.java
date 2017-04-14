package irynagrabovska.LabWork2;

/**
 * Created by whisper on 11-Apr-17.
 */
public class LabWork153 {
     public static void main(String[] args){
         System.out.println("*  1  2  3  4  5  6  7  8  9 ");
         System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _");

        for(int i = 1; i < 10; i++){
            for(int j = 1; j < 10; j++){
                System.out.print(j * i + "  ");
            }
            System.out.println(" ");
        }

    }
}
