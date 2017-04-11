package oleksanderkrasilnikov.homework2;

public class LabWork153 {
    public static void main(String[] args) {

        System.out.println("* | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |");
        System.out.println("--|---|---|---|---|---|---|---|---|---|");

        for (int i = 1; i<=9; i++){
            System.out.print(i + " |");
            for (int j = 1; j<=9; j++){
                if ((Integer.toString(j*i).length()==2)&(j*i)<10){
                System.out.print(" " + j*i+ "| ");
                }
                else if (Integer.toString(j*i).length()==2){
                    System.out.print("" + j*i + " |");
                }else {
                    System.out.print(" " + j*i + " |");
                }
            }
            System.out.println();
        }
    }
}
