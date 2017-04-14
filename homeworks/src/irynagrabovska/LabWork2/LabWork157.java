package irynagrabovska.LabWork2;

/**
 * Created by whisper on 14-Apr-17.
 */
public class LabWork157 {
    public static void main(String[] args) {
        int n = 500;
        for (int i = 1; i <= n; i++){
            int sum = 0;
            for (int j = 1; j < i; j++){
                if (i%j == 0){
                    sum = sum+j;
                    }
            }
            if (i == sum || i == 1){
                System.out.println(i);
                }
        }
    }
}
