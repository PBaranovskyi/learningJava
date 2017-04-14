package irynagrabovska.LabWork2;

/**
 * Created by whisper on 14-Apr-17.
 */
public class LabWork154 {
   public static void main(String[] args) {
        int counter = 0;

        for (int i=3; i<300; i++){
            if ((i%3==0 || i%4==0)){
                counter++;
                System.out.println(i);
                } if (counter==10){
                break;
            }

        }
   }
}
