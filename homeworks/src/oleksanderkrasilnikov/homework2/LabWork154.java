package oleksanderkrasilnikov.homework2;

public class LabWork154 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i<300; i++){
            if (count == 10){
                break;
            }else if (i%3 == 0){
                System.out.println(i);
                count++;
            }else if (i%4 == 0){
                System.out.println(i);
                count++;
            }
        }
    }
}
