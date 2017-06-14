package andriiarzhanov.module10;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by arzhanov on 05.06.17.
 */
public class main {
    public static void main(String[] args) {
        MyWindow window = new MyWindow(0.8, 1.2, 2, "blue", false);
        MyWindow window1 = new MyWindow(0.6, 1.0, 3, "green", false);
        MyWindow window2 = new MyWindow(0.7, 1.1, 1, "blue", true);
        MyWindow window3 = new MyWindow(0.9, 1.3, 2, "green", false);
        MyWindow window4 = new MyWindow(0.8, 1.0, 3, "blue", false);
        MyWindow window5 = new MyWindow();
        MyWindow window6 = new MyWindow(1.1, 1.8);
        MyWindow window7 = new MyWindow(0.4, 1.0, 3);

        List<MyWindow> myWindowList = new ArrayList<>();

        myWindowList.add(window);
        myWindowList.add(window1);
        myWindowList.add(window2);
        myWindowList.add(window3);
        myWindowList.add(window4);
        myWindowList.add(window5);
        myWindowList.add(window6);
        myWindowList.add(window7);

        for (MyWindow myWindow : myWindowList) {
            myWindow.printFields();
        }
    }
}
