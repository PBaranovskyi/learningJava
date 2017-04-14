package ilyarogachov;

/**
 * Created by rogachev on 14.04.17.
 */
public class LabWork157 {
    public static void main(String[] args) {
        double a = 255;
        int k=0;
        for(int i = 1; i<a; i++){
            double f = a%i;
            if (f==0){
                 System.out.println(i);
                 k=k+i;
            }
          }
        System.out.println(k);
    }
}
