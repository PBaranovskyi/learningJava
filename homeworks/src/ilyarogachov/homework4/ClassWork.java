package ilyarogachov.homework4;

import java.util.Arrays;

/**
 * Created by Tom on 26.04.2017.
 */
public class ClassWork {

    public static void main(String[] args) {

    int[] m = new int[] { 10, 21, 5};

    int[] f = autoadd(8,m);
    f=autoadd(47,f);
    for (int i=0;i<f.length;i++){
        System.out.println(f[i]);
    }
    }
    public static int []  autoadd(int a, int[] arr){
        int []  k = Arrays.copyOf(arr,arr.length+1);
        arr = Arrays.copyOf(k,k.length);
        arr[arr.length-1]=a;
        return arr;
    }

}
