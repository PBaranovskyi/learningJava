package oleksanderkrasilnikov.homework7;


import static oleksanderkrasilnikov.homework7.MyMath.findMax;
import static oleksanderkrasilnikov.homework7.MyMath.findMin;

public class LabWork242 {
    public static void main(String[] args) {
        int[] minArray = {1,123,33,-1,12,0};
        int[] maxArray = {222,2111,112,6,-12};
        System.out.println(findMin(minArray));
        System.out.println(findMax(maxArray));
    }
}
