package andriiarzhanov.module8.MyShapes;

/**
 * Created by arzhanov on 24.05.17.
 */
public class Shape {
    private String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public String getShapeColor() {
        return shapeColor;
    }

    public void setShapeColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    @Override
    public String toString() {
        return "Shape, color is: "+getShapeColor();
    }

    public double calsArea() {
        return 0.;
    }
}
