package ilyarogachov.homework4;

/**
 * Created by Tom on 26.04.2017.
 */
public class LabWork163 {
    public static void main(String[] args) {
        int[][] myIntArray = new int[4][4];
        int k=1;
        for(int i=0;i<=3;i++){
            System.out.print("\n" + "-------------" + "\n");
            for (int j=0;j<=3;j++){
                myIntArray[i][j]=k;
                k++;
                System.out.print("|"+myIntArray[i][j]);
            }
        }

    }

}
