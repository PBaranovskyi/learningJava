package evgeniyderkachenko.module1.labWork2;

/**
 * Created by Derkachenko on 12.04.2017.
 */
public class LabWork154 {
    public static void main(String[] args) {
        int a;
        int case_stop = 1;
        for (a=3; a<300; a++){
            int b = a%3;
            int c = a%4;
            if ((b==0 || c==0) && (case_stop<=10)){
                System.out.println(a);
                case_stop++;
            }
        }
    }
}
