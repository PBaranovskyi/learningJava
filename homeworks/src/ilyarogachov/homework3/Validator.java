package ilyarogachov.homework3;

import java.util.Objects;

/**
 * Created by Tom on 24.04.2017.
 */
public class Validator {

    public boolean validate(Point one, Point two, Point three){
        if ((one.getPointa() - two.getPointa())/(three.getPointa()-two.getPointb())==(one.getPointb()-two.getPointb())/(three.getPointb()-two.getPointb())) {
            System.out.println("Input is incorrect - points on one line, we have changed points position to 0");
            return false;
        } else {
            System.out.println("All is fine, you can work with this positions");
            return true;
        }
    }
}
