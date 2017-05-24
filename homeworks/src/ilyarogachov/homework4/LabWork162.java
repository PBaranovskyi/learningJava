package ilyarogachov.homework4;

/**
 * Created by Tom on 26.04.2017.
 */
public class LabWork162 {
    public static void main(String[] args) {
        int[] m = new int[] { 10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14 };
        int max=0;
        int min=m[2];
        for(int i=0;i<m.length;i++){
            if(m[i]>max){
                max=m[i];
            }
            if(m[i]<min){
                min=m[i];
            }

        }
        System.out.println("Max = " + max + " Min = " + min);
    }
}
