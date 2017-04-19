package erik.module3;
import java.util.Scanner;
/**
 * Created by Erik Pavliuk on 14/04/2017.
 */
public class Work156 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        String a = s.next();
        int sum = 0;
            for (int i=0; i<=a.length()-1; i++) {
                int z = Integer.parseInt(String.valueOf(a.charAt(i)));
                sum += z*z;
                System.out.println("digit :"+ z+ "  square :" + z * z + "   sum :"+ sum) ;
        }
    }
}