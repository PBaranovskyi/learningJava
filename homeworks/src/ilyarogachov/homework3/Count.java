package ilyarogachov.homework3;

import java.util.Objects;

/**
 * Created by Tom on 24.04.2017.
 */
public class Count {
    double s;
    double p;
    public double getArea( Points one, Points two, Points three){
        s=(one.getPointa()-three.getPointa())*(two.getPointb()-three.getPointb())-(two.getPointa()-three.getPointa())*(one.getPointb()-three.getPointb());
        s=s/2;
        return s;
    }
    public  double getPerimetr(Points one, Points two, Points three){
        double x;
        double y;
        double z;
        x=one.getPointa()-two.getPointa();
        x=Math.pow(x,2);
        return (x);


    }
}
