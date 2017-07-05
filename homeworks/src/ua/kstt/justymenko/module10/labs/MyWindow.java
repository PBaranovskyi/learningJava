package ua.kstt.justymenko.module10.labs;

import java.util.ArrayList;

/**
 * Created by n1kropol on 6/2/17.
 */
public class MyWindow {
    private double width;
    private double height;
    private int numberOfGlass;
    private String color;
    private boolean isOpen;

    public MyWindow() {
        this.width = 5.0;
        this.height = 7.5;
        this.numberOfGlass = 3;
        this.color = "red";
        this.isOpen = false;
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

    public MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen) {
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = color;
        this.isOpen = isOpen;
    }

    public void printFields(){
        if (width > 0)
            System.out.print(" width: " + width);
        if (height > 0)
            System.out.print(" height: " + height);
        if (numberOfGlass > 0)
            System.out.print(" numbnerOfGlass: " + numberOfGlass);
        if (color != null && !color.isEmpty())
            System.out.print(" color: " + color);
        if (isOpen)
            System.out.print(" isOpen: " + isOpen);
        System.out.println();
    }

    public static void main(String[] args) {

        MyWindow[] windowArray = new MyWindow[4];
        MyWindow myWindow1 = new MyWindow(1.1, 2.2, 1, "white", true);
        MyWindow myWindow2 = new MyWindow(1.1, 2.2, 2, "red", true);
        MyWindow myWindow3 = new MyWindow(1.1, 2.2, 3, "black", false);
        MyWindow myWindow4 = new MyWindow(1.1, 2.2, 4, "brown", true);
        MyWindow myWindow5 = new MyWindow(1.1, 2.2, 5, "grey", false);

        MyWindow myWindowDefaultConstrucor = new MyWindow();

        MyWindow myWindow6 = new MyWindow(3.3, 4.4);
        MyWindow myWindow7 = new MyWindow(5.5,6.6,4);

        ArrayList<MyWindow> list = new ArrayList();
        list.add(myWindow1);
        list.add(myWindow2);
        list.add(myWindow3);
        list.add(myWindow4);
        list.add(myWindow5);
        list.add(myWindowDefaultConstrucor);
        list.add(myWindow6);
        list.add(myWindow7);

        windowArray[0] = new MyWindow();
        windowArray[1] = new MyWindow(12.0, 15.5);
        windowArray[2] = new MyWindow(11.0, 13.0, 5);
        windowArray[3] = new MyWindow(21.2, 23.3, 5, "yellow", true);

        for (MyWindow myWindow : list) {
            myWindow.printFields();
        }
        System.out.println();
        for (MyWindow myWindow : windowArray) {
            myWindow.printFields();
        }
    }
}
