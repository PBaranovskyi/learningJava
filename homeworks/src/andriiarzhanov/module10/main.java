package andriiarzhanov.module10;

/**
 * Created by arzhanov on 05.06.17.
 */
public class main {
    public static void main(String[] args) {
        MyWindow window = new MyWindow(0.8, 1.2, 2, "blue", false);
        window.printFields();
        MyWindow window1 = new MyWindow(0.6, 1.0, 3, "green", false);
        window1.printFields();
        MyWindow window2 = new MyWindow(0.7, 1.1, 1, "blue", true);
        window2.printFields();
        MyWindow window3 = new MyWindow(0.9, 1.3, 2, "green", false);
        window3.printFields();
        MyWindow window4 = new MyWindow(0.8, 1.0, 3, "blue", false);
        window4.printFields();
        MyWindow window5 = new MyWindow();
        window5.printFields();
    }
}
