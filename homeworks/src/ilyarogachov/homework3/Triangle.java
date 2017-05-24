package ilyarogachov.homework3;

/**
 * Created by Tom on 24.04.2017.
 */
public class Triangle {

    private Point p1;
    private Point p2;
    private Point p3;

    private Validator validator = new Validator();

    public Triangle(Point p1, Point p2, Point p3) {
        if (validator.validate(p1, p2, p3)) {
            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
        }else {
            throw new IllegalArgumentException("Can't create triangle");
        }
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }
}