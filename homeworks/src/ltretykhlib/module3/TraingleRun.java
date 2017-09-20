package ltretykhlib.module3;

/**
 * Created by Tretykhlib on 23.04.2017.
 */
public class TraingleRun {
    public static void main(String[] args) {
        Triangle newTriangle=new Triangle(2,3,1,1,4,1);
        newTriangle.view();
        newTriangle.perimeter();
        newTriangle.square();
        newTriangle.updateTops(2,3,0,1,4,5);
    }
}
