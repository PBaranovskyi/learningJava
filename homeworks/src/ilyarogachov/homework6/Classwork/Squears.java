package ilyarogachov.homework6.Classwork;

/**
 * Created by rogachev on 31.05.17.
 */
public class Squears extends Reatangle {
    double a1;

    public Squears( double a1) {
        super(0, 0);
        this.a1 = a1;
    }


    @Override
    public double getArea (){
        return this.a1*this.a1;
    }
}
