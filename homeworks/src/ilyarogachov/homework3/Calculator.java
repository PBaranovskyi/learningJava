package ilyarogachov.homework3;

/**
 * Created by rogachev on 25.04.17.
 */
public class Calculator {

    public static double calculateArea(Triangle t){
        double s = (t.getP1().getPointa() - t.getP3().getPointa()) *
                (t.getP2().getPointb() - t.getP3().getPointb()) - (t.getP2().getPointa() - t.getP3().getPointa()) *
                (t.getP1().getPointb() - t.getP3().getPointb());
        s=s/2;
        return s;
    }

    public static double calculatePerimetr(Triangle t){
        double side1;
        double side2;
        double side3;
        side1=getLong(t.getP1(),t.getP2());
        side2=getLong(t.getP2(),t.getP3());
        side3=getLong(t.getP3(),t.getP1());
        return (side1+side2+side3);
    }

    private static double getLong(Point one, Point two){
        double onetwo;
        double onetwox=one.getPointa()-two.getPointa();
        onetwox=Math.pow(onetwox,2);
        double onetwoy=one.getPointb()-two.getPointb();
        onetwoy=Math.pow(onetwoy,2);
        onetwo=Math.sqrt(onetwox+onetwoy);
        return(onetwo);
    }
}
