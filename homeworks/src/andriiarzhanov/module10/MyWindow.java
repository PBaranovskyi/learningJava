package andriiarzhanov.module10;

/**
 * Created by arzhanov on 05.06.17.
 */
public class MyWindow {
    private double width;
    private double height;
    private int numberOfGlass;
    private String color;
    private boolean isOpen;

    public MyWindow() {
        setWidth(1.0);
        setHeight(1.4);
        setColor("white");
        setNumberOfGlass(2);
        setOpen(false);
    }

    public MyWindow(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public MyWindow(double width, double height, int numberOfGlass) {
        setWidth(width);
        setHeight(height);
        setNumberOfGlass(numberOfGlass);
    }

    public MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen) {
        setWidth(width);
        setHeight(height);
        setNumberOfGlass(numberOfGlass);
        setColor(color);
        setOpen(isOpen);
    }

    public void printFields() {
        System.out.println("Window, width: " + getWidth() + ", height: " + getHeight() + ", number of glasses: " + getNumberOfGlass() + ", color: " + getColor() + ", is open: " + isOpen());
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

    public int getNumberOfGlass() {
        return numberOfGlass;
    }

    public void setNumberOfGlass(int numberOfGlass) {
        this.numberOfGlass = numberOfGlass;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
}
