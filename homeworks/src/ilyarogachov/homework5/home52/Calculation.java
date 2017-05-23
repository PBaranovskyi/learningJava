package ilyarogachov.homework5.home52;

/**
 * Created by rogachev on 23.05.17.
 */
public class Calculation {

    public static void main(String[] args) {
        int[] myInt1Array = new int[29];
        int k = 2;
        for (int i = 0; i <= 28; i++) {
            myInt1Array[i] = k;
            k++;
        }

        int[] myInt2Array = new int[34];
        int f =3 ;
        for (int i = 0; i <= 33; i++) {
            myInt2Array[i] = f;
            f++;
        }
        System.out.println("Max value is : " + MyMath.findMax(myInt1Array));
        System.out.println("Max value is : " + MyMath.findMin(myInt1Array));
        System.out.println("Max value is : " + MyMath.findMax(myInt2Array));
        System.out.println("Max value is : " + MyMath.findMin(myInt2Array));

    }

}
