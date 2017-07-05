package oleksanderkrasilnikov.homework8;

/**
 * Created by Krasilnikov on 07.06.2017.
 */
public class LabWork278 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("RED",12,22);
        System.out.println(rectangle.toString());
        System.out.println("Shape area is: " + rectangle.calcArea());
    }
}
