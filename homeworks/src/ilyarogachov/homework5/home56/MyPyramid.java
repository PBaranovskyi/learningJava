package ilyarogachov.homework5.home56;

/**
 * Created by rogachev on 23.05.17.
 */
public class MyPyramid {

    public static void printPyramid(int p){
        int noOfRows = p;
        int rowCount = 1;
        System.out.println("Here Is Your Pyramid");
        //Implementing the logic
        for (int i = noOfRows; i > 0; i--) {
            for (int j = 1; j <= i * 2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= rowCount; j++) {
                System.out.print(j + " ");
            }
            for (int j = rowCount - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
            rowCount++;
        }
    }
}
