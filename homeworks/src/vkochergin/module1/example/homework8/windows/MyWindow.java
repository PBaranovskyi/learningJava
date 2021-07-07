package vkochergin.module1.example.homework8.windows;

/**
 * Created by Volodymyr Kochergin on 08.06.2017.
 */
public class MyWindow {
    private double width;
    private double height;
    private int numberOfGlass;
    private String color;
    private boolean isOpen;

    public MyWindow() {
        width = 100.0;
        height = 180.0;
        numberOfGlass = 2;
        color = "default";
        isOpen = false;
    }

    public MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen) {
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = color;
        this.isOpen = isOpen;
    }

    public MyWindow(double width, double height) {
        this();
        this.width = width;
        this.height = height;
    }

    public MyWindow(double width, double height, int numberOfGlass) {
        this();
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
    }

    public void printFields(){
        System.out.println("Window" + ": width: " + width + ", heigth: "
                + height + ", number of glasses: " + numberOfGlass
                + ", color: " + color + ", is open: " + isOpen);
    }

}
