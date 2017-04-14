package irynagrabovska.LabWork1;

/**
 * Created by whisper on 09-Apr-17.
 */
public class LabWork142 {
    public static void main(String[] args) {
        int Primitive1 = 4;
        double Primitive2 = 45.4;
        float Primitive3 = 5454.3f;

        double Result1 = (double) Primitive1 + Primitive2;
        double Result2 = (double) Primitive3 - Primitive2;
        double Result3 = (double) Primitive1/Primitive2;
        int Result4 = Primitive1%(int)Primitive3;

        System.out.println(Result1);
        System.out.println(Result2);
        System.out.println(Result3);
        System.out.println(Result4);

    }
}
