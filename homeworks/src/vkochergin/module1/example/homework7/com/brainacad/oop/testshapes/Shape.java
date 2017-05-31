package vkochergin.module1.example.homework7.com.brainacad.oop.testshapes;

/**
 * Created by Volodymyr Kochergin on 30.05.2017.
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
        return this.getClass().getSimpleName() + ", " + "color is: " + getShapeColor();
    }


    public double calcArea() {
        return 0.0;
    }
}
