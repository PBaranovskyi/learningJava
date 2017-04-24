package ltretykhlib.module3;

/**
 * Created by Tretykhlib on 24.04.2017.
 */
public class Arrays {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        for (int i : intArray) {
            System.out.println(i);



        }
        for (int i = 0; i < intArray.length; i=i+2) {
            int item=intArray[i];
            System.out.println("Index " + i);
            System.out.println("Array element " + intArray[i]);
        }
    }
}
