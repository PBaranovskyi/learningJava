package kpobozhny.homework.labwork_2_7.labwork_2_7_6;

/**
 * Created by kostya on 5/28/17.
 */
public class Rectangle extends Shape{

    private double width;
    private double height;

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

    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea() {

        return width*height;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ", color is: "+getShapeColor()+", width="+width+", height="+height;
    }





}
