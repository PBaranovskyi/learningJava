package oleksanderkrasilnikov.homework8;

/**
 * Created by Krasilnikov on 07.06.2017.
 */
public class LabWork277 {
    public static void main(String[] args) {
        Circle circle = new Circle("GREEN", 19);
        System.out.println(circle.toString());
        System.out.println("Shape area is: " + circle.calcArea());
    }
}
