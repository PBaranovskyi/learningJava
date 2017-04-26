package irastolyarchuk.module1.example.lesson4;

/**
 * Created by Iryna Stoliarchuk on 24.04.2017.
 */
public class UseArray {
    public static void main(String[] args) {
        int [] intArray=new int [10];
       for (int i=0;i<intArray.length;i++){
           System.out.printf("index:"+1);

           int item=intArray[i];
           System.out.printf("array elementa:"+item);

       }


        for (int item: intArray){
            System.out.println(item);
        }

    }
}
