package oleksanderkrasilnikov.homework8;

/**
 * Created by Krasilnikov on 07.06.2017.
 */
public class LabWork279 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle("BLACK", 12,22,33);
        System.out.println(triangle.toString());
        System.out.println("Shape area is: " + triangle.calcArea());
    }
}
