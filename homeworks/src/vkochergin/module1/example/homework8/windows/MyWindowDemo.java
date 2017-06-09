package vkochergin.module1.example.homework8.windows;

/**
 * Created by Volodymyr Kochergin on 08.06.2017.
 */
public class MyWindowDemo {
    public static void main(String[] args) {
        MyWindow whiteWindow = new MyWindow(50,75,1,"white", false);
        MyWindow greenWindow = new MyWindow(60,80,2,"green",true);
        MyWindow yellowWindow = new MyWindow(100,225,3,"yellow",false);
        MyWindow blackWindow = new MyWindow(100, 170, 2,"black", true);
        MyWindow blueWindow = new MyWindow(120, 220,3,"blue", false);
        MyWindow defaultWindow = new MyWindow();
        MyWindow windowWithWidthAndHeight = new MyWindow(120,200);
        MyWindow windowWithWidthHeightAndNumberOfGlasses = new MyWindow(50,70,1);

        whiteWindow.printFields();
        greenWindow.printFields();
        yellowWindow.printFields();
        blackWindow.printFields();
        blueWindow.printFields();
        defaultWindow.printFields();
        windowWithWidthAndHeight.printFields();
        windowWithWidthHeightAndNumberOfGlasses.printFields();

        MyWindow[] windows = new MyWindow[3];
        windows[0] = new MyWindow(100,200,3,"blue",false);
        windows[1] = new MyWindow();
        windows[2] = new MyWindow(200,300,4);

        System.out.println();

        for (MyWindow window: windows) {
            window.printFields();
        }
    }
}
