package bogdanh.com.kstt.week1.hw1;

public class LabWork148 {

    public static void main(String[] args) {

        double var1 = 10100.1;
        int var2 = (int) var1;
        char var3 = (char) var2;
        byte var4 = (byte) var3;

        long var5 = var3;

        long var6 = 111111111111L;
        float var7 = var6;
        var6 = (long) var7;


        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);
        System.out.println(var6);
    }
}

