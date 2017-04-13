package ilyarogachov;

/**
 * Created by rogachev on 13.04.17.
 */
public class LabWork155 {
    public static void main(String[] args) {
        int a=0;
        for (int i=0; i<100; i++){
            i++;
            a=a+i;
            System.out.println("The sum is: " + i);
            System.out.println("The avg is: " + a/i);
        }
    }
}
