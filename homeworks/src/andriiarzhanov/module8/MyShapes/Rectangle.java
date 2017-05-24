package andriiarzhanov.module8.MyShapes;

/**
 * Created by arzhanov on 24.05.17.
 */
public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "This is Rectangle, color: " + getShapeColor() + ", width=" + getWidth() + ", height=" + getHeight();
    }

    @Override
    public double calsArea() {
        return getWidth() * getHeight();
    }
}
