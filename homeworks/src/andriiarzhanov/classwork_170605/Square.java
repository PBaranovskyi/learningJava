package andriiarzhanov.classwork_170605;

/**
 * Created by arzhanov on 05.06.17.
 */
public class Square extends Rectangle {
    private double side;

    public Square() {
    }

    public Square(double side) {
        setSide(side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }
}
