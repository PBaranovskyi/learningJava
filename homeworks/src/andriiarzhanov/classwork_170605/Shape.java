package andriiarzhanov.classwork_170605;

/**
 * Created by arzhanov on 05.06.17.
 */
public class Shape {
    private String color = "red";
    private boolean filled = true;
    final static double PI = 3.14;

    public Shape() {
        setColor("green");
        setFilled(true);
    }

    public Shape(String color, boolean filled) {
        setColor(color);
        setFilled(filled);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        String filled;
        if (!isFilled()) {
            filled = "Not filled";
        } else {
            filled = "filled";
        }
        return "A Shape with color of " + getColor() + " and " + filled;
    }
}
